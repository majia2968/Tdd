package org.springframework.samples.petclinic.dao;

import java.util.Collection;
import java.util.Collections;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.stereotype.Repository;

@Repository
public class OwnerRepositoryImpl implements OwnerRepository{
	
    @PersistenceContext
    private EntityManager em;

    public Collection<Owner> findByLastName(String lastName) {
    	Query query  = this.em.createQuery("SELECT DISTINCT owner FROM Owner owner left join fetch owner.pets WHERE lower(owner.lastName) like lower(:lastName)");
    	query.setParameter("lastName", lastName + "%");
    	return query.getResultList();
    }

	public Owner findById(int id) throws DataAccessException {
        Query query = this.em.createQuery("SELECT owner FROM Owner owner left join fetch owner.pets WHERE owner.id =:id");
        query.setParameter("id", id);
        return (Owner) query.getSingleResult();		
    }
	
	public void save(Owner owner) throws DataAccessException {
        if (owner.getId() == null) {
            this.em.persist(owner);
        } else {
            this.em.merge(owner);
        }
	}

}
