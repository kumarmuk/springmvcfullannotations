package com.nyota.example.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThemePageController {

	
	@RequestMapping(value = "/hellotheme")
	@ResponseBody
	public ModelAndView welcome(Map<String, Object> model) {
		  model.put("tagline", "The one and only amazing web store"); 
	       
		   //View view = new InternalResourceView("/WEB-INF/views/welcome.jsp"); 
		  model.put("message", "ahh a new theme");
		       
		   return new ModelAndView("theme", model); 
	}

}
