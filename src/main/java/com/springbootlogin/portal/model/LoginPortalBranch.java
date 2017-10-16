package com.springbootlogin.portal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the login_portal_branch database table.
 * 
 */
@Entity
@Table(name="login_portal_branch")
@NamedQuery(name="LoginPortalBranch.findAll", query="SELECT l FROM LoginPortalBranch l")
public class LoginPortalBranch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="branch_id")
	private String branchId;

	@Column(name="branch_name")
	private String branchName;

	//bi-directional many-to-one association to LoginPortalEmp
	@OneToMany(mappedBy="loginPortalBranch")
	private List<LoginPortalEmp> loginPortalEmps;

	public LoginPortalBranch() {
	}

	public String getBranchId() {
		return this.branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return this.branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public List<LoginPortalEmp> getLoginPortalEmps() {
		return this.loginPortalEmps;
	}

	public void setLoginPortalEmps(List<LoginPortalEmp> loginPortalEmps) {
		this.loginPortalEmps = loginPortalEmps;
	}

	public LoginPortalEmp addLoginPortalEmp(LoginPortalEmp loginPortalEmp) {
		getLoginPortalEmps().add(loginPortalEmp);
		loginPortalEmp.setLoginPortalBranch(this);

		return loginPortalEmp;
	}

	public LoginPortalEmp removeLoginPortalEmp(LoginPortalEmp loginPortalEmp) {
		getLoginPortalEmps().remove(loginPortalEmp);
		loginPortalEmp.setLoginPortalBranch(null);

		return loginPortalEmp;
	}

}