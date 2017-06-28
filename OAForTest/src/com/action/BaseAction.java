package com.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;


@Component

public class BaseAction extends ActionSupport implements ServletContextAware,ServletRequestAware,ServletResponseAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 以下属性是给子类方法返回值提供的常量。。
	 */
	protected final String RES_SAVE="save";
	protected final String RES_UPDATE="update";
	protected final String RES_UPDATE_REQ="updateRequest";
	protected final String RES_DELETE="delete";
	protected final String RES_LIST="list";
	protected final String RES_ADD_REQUEST="addRequest";
	protected final String RES_USER_ROLE ="userByRole";
	
	protected HttpServletResponse response;
	protected HttpServletRequest request;
	protected ServletContext context;
	protected HttpSession session;
	
	protected int pageSize = 5;//默认分页大小
	protected int currentPage = 1;//默认显示第一页
	
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response=response;
	}
	//此方法在访问BaseAction或其子类对象时由struts2框架自动调用，将request对象传递过来
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request=request;
		this.session=request.getSession();
	}

	public void setServletContext(ServletContext context) {
		// TODO Auto-generated method stub
		this.context=context;
	}

}
