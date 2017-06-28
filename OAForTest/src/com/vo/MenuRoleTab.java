package com.vo;

/**
 * MenuRoleTab entity. @author MyEclipse Persistence Tools
 */

public class MenuRoleTab implements java.io.Serializable {

	// Fields

	private MenuRoleTabId id;
	private Menu menu;
	private RoleTab roleTab;

	// Constructors

	/** default constructor */
	public MenuRoleTab() {
	}

	/** minimal constructor */
	public MenuRoleTab(MenuRoleTabId id) {
		this.id = id;
	}

	/** full constructor */
	public MenuRoleTab(MenuRoleTabId id, Menu menu, RoleTab roleTab) {
		this.id = id;
		this.menu = menu;
		this.roleTab = roleTab;
	}

	// Property accessors

	public MenuRoleTabId getId() {
		return this.id;
	}

	public void setId(MenuRoleTabId id) {
		this.id = id;
	}

	public Menu getMenu() {
		return this.menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public RoleTab getRoleTab() {
		return this.roleTab;
	}

	public void setRoleTab(RoleTab roleTab) {
		this.roleTab = roleTab;
	}

}