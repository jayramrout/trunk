package com.tutorial.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@RequestMapping("/helloworld")
	public ModelAndView helloWord(){
		String message = "Hello World ,GM Again!!!";
		return new ModelAndView("helloworld", "message",message);
	}
	
	@RequestMapping("/byeworld")
	public ModelAndView byeWorld() {
		String message = "Bye World Good Night!!!";
		return new ModelAndView("helloworld", "message",message);
	}
}