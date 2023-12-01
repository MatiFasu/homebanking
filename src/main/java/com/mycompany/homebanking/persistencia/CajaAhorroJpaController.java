
package com.mycompany.homebanking.persistencia;

import com.mycompany.homebanking.logica.CajaAhorro;
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


public class CajaAhorroJpaController implements Serializable {

    public CajaAhorroJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public CajaAhorroJpaController() {
    emf = Persistence.createEntityManagerFactory("homebanking_PU");
    }

    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(CajaAhorro cajaAhorro) {
        if (cajaAhorro.getTransferencias() == null) {
            cajaAhorro.setTransferencias(new ArrayList<Transferencia>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Transferencia> attachedTransferencias = new ArrayList<Transferencia>();
            for (Transferencia transferenciasTransferenciaToAttach : cajaAhorro.getTransferencias()) {
                transferenciasTransferenciaToAttach = em.getReference(transferenciasTransferenciaToAttach.getClass(), transferenciasTransferenciaToAttach.getId());
                attachedTransferencias.add(transferenciasTransferenciaToAttach);
            }
            cajaAhorro.setTransferencias(attachedTransferencias);
            em.persist(cajaAhorro);
            for (Transferencia transferenciasTransferencia : cajaAhorro.getTransferencias()) {
                com.mycompany.homebanking.logica.Cuenta oldCuentaOrigenOfTransferenciasTransferencia = transferenciasTransferencia.getCuentaOrigen();
                transferenciasTransferencia.setCuentaOrigen(cajaAhorro);
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

    public void edit(CajaAhorro cajaAhorro) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            CajaAhorro persistentCajaAhorro = em.find(CajaAhorro.class, cajaAhorro.getId());
            List<Transferencia> transferenciasOld = persistentCajaAhorro.getTransferencias();
            List<Transferencia> transferenciasNew = cajaAhorro.getTransferencias();
            List<Transferencia> attachedTransferenciasNew = new ArrayList<Transferencia>();
            for (Transferencia transferenciasNewTransferenciaToAttach : transferenciasNew) {
                transferenciasNewTransferenciaToAttach = em.getReference(transferenciasNewTransferenciaToAttach.getClass(), transferenciasNewTransferenciaToAttach.getId());
                attachedTransferenciasNew.add(transferenciasNewTransferenciaToAttach);
            }
            transferenciasNew = attachedTransferenciasNew;
            cajaAhorro.setTransferencias(transferenciasNew);
            cajaAhorro = em.merge(cajaAhorro);
            for (Transferencia transferenciasOldTransferencia : transferenciasOld) {
                if (!transferenciasNew.contains(transferenciasOldTransferencia)) {
                    transferenciasOldTransferencia.setCuentaOrigen(null);
                    transferenciasOldTransferencia = em.merge(transferenciasOldTransferencia);
                }
            }
            for (Transferencia transferenciasNewTransferencia : transferenciasNew) {
                if (!transferenciasOld.contains(transferenciasNewTransferencia)) {
                    CajaAhorro oldCuentaOrigenOfTransferenciasNewTransferencia = (CajaAhorro) transferenciasNewTransferencia.getCuentaOrigen();
                    transferenciasNewTransferencia.setCuentaOrigen(cajaAhorro);
                    transferenciasNewTransferencia = em.merge(transferenciasNewTransferencia);
                    if (oldCuentaOrigenOfTransferenciasNewTransferencia != null && !oldCuentaOrigenOfTransferenciasNewTransferencia.equals(cajaAhorro)) {
                        oldCuentaOrigenOfTransferenciasNewTransferencia.getTransferencias().remove(transferenciasNewTransferencia);
                        oldCuentaOrigenOfTransferenciasNewTransferencia = em.merge(oldCuentaOrigenOfTransferenciasNewTransferencia);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = cajaAhorro.getId();
                if (findCajaAhorro(id) == null) {
                    throw new NonexistentEntityException("The cajaAhorro with id " + id + " no longer exists.");
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
            CajaAhorro cajaAhorro;
            try {
                cajaAhorro = em.getReference(CajaAhorro.class, id);
                cajaAhorro.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cajaAhorro with id " + id + " no longer exists.", enfe);
            }
            List<Transferencia> transferencias = cajaAhorro.getTransferencias();
            for (Transferencia transferenciasTransferencia : transferencias) {
                transferenciasTransferencia.setCuentaOrigen(null);
                transferenciasTransferencia = em.merge(transferenciasTransferencia);
            }
            em.remove(cajaAhorro);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<CajaAhorro> findCajaAhorroEntities() {
        return findCajaAhorroEntities(true, -1, -1);
    }

    public List<CajaAhorro> findCajaAhorroEntities(int maxResults, int firstResult) {
        return findCajaAhorroEntities(false, maxResults, firstResult);
    }

    private List<CajaAhorro> findCajaAhorroEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(CajaAhorro.class));
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

    public CajaAhorro findCajaAhorro(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(CajaAhorro.class, id);
        } finally {
            em.close();
        }
    }

    public int getCajaAhorroCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<CajaAhorro> rt = cq.from(CajaAhorro.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
