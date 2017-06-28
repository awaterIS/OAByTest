<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body style="background-image:url('${pageContext.request.contextPath}/img/right.png');margin:0px;padding:0px">
  <a href="${pageContext.request.contextPath }/userAction_queryAllData.action">查询所有注册人员</a>
    <form action="${pageContext.request.contextPath }/userAction_save.action">
    	用户名：<input type="text" name="user.username"><br>
    	密码：<input type="password" name="user.pwd"><br>
    	<input type="submit" value="注册">
    </form>
    <a href="${pageContext.request.contextPath}/index.jsp">点击返回登陆</a>
  </body>
</html>
