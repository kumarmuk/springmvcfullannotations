package com.nyota.example.controller;

import java.util.Map;

import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingsController {

	@RequestMapping(value = "/")
	public String welcome() {
		//model.addObject("welcome_msg", "Spring Mvc Internationalization Example"); 
		return "welcome";
	}
	
	@RequestMapping("/home") 
	public ModelAndView greeting(Map<String, Object> model) { 
	       
	   model.put("greeting", "Welcome to Web Store!"); 
	   model.put("tagline", "The one and only amazing web store"); 
	       
	   //View view = new InternalResourceView("/WEB-INF/views/welcome.jsp"); 
	       
	   return new ModelAndView("home", model); 
	}

}
