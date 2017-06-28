package com.tag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

import com.util.PageUtil;

public class PageUtilTag extends BodyTagSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Object value;
	private String url;
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		JspWriter out = pageContext.getOut();
		try {
			if (value==null && !(value instanceof PageUtil)) {
				System.out.println("value��ֵ������PageUtil����");
			}else{
				PageUtil pageUtil = (PageUtil)value;
				String prevUrl = url;//��һҳ��url
				String nextUrl = url;//��һҳ��url
				String scriptUrl = url;//�ű��е�url
				if (url.contains("?")) {
					prevUrl=url+"&currentPage="+(pageUtil.getCurrentPage()-1)+"&pageSize="+(pageUtil.getPageSize());
					nextUrl=url+"&currentPage="+(pageUtil.getCurrentPage()+1)+"&pageSize="+pageUtil.getPageSize();
					scriptUrl = url +"&currentPage="+pageUtil.getCurrentPage();
				}else{
					prevUrl=url+"?currentPage="+(pageUtil.getCurrentPage()-1)+"&pageSize="+(pageUtil.getPageSize());
					nextUrl=url+"?currentPage="+(pageUtil.getCurrentPage()+1)+"&pageSize="+pageUtil.getPageSize();
					scriptUrl = url +"?currentPage="+pageUtil.getCurrentPage();
				}
				out.print("ÿҳ<select name='pageSize' onchange='changePage(this)'");
				for (int i = 0; i <= 20; i+=5) {
					if (i==pageUtil.getPageSize()) {
						out.print("<option value='"+i+"' selected='selected'>"+i+"</option>");
					}else{
						out.print("<option value='"+i+"'>"+i+"</option>");
					}
				}
				out.print("</select>��&nbsp;");
				out.print("��:"+pageUtil.getTotalRecord()+"��&nbsp;��:"+pageUtil.getTotalPage()+"ҳ");
				if (pageUtil.getCurrentPage()<=1) {
					out.print("<<");//�˴��Ǳ�ʾ�����ǰҳ��Ϊ��һҳ���򲻿��ٵ��
				}else{
					out.print("<a href="+prevUrl+"><<</a>");//urlΪ��һҳurl
				}
				out.print("&nbsp;��ǰ��"+pageUtil.getCurrentPage()+"ҳ");
				if (pageUtil.getCurrentPage()==pageUtil.getTotalPage()) {
					out.print(">>");
				}else{
					out.print("<a href="+nextUrl+">>></a>");//urlΪ��һҳurl
				}
				String contextPath = ((HttpServletRequest)pageContext.getRequest()).getContextPath();//�õ�������·��
				out.print("<script type='text/javascript'>");
				out.print(" function chagePage(selObj){");
				out.print(" var selectedValue =  selObj.value;");
				//�ű�URL+�ű��еı��� selectedValue��
				out.print(" window.location.href='"+scriptUrl+"&pageSize='+selectedValue;}");
				out.print("</script>");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return super.doEndTag();
	}
	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		return super.doStartTag();
	}
	
}
