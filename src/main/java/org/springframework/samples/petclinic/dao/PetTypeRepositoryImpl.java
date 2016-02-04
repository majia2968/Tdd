package org.springframework.samples.petclinic.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.PetType;
import org.springframework.stereotype.Repository;

@Repository
public class PetTypeRepositoryImpl implements PetTypeRepository{
	
	@PersistenceContext
    private EntityManager em;

	public PetType findById(int id) throws DataAccessException {
		return this.em.find(PetType.class, id);
	}

}
