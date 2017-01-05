<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*,java.util.*"%>
    
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/"+path+"/";

	// 获取页面输入注册信息
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	String password2 = request.getParameter("password2");

	// 准备数据库链接
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cshop","root","123456");
	String sql1 = "select count(*) from users where username = ?";
	PreparedStatement ps = conn.prepareStatement(sql1);
	ps.setString(1, username);
	ResultSet rs = ps.executeQuery();
	rs.next();
	int count = rs.getInt(1);
	if(count>0){
		response.sendRedirect("registFail.jsp");
		ps.close();
		conn.close();
		return;
	}
	
	String sql = "insert into users values(null,?,?)";
	ps = conn.prepareStatement(sql);
	ps.setString(1, username);
	ps.setString(2, password);
	ps.executeUpdate();
	ps.close();
	conn.close();
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