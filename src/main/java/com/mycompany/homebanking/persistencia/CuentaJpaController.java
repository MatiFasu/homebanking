
package com.mycompany.homebanking.persistencia;

import com.mycompany.homebanking.logica.Cuenta;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.homebanking.logica.Transferencia;
import com.mycompany.homebanking.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CuentaJpaController implements Serializable {

    public CuentaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public CuentaJpaController() {
        emf = Persistence.createEntityManagerFactory("homebanking_PU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cuenta cuenta) {
        if (cuenta.getTransferencias() == null) {
            cuenta.setTransferencias(new ArrayList<Transferencia>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Transferencia> attachedTransferencias = new ArrayList<Transferencia>();
            for (Transferencia transferenciasTransferenciaToAttach : cuenta.getTransferencias()) {
                transferenciasTransferenciaToAttach = em.getReference(transferenciasTransferenciaToAttach.getClass(), transferenciasTransferenciaToAttach.getId());
                attachedTransferencias.add(transferenciasTransferenciaToAttach);
            }
            cuenta.setTransferencias(attachedTransferencias);
            em.persist(cuenta);
            for (Transferencia transferenciasTransferencia : cuenta.getTransferencias()) {
                Cuenta oldCuentaOrigenOfTransferenciasTransferencia = transferenciasTransferencia.getCuentaOrigen();
                transferenciasTransferencia.setCuentaOrigen(cuenta);
                transferenciasTransferencia = em.merge(transferenciasTransferencia);
                if (oldCuentaOrigenOfTransferenciasTransferencia != null) {
                    oldCuentaOrigenOfTransferenciasTransferencia.getTransferencias().remove(transferenciasTransferencia);
                    oldCuentaOrigenOfTransferenciasTransferencia = em.merge(oldCuentaOrigenOfTransferenciasTransferencia);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cuenta cuenta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cuenta persistentCuenta = em.find(Cuenta.class, cuenta.getId());
            List<Transferencia> transferenciasOld = persistentCuenta.getTransferencias();
            List<Transferencia> transferenciasNew = cuenta.getTransferencias();
            List<Transferencia> attachedTransferenciasNew = new ArrayList<Transferencia>();
            for (Transferencia transferenciasNewTransferenciaToAttach : transferenciasNew) {
                transferenciasNewTransferenciaToAttach = em.getReference(transferenciasNewTransferenciaToAttach.getClass(), transferenciasNewTransferenciaToAttach.getId());
                attachedTransferenciasNew.add(transferenciasNewTransferenciaToAttach);
            }
            transferenciasNew = attachedTransferenciasNew;
            cuenta.setTransferencias(transferenciasNew);
            cuenta = em.merge(cuenta);
            for (Transferencia transferenciasOldTransferencia : transferenciasOld) {
                if (!transferenciasNew.contains(transferenciasOldTransferencia)) {
                    transferenciasOldTransferencia.setCuentaOrigen(null);
                    transferenciasOldTransferencia = em.merge(transferenciasOldTransferencia);
                }
            }
            for (Transferencia transferenciasNewTransferencia : transferenciasNew) {
                if (!transferenciasOld.contains(transferenciasNewTransferencia)) {
                    Cuenta oldCuentaOrigenOfTransferenciasNewTransferencia = transferenciasNewTransferencia.getCuentaOrigen();
                    transferenciasNewTransferencia.setCuentaOrigen(cuenta);
                    transferenciasNewTransferencia = em.merge(transferenciasNewTransferencia);
                    if (oldCuentaOrigenOfTransferenciasNewTransferencia != null && !oldCuentaOrigenOfTransferenciasNewTransferencia.equals(cuenta)) {
                        oldCuentaOrigenOfTransferenciasNewTransferencia.getTransferencias().remove(transferenciasNewTransferencia);
                        oldCuentaOrigenOfTransferenciasNewTransferencia = em.merge(oldCuentaOrigenOfTransferenciasNewTransferencia);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = cuenta.getId();
                if (findCuenta(id) == null) {
                    throw new NonexistentEntityException("The cuenta with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cuenta cuenta;
            try {
                cuenta = em.getReference(Cuenta.class, id);
                cuenta.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cuenta with id " + id + " no longer exists.", enfe);
            }
            List<Transferencia> transferencias = cuenta.getTransferencias();
            for (Transferencia transferenciasTransferencia : transferencias) {
                transferenciasTransferencia.setCuentaOrigen(null);
                transferenciasTransferencia = em.merge(transferenciasTransferencia);
            }
            em.remove(cuenta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cuenta> findCuentaEntities() {
        return findCuentaEntities(true, -1, -1);
    }

    public List<Cuenta> findCuentaEntities(int maxResults, int firstResult) {
        return findCuentaEntities(false, maxResults, firstResult);
    }

    private List<Cuenta> findCuentaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cuenta.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Cuenta findCuenta(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cuenta.class, id);
        } finally {
            em.close();
        }
    }

    public int getCuentaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cuenta> rt = cq.from(Cuenta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
