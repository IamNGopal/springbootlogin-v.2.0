package com.springbootlogin.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootlogin.portal.repository.EmpRepository;
@Service
public class EmpService {
	
	@Autowired
	EmpRepository empRposetory;
	
	
}
