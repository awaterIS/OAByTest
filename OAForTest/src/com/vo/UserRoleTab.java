package com.vo;

/**
 * UserRoleTab entity. @author MyEclipse Persistence Tools
 */

public class UserRoleTab implements java.io.Serializable {

	// Fields

	private UserRoleTabId id;
	private RoleTab roleTab;
	private UserTab userTab;

	// Constructors

	/** default constructor */
	public UserRoleTab() {
	}

	/** minimal constructor */
	public UserRoleTab(UserRoleTabId id) {
		this.id = id;
	}

	/** full constructor */
	public UserRoleTab(UserRoleTabId id, RoleTab roleTab, UserTab userTab) {
		this.id = id;
		this.roleTab = roleTab;
		this.userTab = userTab;
	}

	// Property accessors

	public UserRoleTabId getId() {
		return this.id;
	}

	public void setId(UserRoleTabId id) {
		this.id = id;
	}

	public RoleTab getRoleTab() {
		return this.roleTab;
	}

	public void setRoleTab(RoleTab roleTab) {
		this.roleTab = roleTab;
	}

	public UserTab getUserTab() {
		return this.userTab;
	}

	public void setUserTab(UserTab userTab) {
		this.userTab = userTab;
	}

}