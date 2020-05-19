package org.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController {
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("Inside ModelAndView");
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("WelcomeMessage", "Hi User, Welcome to the first Spring MVC App");
		return modelAndView;
	}
	
}
