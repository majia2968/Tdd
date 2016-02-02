package org.springframework.samples.petclinic.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.model.PetType;

public interface PetRepository {
	
	public List<PetType> findPetTypes() throws DataAccessException;
	void save(Pet pet) throws DataAccessException;

}
 