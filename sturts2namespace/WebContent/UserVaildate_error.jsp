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
  user check fail
  
  <!-- struts2的专门取后台校验信息的标签，不过这个标签自带属性，不灵活 -->
  <s:fielderror fieldName="name" theme="simple"></s:fielderror>
  <!-- 获取错误信息  错误信息存放在errors里面，是一个map，key：name value：[名字错了] value是一个数组-->
  <s:property value="errors.name[0]"/>
  <!-- debug可以查看内存里面值信息 -->
  <s:debug></s:debug>
</body>
</html>