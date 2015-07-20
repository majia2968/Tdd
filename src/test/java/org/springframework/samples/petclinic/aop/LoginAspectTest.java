package org.springframework.samples.petclinic.aop;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.web.LoginController;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/mvc-core-config.xml" })
public class LoginAspectTest {
    
	@Autowired
	private LoginController loginController;
	
	 private MockMvc mockMvc;

	    @Before
	    public void setup() {
	        this.mockMvc = MockMvcBuilders.standaloneSetup(loginController).build();
	    }
    
	@Test   
    public void testWelcomeAdvice() {
		loginController.welcome();
    }
}
