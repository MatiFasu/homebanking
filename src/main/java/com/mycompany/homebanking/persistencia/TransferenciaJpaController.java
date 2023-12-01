
package com.mycompany.homebanking.persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.homebanking.logica.Cuenta;
import com.mycompany.homebanking.logica.Transferencia;
import com.mycompany.homebanking.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TransferenciaJpaController implements Serializable {

    public TransferenciaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public TransferenciaJpaController() {
        emf = Persistence.createEntityManagerFactory("homebanking_PU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Transferencia transferencia) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cuenta cuentaOrigen = transferencia.getCuentaOrigen();
            if (cuentaOrigen != null) {
                cuentaOrigen = em.getReference(cuentaOrigen.getClass(), cuentaOrigen.getId());
                transferencia.setCuentaOrigen(cuentaOrigen);
            }
            em.persist(transferencia);
            if (cuentaOrigen != null) {
                cuentaOrigen.getTransferencias().add(transferencia);
                cuentaOrigen = em.merge(cuentaOrigen);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Transferencia transferencia) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Transferencia persistentTransferencia = em.find(Transferencia.class, transferencia.getId());
            Cuenta cuentaOrigenOld = persistentTransferencia.getCuentaOrigen();
            Cuenta cuentaOrigenNew = transferencia.getCuentaOrigen();
            if (cuentaOrigenNew != null) {
                cuentaOrigenNew = em.getReference(cuentaOrigenNew.getClass(), cuentaOrigenNew.getId());
                transferencia.setCuentaOrigen(cuentaOrigenNew);
            }
            transferencia = em.merge(transferencia);
            if (cuentaOrigenOld != null && !cuentaOrigenOld.equals(cuentaOrigenNew)) {
                cuentaOrigenOld.getTransferencias().remove(transferencia);
                cuentaOrigenOld = em.merge(cuentaOrigenOld);
            }
            if (cuentaOrigenNew != null && !cuentaOrigenNew.equals(cuentaOrigenOld)) {
                cuentaOrigenNew.getTransferencias().add(transferencia);
                cuentaOrigenNew = em.merge(cuentaOrigenNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = transferencia.getId();
                if (findTransferencia(id) == null) {
                    throw new NonexistentEntityException("The transferencia with id " + id + " no longer exists.");
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
            Transferencia transferencia;
            try {
                transferencia = em.getReference(Transferencia.class, id);
                transferencia.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The transferencia with id " + id + " no longer exists.", enfe);
            }
            Cuenta cuentaOrigen = transferencia.getCuentaOrigen();
            if (cuentaOrigen != null) {
                cuentaOrigen.getTransferencias().remove(transferencia);
                cuentaOrigen = em.merge(cuentaOrigen);
            }
            em.remove(transferencia);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Transferencia> findTransferenciaEntities() {
        return findTransferenciaEntities(true, -1, -1);
    }

    public List<Transferencia> findTransferenciaEntities(int maxResults, int firstResult) {
        return findTransferenciaEntities(false, maxResults, firstResult);
    }

    private List<Transferencia> findTransferenciaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Transferencia.class));
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

    public Transferencia findTransferencia(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Transferencia.class, id);
        } finally {
            em.close();
        }
    }

    public int getTransferenciaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Transferencia> rt = cq.from(Transferencia.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
