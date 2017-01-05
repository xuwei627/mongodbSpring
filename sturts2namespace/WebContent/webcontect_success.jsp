<%@ page language="java" contentType="text/html; charset=Utf-8"
    pageEncoding="Utf-8"%>
    <!-- 导入标签库 -->
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Utf-8">
<title>Insert title here</title>
</head>
<body>
  user login success <br>
  <!-- 获取web信息，方式注意  #   <%  %> 原始的方式-->
  <s:property value="#request.r1"/> | <%=request.getAttribute("r1") %><br>
  <s:property value="#session.s1"/> | <%=session.getAttribute("s1") %><br>
  <s:property value="#application.a1"/> | <%=application.getAttribute("a1") %><br>
  <!-- debug可以查看内存里面值信息 -->
  <s:debug></s:debug>
</body>
</html>