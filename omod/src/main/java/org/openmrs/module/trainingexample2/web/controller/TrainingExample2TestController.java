package org.openmrs.module.trainingexample2.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.context.Context;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TrainingExample2TestController {
	protected final Log log = LogFactory.getLog(getClass());
	
	@RequestMapping(value = "/module/trainingexample2/test", method = RequestMethod.GET)
	public void manage(ModelMap model) {
		model.addAttribute("conceptname", Context.getConceptService().getConcept(32).getName());
	}
	
	@RequestMapping(value = "/module/trainingexample2/test", method=RequestMethod.POST)
	public String getConceptName(ModelMap model){
		
		//model.addAttribute("conceptname", Context.getConceptService().getConcept(Integer.parseInt(model.get("conceptid").toString())).getName());
		model.addAttribute("conceptname", "TEST-VALUE");
		return "redirect:test.jsp";
	}
	

	
}
