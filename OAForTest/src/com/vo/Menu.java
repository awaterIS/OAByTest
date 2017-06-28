package com.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * Menu entity. @author MyEclipse Persistence Tools
 */

public class Menu implements java.io.Serializable {

	// Fields

	private Long menuId;
	private Menu menu;
	private String menuName;
	private String menuUrl;
	private Set menus = new HashSet(0);
	private Set menuRoleTabs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Menu() {
	}

	/** minimal constructor */
	public Menu(String menuName) {
		this.menuName = menuName;
	}

	/** full constructor */
	public Menu(Menu menu, String menuName, String menuUrl, Set menus,
			Set menuRoleTabs) {
		this.menu = menu;
		this.menuName = menuName;
		this.menuUrl = menuUrl;
		this.menus = menus;
		this.menuRoleTabs = menuRoleTabs;
	}

	// Property accessors

	public Long getMenuId() {
		return this.menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	public Menu getMenu() {
		return this.menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuUrl() {
		return this.menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	public Set getMenus() {
		return this.menus;
	}

	public void setMenus(Set menus) {
		this.menus = menus;
	}

	public Set getMenuRoleTabs() {
		return this.menuRoleTabs;
	}

	public void setMenuRoleTabs(Set menuRoleTabs) {
		this.menuRoleTabs = menuRoleTabs;
	}

}