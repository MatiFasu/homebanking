
package com.mycompany.homebanking.persistencia;

import com.mycompany.homebanking.logica.CuentaCorriente;
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


public class CuentaCorrienteJpaController implements Serializable {

    public CuentaCorrienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public CuentaCorrienteJpaController() {
        emf = Persistence.createEntityManagerFactory("homebanking_PU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(CuentaCorriente cuentaCorriente) {
        if (cuentaCorriente.getTransferencias() == null) {
            cuentaCorriente.setTransferencias(new ArrayList<Transferencia>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Transferencia> attachedTransferencias = new ArrayList<Transferencia>();
            for (Transferencia transferenciasTransferenciaToAttach : cuentaCorriente.getTransferencias()) {
                transferenciasTransferenciaToAttach = em.getReference(transferenciasTransferenciaToAttach.getClass(), transferenciasTransferenciaToAttach.getId());
                attachedTransferencias.add(transferenciasTransferenciaToAttach);
            }
            cuentaCorriente.setTransferencias(attachedTransferencias);
            em.persist(cuentaCorriente);
            for (Transferencia transferenciasTransferencia : cuentaCorriente.getTransferencias()) {
                com.mycompany.homebanking.logica.Cuenta oldCuentaOrigenOfTransferenciasTransferencia = transferenciasTransferencia.getCuentaOrigen();
                transferenciasTransferencia.setCuentaOrigen(cuentaCorriente);
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

    public void edit(CuentaCorriente cuentaCorriente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            CuentaCorriente persistentCuentaCorriente = em.find(CuentaCorriente.class, cuentaCorriente.getId());
            List<Transferencia> transferenciasOld = persistentCuentaCorriente.getTransferencias();
            List<Transferencia> transferenciasNew = cuentaCorriente.getTransferencias();
            List<Transferencia> attachedTransferenciasNew = new ArrayList<Transferencia>();
            for (Transferencia transferenciasNewTransferenciaToAttach : transferenciasNew) {
                transferenciasNewTransferenciaToAttach = em.getReference(transferenciasNewTransferenciaToAttach.getClass(), transferenciasNewTransferenciaToAttach.getId());
                attachedTransferenciasNew.add(transferenciasNewTransferenciaToAttach);
            }
            transferenciasNew = attachedTransferenciasNew;
            cuentaCorriente.setTransferencias(transferenciasNew);
            cuentaCorriente = em.merge(cuentaCorriente);
            for (Transferencia transferenciasOldTransferencia : transferenciasOld) {
                if (!transferenciasNew.contains(transferenciasOldTransferencia)) {
                    transferenciasOldTransferencia.setCuentaOrigen(null);
                    transferenciasOldTransferencia = em.merge(transferenciasOldTransferencia);
                }
            }
            for (Transferencia transferenciasNewTransferencia : transferenciasNew) {
                if (!transferenciasOld.contains(transferenciasNewTransferencia)) {
                    CuentaCorriente oldCuentaOrigenOfTransferenciasNewTransferencia = (CuentaCorriente) transferenciasNewTransferencia.getCuentaOrigen();
                    transferenciasNewTransferencia.setCuentaOrigen(cuentaCorriente);
                    transferenciasNewTransferencia = em.merge(transferenciasNewTransferencia);
                    if (oldCuentaOrigenOfTransferenciasNewTransferencia != null && !oldCuentaOrigenOfTransferenciasNewTransferencia.equals(cuentaCorriente)) {
                        oldCuentaOrigenOfTransferenciasNewTransferencia.getTransferencias().remove(transferenciasNewTransferencia);
                        oldCuentaOrigenOfTransferenciasNewTransferencia = em.merge(oldCuentaOrigenOfTransferenciasNewTransferencia);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = cuentaCorriente.getId();
                if (findCuentaCorriente(id) == null) {
                    throw new NonexistentEntityException("The cuentaCorriente with id " + id + " no longer exists.");
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
            CuentaCorriente cuentaCorriente;
            try {
                cuentaCorriente = em.getReference(CuentaCorriente.class, id);
                cuentaCorriente.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cuentaCorriente with id " + id + " no longer exists.", enfe);
            }
            List<Transferencia> transferencias = cuentaCorriente.getTransferencias();
            for (Transferencia transferenciasTransferencia : transferencias) {
                transferenciasTransferencia.setCuentaOrigen(null);
                transferenciasTransferencia = em.merge(transferenciasTransferencia);
            }
            em.remove(cuentaCorriente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<CuentaCorriente> findCuentaCorrienteEntities() {
        return findCuentaCorrienteEntities(true, -1, -1);
    }

    public List<CuentaCorriente> findCuentaCorrienteEntities(int maxResults, int firstResult) {
        return findCuentaCorrienteEntities(false, maxResults, firstResult);
    }

    private List<CuentaCorriente> findCuentaCorrienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(CuentaCorriente.class));
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

    public CuentaCorriente findCuentaCorriente(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(CuentaCorriente.class, id);
        } finally {
            em.close();
        }
    }

    public int getCuentaCorrienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<CuentaCorriente> rt = cq.from(CuentaCorriente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
