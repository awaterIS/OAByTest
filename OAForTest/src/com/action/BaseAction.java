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
	 * ���������Ǹ����෽������ֵ�ṩ�ĳ�������
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
	
	protected int pageSize = 5;//Ĭ�Ϸ�ҳ��С
	protected int currentPage = 1;//Ĭ����ʾ��һҳ
	
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
	//�˷����ڷ���BaseAction�����������ʱ��struts2����Զ����ã���request���󴫵ݹ���
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
