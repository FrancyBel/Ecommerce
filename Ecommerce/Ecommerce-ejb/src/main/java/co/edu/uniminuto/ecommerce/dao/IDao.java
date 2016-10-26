package co.edu.uniminuto.ecommerce.dao;

import javax.persistence.PersistenceException;

/**
 *
 * @author miguel.camargo
 */
public interface IDao {

    public abstract <T> T persist(T entity) throws PersistenceException;

    public abstract <T> T update(T entity) throws PersistenceException;

    public abstract <T> void delete(T entity) throws PersistenceException;

    public abstract <T> T findAll(String namedQuery) throws PersistenceException;
}
