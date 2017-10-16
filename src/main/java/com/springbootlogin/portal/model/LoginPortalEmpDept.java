package com.springbootlogin.portal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the login_portal_emp_dept database table.
 * 
 */
@Entity
@Table(name="login_portal_emp_dept")
@NamedQuery(name="LoginPortalEmpDept.findAll", query="SELECT l FROM LoginPortalEmpDept l")
public class LoginPortalEmpDept implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="dept_id")
	private int deptId;

	@Column(name="dept_name")
	private String deptName;

	//bi-directional many-to-one association to LoginPortalEmp
	@OneToMany(mappedBy="loginPortalEmpDept")
	private List<LoginPortalEmp> loginPortalEmps;

	public LoginPortalEmpDept() {
	}

	public int getDeptId() {
		return this.deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<LoginPortalEmp> getLoginPortalEmps() {
		return this.loginPortalEmps;
	}

	public void setLoginPortalEmps(List<LoginPortalEmp> loginPortalEmps) {
		this.loginPortalEmps = loginPortalEmps;
	}

	public LoginPortalEmp addLoginPortalEmp(LoginPortalEmp loginPortalEmp) {
		getLoginPortalEmps().add(loginPortalEmp);
		loginPortalEmp.setLoginPortalEmpDept(this);

		return loginPortalEmp;
	}

	public LoginPortalEmp removeLoginPortalEmp(LoginPortalEmp loginPortalEmp) {
		getLoginPortalEmps().remove(loginPortalEmp);
		loginPortalEmp.setLoginPortalEmpDept(null);

		return loginPortalEmp;
	}

}