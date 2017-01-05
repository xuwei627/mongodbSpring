<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head><title>index</title>
</head>
<body>
		property:<s:property value="username"/><br>
		property 取值为字符串:<s:property value="'username'"/><br>
		property 设置默认值 :如果取不到值，如果取得到值默认值无效:<s:property value="admin" default="管理员"/><br>
		<hr>
		设定admin（默认是request和actioncontext）:<s:set var="adminName" value="username"/><br>
		取出设定的adminName:<s:property value="#request.adminName"/><br>
		从actionContext中取值：<s:property value="#adminName"/><br>
		给set设定范围 当前page有效：<s:set var="adminPass" value="admin" scope="page"/><br>
		从相应范围取值：<%=pageContext.getAttribute("adminPass") %><br>
		设定var 范围为actioncontext：<s:set var="a"  value="admin"/><br>  name属性被废弃了
		使用#取值：<s:property value="#a"/><br>
		设定var 范围为session :<s:set var="adminPass" value="admin" scope="session"/><br>
		用#号取值:<s:property value="#adminPass"/><br>
		从session取值:<s:property value="#session.adminPass"/><br>
		<hr>
		bean 定义bean 并使用param来设定新的属性值：
			<s:bean name="com.soft.action.Dog">
				
			</s:bean><br>
			
			bean对象创建以后就从值栈中消失了，到stackcontext 中去了   用var给他起个名字可以标记这个对象
			
			<s:bean name="com.soft.action.Dog" var="myDog">
				<s:param name="name" value="'odi'"/>
			</s:bean><br>
		<s:debug/>
		
		include 标签了解一下就行了。注意包含的页面最好不要有中文，如果有中文
		页面包含的内容不会显示。这就是为什么说了解一下就行了，一般不用。<br>
		<s:include value="/_include.html"/><br>
		<s:set var="clude" value="'_include.html'"/><br>
		$ 用于i18n和struts配置文件<br>
		# 取得actionContext的值<br>
		%将原来的文本属性解析为ognl 对于本来就是ognl的属性不起作用<br>
		<s:include value="%{#clude}"></s:include>
		
		<hr>
		<s:property value="#parameters.age"/>
		<s:if test="#parameters.age[0] < 0">wrong age</s:if><br>
		<s:elseif test="#parameters.age[0] < 20">yong</s:elseif><br>
		<s:else>hao </s:else><br>
		
		条件判断
		<s:if test="#parameters.aaa == null">null</s:if>
		<s:else>bushi  null</s:else>
		<hr>
		遍历第一中方式<br>
		<s:iterator value="users" var="x">
			<s:property value="#x.name"/>
		</s:iterator><br>
		遍历的第二种方式<br>
		<s:iterator value="users" status="index" var="user">
		-------------------------------------------------------------------<br>
			遍历元素总数:<s:property value="#index.count"/><br>
			遍历元素索引<s:property value="#index.index"/><br>
			当前是偶数？:<s:property value="#index.even"/><br>
			当前是奇数？:<s:property value="#index.odd"/><br>
			是第一个元素么？:<s:property value="#index.first"/><br>
			是最后一个元素么？:<s:property value="#index.last"/><br>
			获取元素属性:<s:property value="#user.name"/><br>
		-----------------------------------------------------------<br>
		</s:iterator>
		
		<hr>
		
		map遍历<br>
		<s:iterator value="map" var="m">
			<s:property value="#m.key"/>|<s:property value="#m.value"/><br>
		</s:iterator>
		------------------------------------------------------------------------<br>
		<s:iterator value="map">
			<s:property value="key"/>|<s:property value="value"/><br>
		</s:iterator>
		
</body>
</html>