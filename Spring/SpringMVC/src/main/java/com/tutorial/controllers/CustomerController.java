package com.tutorial.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class CustomerController extends MultiActionController {

	public ModelAndView add(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		return new ModelAndView("CustomerPage", "message","add() method");
	}

	public ModelAndView delete(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		return new ModelAndView("CustomerPage", "message","delete() method");
	}

	public ModelAndView update(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		return new ModelAndView("CustomerPage", "message","update() method");

	}

	public ModelAndView list(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		return new ModelAndView("CustomerPage", "message","list() method");

	}

}