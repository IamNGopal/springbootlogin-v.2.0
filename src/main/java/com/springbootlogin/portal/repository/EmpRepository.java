package com.springbootlogin.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootlogin.portal.model.LoginPortalEmp;

public interface EmpRepository extends JpaRepository<LoginPortalEmp, String>{

}
