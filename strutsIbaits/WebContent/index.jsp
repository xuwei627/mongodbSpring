<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/"+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>用户登录</title>
<base href="<%=basePath%>">
</head>
<body>

<s:form	action="user/login" method="post">
	<table>
	
	<tr><td>用户名：</td><td><input type="text" name="username"></td></tr>
	<tr><td>密    码：</td><td><input type="password" name="password"></td></tr>
	<tr><td/><td><input type="submit" value="submit"></td></tr>
	</table>
</s:form>

</body>
</html>