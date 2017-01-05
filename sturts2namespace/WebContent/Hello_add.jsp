<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% 
// 获取工程名称 
String path = request.getContextPath();
// request.getScheme()拿到http字符串  request.getServerName()拿到localhost  request.getServerPort()拿到端口8080  
	String basePath =request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; %>
<html>
<head><title>hellostruts2</title>
<base href="<%=basePath%>"/>
</head>
<body>

    <h3>你好  你好呀</h3>
      <a href="index.jsp">index</a>
<!--       如果head里面配置了 <base> 则只需要上面那个对应的文件名就行了 -->
<%--     <a href="<%=basePath %>index.jsp">index</a> --%>
</body>
</html>