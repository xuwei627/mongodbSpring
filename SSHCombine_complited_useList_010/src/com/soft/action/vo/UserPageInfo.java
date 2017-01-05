package com.soft.action.vo;

import java.util.List;

import com.soft.entity.Users;

public class UserPageInfo {

	private int id;
	private String username;
	private String password;
	private List<Users> list;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Users> getList() {
		return list;
	}
	public void setList(List<Users> list) {
		this.list = list;
	}
	
}
