package org.springframework.samples.petclinic.web;

//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.samples.petclinic.service.LoginService;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.HandlerMapping;

public class LoginControllerTests {

	@InjectMocks
	private LoginController loginController;
	
	@Mock
	private LoginService loginService;

	private MockMvc mockMvc;

	@Before
	public void  setup() {

		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(loginController).build();

	}

	@Test
	public void testLogin() throws Exception{
		mockMvc.perform(get("/auth/welcome"))
		          .andExpect(status().isOk())
	              .andExpect(view().name("login"));

	}
	
	@Test
	public void testGetLoginPage() throws Exception{
		
		mockMvc.perform(get("/auth/login").param("error", "true"))
        .andExpect(status().isOk())
        .andDo(print())
        .andExpect(model().attribute("error", "You have entered an invalid username or password!"))
        .andExpect(view().name("loginpage"));

		mockMvc.perform(get("/auth/login").param("error", "false"))
        .andExpect(status().isOk())
        .andDo(print())
        .andExpect(model().attribute("error", ""))
        .andExpect(view().name("loginpage"));
	}
	
	@Test
	public void testGetDeniedPage() throws Exception{
				
		mockMvc.perform(get("/auth/denied"))
        .andExpect(status().isOk())
        .andExpect(view().name("deniedpage"));

	}
}



