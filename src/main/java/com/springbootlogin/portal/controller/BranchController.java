package com.springbootlogin.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.springbootlogin.portal.service.BranchService;

@RestController
public class BranchController {
	
	@Autowired
	BranchService branchService ;
	
	@RequestMapping("/allbranch")
	public ModelAndView getAllBranch() {
		
		return null;
		
	}
}
