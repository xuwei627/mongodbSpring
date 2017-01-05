<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head><title>index</title>
</head>
<body>
	<%--访问值栈中普通属性 --%>
	<s:property value="username"/><br/>
	<s:property value="user.name"/><br/>
	<s:property value="cat.friend.name"/><br/>
    <%--访问值栈中普通方法 --%>
    <s:property value="username.length()"/><br/>
         <%--访问对象中的普通方法 --%>
     <s:property value="cat.miao()"/><br/>
     <%--action中的普通方法 --%>
      <s:property value="m()"/><br/>
      <%--  想让页面访问静态方法，必须将struts.xml中的这个设置为true 
    		<constant name="struts.ognl.allowStaticMethodAccess" value="true" /> --%>
      <%--访问静态方法 --%>
      <s:property value="@com.soft.action.Cat@mao()"/><br/>
      <%--访问静态属性 --%>
      <s:property value="@com.soft.action.Cat@name"/><br/>
      <%--访问Math类的静态方法 --%>
      <s:property value="@@max(2,3)"/><br/>
      <hr/>
      <%--集合属性获取 --%>
      <s:property value="users"/><br/>
      <s:property value="users[0]"/><br/>
      <%--访问list中某个元素的属性  User中的age属性  是个集合 --%>
      <s:property value="users.{age}"/><br/>
      <%--访问list中某个元素指定的属性  list中的第一个User对象的age属性 --%>
      <s:property value="users[0].{age}[0]"/><br/>
      <hr/>
      <%--访问set --%>
      <s:property value="set"/><br/>
      <%--访问set 中某个属性，但是因为set集合是无序数组，所以页面访问不到--%>
      <s:property value="set[0]"/><br/>
      <hr/>
      <%--访问map --%>
      <s:property value="map"/><br/>
      <%--访问map中某个元素 --%>
      <s:property value="map.b"/><br/>
      <%--访问map所有的key --%>
      <s:property value="map.keys"/><br/>
      <%--访问map所有的value --%>
      <s:property value="map.values"/><br/>
      <%--访问容器的大小 --%>
      <s:property value="map.size()"/>|<s:property value="users.size"/><br/>
      <hr/>
      <%--投影，?# 找集合中的某个值 --%>
      <s:property value="users.{?#this.age == 22}[0]"></s:property><br/>
      <%--投影，^# 找集合中的某个值 并取第一项 --%>
      <s:property value="users.{^#this.age > 21}.{age}"></s:property><br/>
      <%--投影，$# 找集合中的某个值 并取最后一项 --%>
      <s:property value="users.{$#this.age > 21}.{age}"></s:property><br/>
      <%--投影，$# 找集合中的某个值 并取最后一项 并判断是否为空 --%>
      <s:property value="users.{$#this.age > 21}.{age}.size == 0"></s:property><br/>
      <hr/>
      <%--可以将值栈中的object打印出来，[0] 从第0个开始打印，[1]从第一个开始打印。。。 --%>
      []:<s:property value="[0]"/>
      <s:debug></s:debug>
</body>
</html>