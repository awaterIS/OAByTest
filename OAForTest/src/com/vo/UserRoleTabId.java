package com.vo;

/**
 * UserRoleTabId entity. @author MyEclipse Persistence Tools
 */

public class UserRoleTabId implements java.io.Serializable {

	// Fields

	private UserTab userTab;
	private RoleTab roleTab;

	// Constructors

	/** default constructor */
	public UserRoleTabId() {
	}

	/** full constructor */
	public UserRoleTabId(UserTab userTab, RoleTab roleTab) {
		this.userTab = userTab;
		this.roleTab = roleTab;
	}

	// Property accessors

	public UserTab getUserTab() {
		return this.userTab;
	}

	public void setUserTab(UserTab userTab) {
		this.userTab = userTab;
	}

	public RoleTab getRoleTab() {
		return this.roleTab;
	}

	public void setRoleTab(RoleTab roleTab) {
		this.roleTab = roleTab;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserRoleTabId))
			return false;
		UserRoleTabId castOther = (UserRoleTabId) other;

		return ((this.getUserTab() == castOther.getUserTab()) || (this
				.getUserTab() != null && castOther.getUserTab() != null && this
				.getUserTab().equals(castOther.getUserTab())))
				&& ((this.getRoleTab() == castOther.getRoleTab()) || (this
						.getRoleTab() != null && castOther.getRoleTab() != null && this
						.getRoleTab().equals(castOther.getRoleTab())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUserTab() == null ? 0 : this.getUserTab().hashCode());
		result = 37 * result
				+ (getRoleTab() == null ? 0 : this.getRoleTab().hashCode());
		return result;
	}

}