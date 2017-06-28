package com.vo;

/**
 * MenuRoleTabId entity. @author MyEclipse Persistence Tools
 */

public class MenuRoleTabId implements java.io.Serializable {

	// Fields

	private RoleTab roleTab;
	private Menu menu;

	// Constructors

	/** default constructor */
	public MenuRoleTabId() {
	}

	/** full constructor */
	public MenuRoleTabId(RoleTab roleTab, Menu menu) {
		this.roleTab = roleTab;
		this.menu = menu;
	}

	// Property accessors

	public RoleTab getRoleTab() {
		return this.roleTab;
	}

	public void setRoleTab(RoleTab roleTab) {
		this.roleTab = roleTab;
	}

	public Menu getMenu() {
		return this.menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MenuRoleTabId))
			return false;
		MenuRoleTabId castOther = (MenuRoleTabId) other;

		return ((this.getRoleTab() == castOther.getRoleTab()) || (this
				.getRoleTab() != null && castOther.getRoleTab() != null && this
				.getRoleTab().equals(castOther.getRoleTab())))
				&& ((this.getMenu() == castOther.getMenu()) || (this.getMenu() != null
						&& castOther.getMenu() != null && this.getMenu()
						.equals(castOther.getMenu())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRoleTab() == null ? 0 : this.getRoleTab().hashCode());
		result = 37 * result
				+ (getMenu() == null ? 0 : this.getMenu().hashCode());
		return result;
	}

}