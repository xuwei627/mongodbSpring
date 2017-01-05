package com.soft.xww.action;

import com.opensymphony.xwork2.ActionSupport;
import com.soft.xww.model.User;

public class HelloAction extends ActionSupport{

	public User user;
	public String add(){
		System.out.println("name = " + user.getName());
		System.out.println("pass = " + user.getPass());
		return "success";
	}
	
	public String del(){
		return "success";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
