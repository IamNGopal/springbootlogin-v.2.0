package com.springbootlogin.portal.model;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Blob;


/**
 * The persistent class for the login_portal_emp database table.
 * 
 */
@Entity
@Table(name="login_portal_emp")
@NamedQuery(name="LoginPortalEmp.findAll", query="SELECT l FROM LoginPortalEmp l")
public class LoginPortalEmp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp_id")
	private int empId;

	@Column(name="emp_date_of_join")
	private String empDateOfJoin;

	@Column(name="emp_email1")
	private String empEmail1;

	@Column(name="emp_email2")
	private String empEmail2;

	@Column(name="emp_mobile1")
	private String empMobile1;

	@Column(name="emp_mobile2")
	private String empMobile2;

	@Column(name="emp_name")
	private String empName;

	@Column(name="emp_password")
	private String empPassword;

	@Column(name="emp_profile_pic")
	private Blob empProfilePic;

	@Column(name="emp_roleid")
	private String empRoleid;

	@Column(name="emp_userid")
	private int empUserid;

	//bi-directional many-to-one association to LoginPortalBranch
	@ManyToOne
	@JoinColumn(name="emp_branch_id")
	private LoginPortalBranch loginPortalBranch;

	//bi-directional many-to-one association to LoginPortalEmpDept
	@ManyToOne
	@JoinColumn(name="emp_dept_id")
	private LoginPortalEmpDept loginPortalEmpDept;

	public LoginPortalEmp() {
	}

	public int getEmpId() {
		return this.empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpDateOfJoin() {
		return this.empDateOfJoin;
	}

	public void setEmpDateOfJoin(String empDateOfJoin) {
		this.empDateOfJoin = empDateOfJoin;
	}

	public String getEmpEmail1() {
		return this.empEmail1;
	}

	public void setEmpEmail1(String empEmail1) {
		this.empEmail1 = empEmail1;
	}

	public String getEmpEmail2() {
		return this.empEmail2;
	}

	public void setEmpEmail2(String empEmail2) {
		this.empEmail2 = empEmail2;
	}

	public String getEmpMobile1() {
		return this.empMobile1;
	}

	public void setEmpMobile1(String empMobile1) {
		this.empMobile1 = empMobile1;
	}

	public String getEmpMobile2() {
		return this.empMobile2;
	}

	public void setEmpMobile2(String empMobile2) {
		this.empMobile2 = empMobile2;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpPassword() {
		return this.empPassword;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	public Blob getEmpProfilePic() {
		return this.empProfilePic;
	}

	public void setEmpProfilePic(Blob empProfilePic) {
		this.empProfilePic = empProfilePic;
	}

	public String getEmpRoleid() {
		return this.empRoleid;
	}

	public void setEmpRoleid(String empRoleid) {
		this.empRoleid = empRoleid;
	}

	public int getEmpUserid() {
		return this.empUserid;
	}

	public void setEmpUserid(int empUserid) {
		this.empUserid = empUserid;
	}

	public LoginPortalBranch getLoginPortalBranch() {
		return this.loginPortalBranch;
	}

	public void setLoginPortalBranch(LoginPortalBranch loginPortalBranch) {
		this.loginPortalBranch = loginPortalBranch;
	}

	public LoginPortalEmpDept getLoginPortalEmpDept() {
		return this.loginPortalEmpDept;
	}

	public void setLoginPortalEmpDept(LoginPortalEmpDept loginPortalEmpDept) {
		this.loginPortalEmpDept = loginPortalEmpDept;
	}

}