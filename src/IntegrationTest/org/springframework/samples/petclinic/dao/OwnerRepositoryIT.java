package org.springframework.samples.petclinic.dao;

import org.junit.Test;
import org.springframework.samples.petclinic.service.ClinicService;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/mvc-core-config.xml", "classpath*:spring/business-config.xml"})
@ActiveProfiles("jpa")
public class OwnerRepositoryIT {

	@Autowired
	private OwnerRepository ownerRepositoryImpl;
	@Autowired
	private ClinicService clinicService;
	
	@Test
	public void testFindByLastName1() {	
		System.out.println(clinicService.findOwnerById(1).getFirstName());	
	}
	
	@Test
	public void testFindByLastName() {	
		System.out.println(clinicService.findOwnerByLastName("D"));	
	}
}