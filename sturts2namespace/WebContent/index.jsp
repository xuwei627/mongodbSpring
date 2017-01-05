<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% 
// 获取工程名称 
String path = request.getContextPath();
// request.getScheme()拿到http字符串  request.getServerName()拿到localhost  request.getServerPort()拿到端口8080  
	String basePath =request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; %>
<html>

<html>
<head><title>index</title>
<base href=<%=basePath %>/>
</head>
<body>

    <a href="path/path!update">hahah</a>
<!--     <form action="path/ModelDrven_add" method="post"> -->
    <form action="path/UserVaildate_check" method="post">
    名字：<input type="text" name="name">
    <input type="submit" name="submit">
    </form>
    <a href="webcontect.jsp">session</a>
</body>
</html>