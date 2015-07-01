package org.springframework.samples.petclinic.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.service.LoginService;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class LoginController {
	
	protected static Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private LoginService loginService;

	@RequestMapping("/welcome")
	public String login(Model model) {
		return "login";
	}

	@RequestMapping("/login")  
	public ModelAndView onLogin(ModelMap model, HttpServletRequest request, HttpServletResponse res) {
	    String name = request.getParameter("name");  
	    String password = request.getParameter("password");  
	    
		if (!loginService.isValid()) {
			model.addAttribute("error", "Invalid user name and password");
			return new ModelAndView("relogin", model);
			}
		String userName = loginService.retrieveName();
		model.addAttribute("name", "Welcome "+userName+"!");
		return new ModelAndView("greetings", model);
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	 public String getLoginPage(@RequestParam(value="error", required=false) boolean error, 
	   ModelMap model) {
	  logger.debug("Received request to show login page");

	  // Add an error message to the model if login is unsuccessful
	  // The 'error' parameter is set to true based on the when the authentication has failed. 
	  // We declared this under the authentication-failure-url attribute inside the spring-security.xml
	  /* See below:
	   <form-login 
	    login-page="/krams/auth/login" 
	    authentication-failure-url="/krams/auth/login?error=true" 
	    default-target-url="/krams/main/common"/>*/
	  if (error == true) {
	   // Assign an error message
	   model.put("error", "You have entered an invalid username or password!");
	  } else {
	   model.put("error", "");
	  }
	  
	  // This will resolve to /WEB-INF/jsp/loginpage.jsp
	  return "loginpage";
	 }
	
	@RequestMapping(value = "/denied", method = RequestMethod.GET)
	  public String getDeniedPage() {
	  logger.debug("Received request to show denied page");
	  
	  // This will resolve to /WEB-INF/jsp/deniedpage.jsp
	  return "deniedpage";
	 }

}
