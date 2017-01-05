<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*,java.util.*"%>
<%@ page import="com.soft.entity.*,com.soft.service.*" %>
    
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/"+path+"/";

	// 获取页面输入注册信息
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	String password2 = request.getParameter("password2");
	
	User user = new User();
	user.setUsername(username);
	user.setPassword(password);

	// 准备数据库链接
	UserManager um = new UserManager();
	if(um.exits(user)){
		response.sendRedirect("registFail.jsp");
		return;
	}
	um.add(user);
	response.sendRedirect("registSuccess.jsp");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<base href="<%=basePath  %>">
</head>
<body>

</body>
</html>