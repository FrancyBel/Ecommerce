package co.edu.uniminuto.ecommerce.dao.impl;

import java.io.Serializable;
import co.edu.uniminuto.ecommerce.dao.IDao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

/**
 *
 * @author miguel.camargo
 * @param <T>
 */
public class DaoImpl<T> implements IDao, Serializable {

    private static final long serialVersionUID = 1L;

    @PersistenceContext(unitName = "ecommerce")
    protected EntityManager entityManager;

    @Override
    public <T> T persist(T entity) throws PersistenceException {
        try {
            entityManager.persist(entity);
            return entity;
        } catch (Exception e) {
            throw new PersistenceException(e);
        }
    }

    @Override
    public <T> T update(T entity) throws PersistenceException {
        try {
            T object = entityManager.merge(entity);
            return object;
        } catch (Exception e) {
            throw new PersistenceException(e);
        }
    }

    @Override
    public <T> void delete(T entity) throws PersistenceException {
        try {
            entity = entityManager.merge(entity);
            entityManager.remove(entity);
        } catch (Exception e) {
            throw new PersistenceException(e);
        }
    }

    @Override
    public <T> T findAll(String namedQuery) throws PersistenceException {
        List<T> list = new ArrayList<T>();
        try {
            entityManager.createNamedQuery(namedQuery).getResultList();
        } catch (Exception e) {
        }
        return (T) list;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }
}
