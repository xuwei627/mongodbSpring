package com.soft.xww.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction1 extends ActionSupport{

	public Map request;
	public Map session;
	public Map application;
	
	public LoginAction1(){
		request = (Map)ActionContext.getContext().get("request");
		session = ActionContext.getContext().getSession();
		application = ActionContext.getContext().getApplication();
	}
	
	public String execute(){
		request.put("r1", "rrrr");
		session.put("s1", "ssss");
		application.put("a1", "aaaa");
		return SUCCESS;
	}
	
	
}
