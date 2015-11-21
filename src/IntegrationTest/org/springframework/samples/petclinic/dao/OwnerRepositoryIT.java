package org.springframework.samples.petclinic.dao;
 
import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.samples.petclinic.dao.OwnerRepository;

public class OwnerRepositoryIT {

	@Test
	public void testFindByLastName() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:mvc-core-config.xml");
		OwnerRepository ownerRepository = (OwnerRepository) ctx.getBean("OwnerRepository");
				
	}

}
