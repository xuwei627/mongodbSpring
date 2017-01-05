package com.soft.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.soft.entity.User;

public class UserManager {

	public boolean exits(User user) throws Exception{
		// 准备数据库链接
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cshop","root","123456");
		String sql1 = "select count(*) from users where username = ?";
		PreparedStatement ps = conn.prepareStatement(sql1);
		ps.setString(1, user.getUsername());
		ResultSet rs = ps.executeQuery();
		rs.next();
		int count = rs.getInt(1);
		ps.close();
		conn.close();
		if(count>0){
			return true;
		}
		return false;
	}
	
	public void add(User user) throws Exception{
		// 准备数据库链接
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cshop","root","123456");
		String sql = "insert into users values(null,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps = conn.prepareStatement(sql);
		ps.setString(1, user.getUsername());
		ps.setString(2, user.getPassword());
		ps.executeUpdate();
		ps.close();
		conn.close();
	}
}
