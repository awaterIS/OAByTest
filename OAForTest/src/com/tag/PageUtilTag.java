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
				System.out.println("value的值必须是PageUtil类型");
			}else{
				PageUtil pageUtil = (PageUtil)value;
				String prevUrl = url;//上一页的url
				String nextUrl = url;//下一页的url
				String scriptUrl = url;//脚本中的url
				if (url.contains("?")) {
					prevUrl=url+"&currentPage="+(pageUtil.getCurrentPage()-1)+"&pageSize="+(pageUtil.getPageSize());
					nextUrl=url+"&currentPage="+(pageUtil.getCurrentPage()+1)+"&pageSize="+pageUtil.getPageSize();
					scriptUrl = url +"&currentPage="+pageUtil.getCurrentPage();
				}else{
					prevUrl=url+"?currentPage="+(pageUtil.getCurrentPage()-1)+"&pageSize="+(pageUtil.getPageSize());
					nextUrl=url+"?currentPage="+(pageUtil.getCurrentPage()+1)+"&pageSize="+pageUtil.getPageSize();
					scriptUrl = url +"?currentPage="+pageUtil.getCurrentPage();
				}
				out.print("每页<select name='pageSize' onchange='changePage(this)'");
				for (int i = 0; i <= 20; i+=5) {
					if (i==pageUtil.getPageSize()) {
						out.print("<option value='"+i+"' selected='selected'>"+i+"</option>");
					}else{
						out.print("<option value='"+i+"'>"+i+"</option>");
					}
				}
				out.print("</select>条&nbsp;");
				out.print("共:"+pageUtil.getTotalRecord()+"条&nbsp;共:"+pageUtil.getTotalPage()+"页");
				if (pageUtil.getCurrentPage()<=1) {
					out.print("<<");//此处是表示如果当前页面为第一页，则不可再点击
				}else{
					out.print("<a href="+prevUrl+"><<</a>");//url为上一页url
				}
				out.print("&nbsp;当前第"+pageUtil.getCurrentPage()+"页");
				if (pageUtil.getCurrentPage()==pageUtil.getTotalPage()) {
					out.print(">>");
				}else{
					out.print("<a href="+nextUrl+">>></a>");//url为下一页url
				}
				String contextPath = ((HttpServletRequest)pageContext.getRequest()).getContextPath();//得到上下文路径
				out.print("<script type='text/javascript'>");
				out.print(" function chagePage(selObj){");
				out.print(" var selectedValue =  selObj.value;");
				//脚本URL+脚本中的变量 selectedValue；
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
