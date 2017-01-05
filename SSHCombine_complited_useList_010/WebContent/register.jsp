<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.sql.*,java.util.*"
    pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/"+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<base href="<%=basePath  %>">
</head>
<body>

<form action="register/regist" method="post" name="form">
	用户名:<input name="username" type="text"/><br/>
	密码：<input name="password"  type="password"/><br/>
	密码确认：<input name="password2"  type="password"/><br/>
	<input type="submit" value="submit"/><br/>
</form>
</body>
</html>