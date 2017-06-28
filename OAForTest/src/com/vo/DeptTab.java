package com.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * DeptTab entity. @author MyEclipse Persistence Tools
 */

public class DeptTab implements java.io.Serializable {

	// Fields

	private Long deptId;
	private String deptName;
	private String deptDetail;
	private Set userDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public DeptTab() {
	}

	/** minimal constructor */
	public DeptTab(String deptName) {
		this.deptName = deptName;
	}

	/** full constructor */
	public DeptTab(String deptName, String deptDetail, Set userDetails) {
		this.deptName = deptName;
		this.deptDetail = deptDetail;
		this.userDetails = userDetails;
	}

	// Property accessors

	public Long getDeptId() {
		return this.deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptDetail() {
		return this.deptDetail;
	}

	public void setDeptDetail(String deptDetail) {
		this.deptDetail = deptDetail;
	}

	public Set getUserDetails() {
		return this.userDetails;
	}

	public void setUserDetails(Set userDetails) {
		this.userDetails = userDetails;
	}

}