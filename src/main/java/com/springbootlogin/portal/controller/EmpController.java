package com.springbootlogin.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.springbootlogin.portal.service.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	EmpService empService ;
	
	@RequestMapping("/allemp")
	public ModelAndView getAllEmp() {
		
		return null;
		
	}

}
