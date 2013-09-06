/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.persistencia.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author celio_henrique
 */
public interface DAO <T, I extends Serializable>{

    public boolean save (T entity);
    
    public boolean remove(Class<T> classe, I pk);
    
    public T getById( Class<T> classe, I pk);
    
    public List <T> getAll (Class<T> classe);
    
    public EntityManager getEntityManager();
    
}
