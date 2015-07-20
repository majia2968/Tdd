package org.springframework.samples.petclinic.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	protected static Logger logger = LoggerFactory
			.getLogger(LoginController.class);

	@RequestMapping("/welcome")
	public ModelAndView welcome() {
		ModelAndView model = new ModelAndView();
		System.out.println("system print, welcome to my clinic");
		model.addObject("title", "Spring Security Custom Login Form");
		model.addObject("message", "This is welcome page!");
		model.setViewName("welcome");
		return model;
	}

//	// Spring Security see this :
//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	public ModelAndView login(
//			@RequestParam(value = "error", required = false) String error,
//			@RequestParam(value = "logout", required = false) String logout) {
//		logger.debug("Login .........");
//
//		ModelAndView model = new ModelAndView();
//		if (error != null) {
//			model.addObject("error", "Invalid username and password!");
//		}
//
//		if (logout != null) {
//			model.addObject("msg", "You've been logged out successfully.");
//		}
//		model.setViewName("login");
//
//		return model;
//
//	}

//	@RequestMapping(value = "/logout", method = RequestMethod.GET)
//	public ModelAndView logout(
//			@RequestParam(value = "error", required = false) String error,
//			@RequestParam(value = "logout", required = false) String logout) {
//		logger.debug("Logout .........");
//
//		ModelAndView model = new ModelAndView();
//
//		model.setViewName("logout");
//
//		return model;
//
//	}

	// @RequestMapping("/login")
	// public ModelAndView onLogin(ModelMap model, HttpServletRequest request,
	// HttpServletResponse res) {
	// String name = request.getParameter("name");
	// String password = request.getParameter("password");
	//
	// if (!loginService.isValid()) {
	// model.addAttribute("error", "Invalid user name and password");
	// return new ModelAndView("relogin", model);
	// }
	// String userName = loginService.retrieveName();
	// model.addAttribute("name", "Welcome "+userName+"!");
	// return new ModelAndView("greetings", model);
	// }
	//
	// @RequestMapping(value = "/login", method = RequestMethod.GET)
	// public String getLoginPage(
	// @RequestParam(value = "error", required = false) boolean error,
	// ModelMap model) {
	// logger.debug("Received request to show login page");
	//
	// // Add an error message to the model if login is unsuccessful
	// // The 'error' parameter is set to true based on the when the
	// // authentication has failed.
	// // We declared this under the authentication-failure-url attribute
	// // inside the spring-security.xml
	// /*
	// * See below: <form-login login-page="/krams/auth/login"
	// * authentication-failure-url="/krams/auth/login?error=true"
	// * default-target-url="/krams/main/common"/>
	// */
	// if (error == true) {
	// // Assign an error message
	// model.put("error",
	// "You have entered an invalid username or password!");
	// } else {
	// model.put("error", "");
	// }
	//
	// // This will resolve to /WEB-INF/jsp/loginpage.jsp
	// return "auth/loginpage";
	// }

	@RequestMapping(value = "/denied", method = RequestMethod.GET)
	public String getDeniedPage() {
		logger.debug("Received request to show denied page");

		// This will resolve to /WEB-INF/jsp/deniedpage.jsp
		return "auth/deniedpage";
	}

}