
package com.mycompany.homebanking.persistencia;

import com.mycompany.homebanking.logica.Cliente;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.homebanking.logica.Tarjeta;
import com.mycompany.homebanking.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ClienteJpaController implements Serializable {

    public ClienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public ClienteJpaController() {
        emf = Persistence.createEntityManagerFactory("homebanking_PU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cliente cliente) {
        if (cliente.getTarjetas() == null) {
            cliente.setTarjetas(new ArrayList<Tarjeta>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Tarjeta> attachedTarjetas = new ArrayList<Tarjeta>();
            for (Tarjeta tarjetasTarjetaToAttach : cliente.getTarjetas()) {
                tarjetasTarjetaToAttach = em.getReference(tarjetasTarjetaToAttach.getClass(), tarjetasTarjetaToAttach.getId());
                attachedTarjetas.add(tarjetasTarjetaToAttach);
            }
            cliente.setTarjetas(attachedTarjetas);
            em.persist(cliente);
            for (Tarjeta tarjetasTarjeta : cliente.getTarjetas()) {
                Cliente oldUnClienteOfTarjetasTarjeta = tarjetasTarjeta.getUnCliente();
                tarjetasTarjeta.setUnCliente(cliente);
                tarjetasTarjeta = em.merge(tarjetasTarjeta);
                if (oldUnClienteOfTarjetasTarjeta != null) {
                    oldUnClienteOfTarjetasTarjeta.getTarjetas().remove(tarjetasTarjeta);
                    oldUnClienteOfTarjetasTarjeta = em.merge(oldUnClienteOfTarjetasTarjeta);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cliente cliente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente persistentCliente = em.find(Cliente.class, cliente.getId());
            List<Tarjeta> tarjetasOld = persistentCliente.getTarjetas();
            List<Tarjeta> tarjetasNew = cliente.getTarjetas();
            List<Tarjeta> attachedTarjetasNew = new ArrayList<Tarjeta>();
            for (Tarjeta tarjetasNewTarjetaToAttach : tarjetasNew) {
                tarjetasNewTarjetaToAttach = em.getReference(tarjetasNewTarjetaToAttach.getClass(), tarjetasNewTarjetaToAttach.getId());
                attachedTarjetasNew.add(tarjetasNewTarjetaToAttach);
            }
            tarjetasNew = attachedTarjetasNew;
            cliente.setTarjetas(tarjetasNew);
            cliente = em.merge(cliente);
            for (Tarjeta tarjetasOldTarjeta : tarjetasOld) {
                if (!tarjetasNew.contains(tarjetasOldTarjeta)) {
                    tarjetasOldTarjeta.setUnCliente(null);
                    tarjetasOldTarjeta = em.merge(tarjetasOldTarjeta);
                }
            }
            for (Tarjeta tarjetasNewTarjeta : tarjetasNew) {
                if (!tarjetasOld.contains(tarjetasNewTarjeta)) {
                    Cliente oldUnClienteOfTarjetasNewTarjeta = tarjetasNewTarjeta.getUnCliente();
                    tarjetasNewTarjeta.setUnCliente(cliente);
                    tarjetasNewTarjeta = em.merge(tarjetasNewTarjeta);
                    if (oldUnClienteOfTarjetasNewTarjeta != null && !oldUnClienteOfTarjetasNewTarjeta.equals(cliente)) {
                        oldUnClienteOfTarjetasNewTarjeta.getTarjetas().remove(tarjetasNewTarjeta);
                        oldUnClienteOfTarjetasNewTarjeta = em.merge(oldUnClienteOfTarjetasNewTarjeta);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = cliente.getId();
                if (findCliente(id) == null) {
                    throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.");
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
            Cliente cliente;
            try {
                cliente = em.getReference(Cliente.class, id);
                cliente.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.", enfe);
            }
            List<Tarjeta> tarjetas = cliente.getTarjetas();
            for (Tarjeta tarjetasTarjeta : tarjetas) {
                tarjetasTarjeta.setUnCliente(null);
                tarjetasTarjeta = em.merge(tarjetasTarjeta);
            }
            em.remove(cliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cliente> findClienteEntities() {
        return findClienteEntities(true, -1, -1);
    }

    public List<Cliente> findClienteEntities(int maxResults, int firstResult) {
        return findClienteEntities(false, maxResults, firstResult);
    }

    private List<Cliente> findClienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cliente.class));
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

    public Cliente findCliente(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cliente.class, id);
        } finally {
            em.close();
        }
    }

    public int getClienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cliente> rt = cq.from(Cliente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
