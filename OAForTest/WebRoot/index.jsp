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
  
  <body>
     <h1>欢迎OA管理系统</h1>
    <form action="${pageContext.request.contextPath }/userLoginAction_login.action">
    	用户名：<input type="text" name="user.username" value="${user.username}"><br>
    	密码：<input type="password" name="user.pwd"><br>
    	${info}<br>
    	<input type="submit" value="登陆">
    </form>
    <a href="${pageContext.request.contextPath}/login.jsp">点击注册</a>
  </body>
</html>
