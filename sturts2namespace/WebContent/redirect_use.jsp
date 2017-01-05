<%@ page language="java" contentType="text/html; charset=Utf-8"
    pageEncoding="Utf-8"%>
    <!-- 导入标签库 -->
<%@ taglib prefix="s" uri="/struts-tags" %>
<% 
// 获取工程名称 
String path = request.getContextPath();
// request.getScheme()拿到http字符串  request.getServerName()拿到localhost  request.getServerPort()拿到端口8080  
	String basePath =request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Utf-8">
<title>Insert title here</title>
<base href=<%=basePath %>/>
</head>

<body>
 redirect_use.jsp
</body>
</html>