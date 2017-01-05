package com.soft.xww.action;

import com.opensymphony.xwork2.ActionSupport;
import com.soft.xww.model.Users;
import com.soft.xww.service.UserService;
import com.soft.xww.service.impl.UserServiceImpl;

public class UserLoginAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	// ”√ªß√˚
	private String username;
	// √‹¬Î
	private String password;
	// userService
	private UserService service = new UserServiceImpl();
	public String execute(){
		Users user = new Users();
		user.setUsername(username);
		user.setPassword(password);
		return service.userLogin(user);
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
	
	
}
