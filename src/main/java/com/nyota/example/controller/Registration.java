package com.nyota.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Registration {
	

	@RequestMapping(value = "/registration")
	@ResponseBody
	public String welcome() {
		return "Registration form will go here";
	}


}
