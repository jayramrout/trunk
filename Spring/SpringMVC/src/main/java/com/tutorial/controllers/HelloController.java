package com.tutorial.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello"; // This is the view
	}
	
	@RequestMapping(method= RequestMethod.GET,value="/goodbyee")
	public String printGoodBye(ModelMap model) {
		model.addAttribute("message", "Spring 3 MVC Good Bye World");
		return "hello";
	}
}