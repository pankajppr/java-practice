package org.springmvc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springmvc.model.Patient;

@Controller
public class PatientAdmissionController {
	@Autowired
	private SessionFactory sessionFactory;
	
	public PatientAdmissionController(){
		
	}
	public PatientAdmissionController(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	@RequestMapping(value="/admissionForm.html", method=RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		ModelAndView model1 = new ModelAndView("admissionForm");
		return model1;
	}
	
	@ModelAttribute
	public void addingCommonObjects(Model model1){
		model1.addAttribute("headerMessage", "Patient Admission Form ");
	}
	
	@RequestMapping(value="/submitAdmissionForm.html", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("patient1") Patient patient1){
		ModelAndView model1 = new ModelAndView("admissionSuccess");
		Session session = sessionFactory.openSession();
		session.save(patient1);
		System.out.println(patient1);
		return model1;
	}
	@RequestMapping(value="/submitAdmissionForm.html", method=RequestMethod.DELETE)
	public ModelAndView submitAdmissionForm1(@ModelAttribute("patient1") Patient patient1){
		ModelAndView model1 = new ModelAndView("admissionSuccess");
		Session session = sessionFactory.openSession();
		session.save(patient1);
		System.out.println(patient1);
		return model1;
	}
	
	@RequestMapping(value="listOfPatients.html", method=RequestMethod.GET)
	public ModelAndView getListOfPatients(){
		ModelAndView model1 = new ModelAndView("listOfPatients");
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Patient");
		List<Patient> patients = query.list();
		HashMap<String, List<Patient>> m = new HashMap<String,List<Patient>>();
		model1.addObject(patients);
		model1.addAllObjects((Map<String, ?>) m.put("patients",patients));
		return model1;
	}
}
