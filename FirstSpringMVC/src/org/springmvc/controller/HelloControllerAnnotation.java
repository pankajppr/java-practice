package org.springmvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloControllerAnnotation {
	@RequestMapping("/welcome/{countryName}/{userName}")
	public ModelAndView helloController(@PathVariable Map<String, String> pathValues){
		String name = pathValues.get("userName");
		String country = pathValues.get("countryName");
		
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "Hello "+name+" From "+country);
		return model;
	}
}
