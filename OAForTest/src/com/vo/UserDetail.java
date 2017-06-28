package com.vo;

/**
 * UserDetail entity. @author MyEclipse Persistence Tools
 */

public class UserDetail implements java.io.Serializable {

	// Fields

	private Long userId;
	private DeptTab deptTab;
	private UserTab userTab;
	private String userAdd;
	private String userPstatus;
	private String userDegree;
	private String userEdu;
	private String userTechpost;
	private String userMar;
	private String userReg;

	// Constructors

	/** default constructor */
	public UserDetail() {
	}

	/** minimal constructor */
	public UserDetail(UserTab userTab, String userDegree, String userEdu,
			String userMar) {
		this.userTab = userTab;
		this.userDegree = userDegree;
		this.userEdu = userEdu;
		this.userMar = userMar;
	}

	/** full constructor */
	public UserDetail(DeptTab deptTab, UserTab userTab, String userAdd,
			String userPstatus, String userDegree, String userEdu,
			String userTechpost, String userMar, String userReg) {
		this.deptTab = deptTab;
		this.userTab = userTab;
		this.userAdd = userAdd;
		this.userPstatus = userPstatus;
		this.userDegree = userDegree;
		this.userEdu = userEdu;
		this.userTechpost = userTechpost;
		this.userMar = userMar;
		this.userReg = userReg;
	}

	// Property accessors

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public DeptTab getDeptTab() {
		return this.deptTab;
	}

	public void setDeptTab(DeptTab deptTab) {
		this.deptTab = deptTab;
	}

	public UserTab getUserTab() {
		return this.userTab;
	}

	public void setUserTab(UserTab userTab) {
		this.userTab = userTab;
	}

	public String getUserAdd() {
		return this.userAdd;
	}

	public void setUserAdd(String userAdd) {
		this.userAdd = userAdd;
	}

	public String getUserPstatus() {
		return this.userPstatus;
	}

	public void setUserPstatus(String userPstatus) {
		this.userPstatus = userPstatus;
	}

	public String getUserDegree() {
		return this.userDegree;
	}

	public void setUserDegree(String userDegree) {
		this.userDegree = userDegree;
	}

	public String getUserEdu() {
		return this.userEdu;
	}

	public void setUserEdu(String userEdu) {
		this.userEdu = userEdu;
	}

	public String getUserTechpost() {
		return this.userTechpost;
	}

	public void setUserTechpost(String userTechpost) {
		this.userTechpost = userTechpost;
	}

	public String getUserMar() {
		return this.userMar;
	}

	public void setUserMar(String userMar) {
		this.userMar = userMar;
	}

	public String getUserReg() {
		return this.userReg;
	}

	public void setUserReg(String userReg) {
		this.userReg = userReg;
	}

}