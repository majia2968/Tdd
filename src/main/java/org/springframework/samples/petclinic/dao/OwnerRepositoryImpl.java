package org.springframework.samples.petclinic.dao;

import java.util.Collection;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Owner;

public class OwnerRepositoryImpl implements OwnerRepository{
	
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	private Owner owner;

	public Collection<Owner> findByLastName(String lastName)
			throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	public Owner findById(int id) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Owner owner) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}
	
	public Owner getOwner(String name) {
//		Owner owner = new Owner();
		System.out.println("............1...............");
		owner.setAddress("dd");
		System.out.println("............2...............");
		owner.setCity("beijing");
		owner.setFirstName("mike");
		System.out.println("............13...............");
		String city = owner.getCity();
		System.out.println("............2..............." + city);

		return owner;
	}

}
