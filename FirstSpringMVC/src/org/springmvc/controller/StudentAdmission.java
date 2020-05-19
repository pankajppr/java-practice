package org.springmvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springmvc.model.Student;

@Controller
public class StudentAdmission {
	
	@RequestMapping(value="/studentAdmissionForm.html", method=RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		ModelAndView model = new ModelAndView("admissionForm");
		return model;
	}
	
	@RequestMapping(value="/sutdentSubmitAdmissionForm.html", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm( @ModelAttribute("student1") Student student1){
		
		ModelAndView model = new ModelAndView("admissionSuccess");
		model.addObject("Header","This is the Header Message");
		return model;
	}
}
