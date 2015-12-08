package org.springframework.samples.petclinic.dao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.springframework.samples.petclinic.model.Owner;

//@RunWith(MockitoJUnitRunner.class)
public class OwnerRepositoryTest {
	@Mock
	Owner owner;
	//@Spy
 	@InjectMocks
	OwnerRepositoryImpl ownerRepositoryImpl = new OwnerRepositoryImpl();
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void testFindByLastName() {
//		Owner owner1 = new Owner();
//		Owner owner = new Owner();
//
//		owner1.setAddress("dd");
//		owner1.setCity("beijing");
//		owner1.setFirstName("mike");
//	    doNothing().when(owner).setAddress("dd");
//		doNothing().when(owner).setCity("beijing");
//		doNothing().when(owner).setFirstName("mike");

//		when(ownerRepositoryImpl.getOwner(anyString())).thenReturn(owner);

//		System.out.println(owner);
//		assertSame(ownerExp, owner);
	}
}

