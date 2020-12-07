package com.nyota.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicViewController {

	@RequestMapping(value = "/welcome")
	public String welcome() {
		return "welcome";
	}

}
