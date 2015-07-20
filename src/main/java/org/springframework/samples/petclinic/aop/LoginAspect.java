package org.springframework.samples.petclinic.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.samples.petclinic.web.LoginController;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoginAspect {

	protected static Logger logger = LoggerFactory
			.getLogger(LoginController.class);
	
	@Before("execution(* org.springframework.samples.petclinic.web.LoginController.*(..))")
	public void welcomeAdvice() {
		logger.debug("hello, there!, welcome to my clinic");
		System.out.println("print, there!, welcome to my clinic");
	}

}
