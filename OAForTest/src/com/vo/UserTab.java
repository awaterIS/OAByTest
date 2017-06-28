package com.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * UserTab entity. @author MyEclipse Persistence Tools
 */

public class UserTab implements java.io.Serializable {

	// Fields

	private Long userId;
	private String userName;
	private String userPwd;
	private Long userTel;
	private String userEmail;
	private Set userRoleTabs = new HashSet(0);
	private Set userDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public UserTab() {
	}

	/** minimal constructor */
	public UserTab(String userName, String userPwd, Long userTel,
			String userEmail) {
		this.userName = userName;
		this.userPwd = userPwd;
		this.userTel = userTel;
		this.userEmail = userEmail;
	}

	/** full constructor */
	public UserTab(String userName, String userPwd, Long userTel,
			String userEmail, Set userRoleTabs, Set userDetails) {
		this.userName = userName;
		this.userPwd = userPwd;
		this.userTel = userTel;
		this.userEmail = userEmail;
		this.userRoleTabs = userRoleTabs;
		this.userDetails = userDetails;
	}

	// Property accessors

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return this.userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public Long getUserTel() {
		return this.userTel;
	}

	public void setUserTel(Long userTel) {
		this.userTel = userTel;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Set getUserRoleTabs() {
		return this.userRoleTabs;
	}

	public void setUserRoleTabs(Set userRoleTabs) {
		this.userRoleTabs = userRoleTabs;
	}

	public Set getUserDetails() {
		return this.userDetails;
	}

	public void setUserDetails(Set userDetails) {
		this.userDetails = userDetails;
	}

}