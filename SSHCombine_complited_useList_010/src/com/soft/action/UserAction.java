package com.soft.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.soft.action.vo.UserPageInfo;
import com.soft.entity.Users;
import com.soft.service.UserManager;

@Controller("index")
public class UserAction extends ActionSupport implements ModelDriven<UserPageInfo>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UserPageInfo userPageInfo = new UserPageInfo();
	
	private Users users;
	private UserManager manager;
	public String execute(){
		userPageInfo.setList(manager.selctUser());
		return SUCCESS;
		
	}
	
	public UserManager getManager() {
		return manager;
	}

	@Resource
	public void setManager(UserManager manager) {
		this.manager = manager;
	}

	@Override
	public UserPageInfo getModel() {
		return userPageInfo;
	}
	
}
