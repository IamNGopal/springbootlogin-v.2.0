package com.springbootlogin.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.springbootlogin.portal.service.DeptService;

@RestController
public class DeptController {
	
	@Autowired
	DeptService deptService ;
	

	@RequestMapping("/alldept")
	public ModelAndView getAllDept() {
		
		return null;
		
	}

}
