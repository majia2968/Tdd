package org.springframework.samples.petclinic.dao;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.PetType;

public interface PetTypeRepository {
	
	public PetType findById(int id) throws DataAccessException;

}
