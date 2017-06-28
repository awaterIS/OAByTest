package com.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * RoleTab entity. @author MyEclipse Persistence Tools
 */

public class RoleTab implements java.io.Serializable {

	// Fields

	private Long roleId;
	private String roleName;
	private String roleDetail;
	private Set userRoleTabs = new HashSet(0);
	private Set menuRoleTabs = new HashSet(0);

	// Constructors

	/** default constructor */
	public RoleTab() {
	}

	/** minimal constructor */
	public RoleTab(String roleName, String roleDetail) {
		this.roleName = roleName;
		this.roleDetail = roleDetail;
	}

	/** full constructor */
	public RoleTab(String roleName, String roleDetail, Set userRoleTabs,
			Set menuRoleTabs) {
		this.roleName = roleName;
		this.roleDetail = roleDetail;
		this.userRoleTabs = userRoleTabs;
		this.menuRoleTabs = menuRoleTabs;
	}

	// Property accessors

	public Long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDetail() {
		return this.roleDetail;
	}

	public void setRoleDetail(String roleDetail) {
		this.roleDetail = roleDetail;
	}

	public Set getUserRoleTabs() {
		return this.userRoleTabs;
	}

	public void setUserRoleTabs(Set userRoleTabs) {
		this.userRoleTabs = userRoleTabs;
	}

	public Set getMenuRoleTabs() {
		return this.menuRoleTabs;
	}

	public void setMenuRoleTabs(Set menuRoleTabs) {
		this.menuRoleTabs = menuRoleTabs;
	}

}