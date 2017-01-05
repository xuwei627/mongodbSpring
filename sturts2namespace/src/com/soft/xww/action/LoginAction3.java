package com.soft.xww.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction3 extends ActionSupport{

	public HttpServletRequest request;
	public HttpSession session;
	public ServletContext application;
	
	public LoginAction3(){
		request = ServletActionContext.getRequest();
		session = request.getSession();
		application = session.getServletContext();
	}
	
	public String execute(){
		request.setAttribute("r1", "httprrrr");
		session.setAttribute("s1", "httpssss");
		application.setAttribute("a1", "httpaaaa");
		return SUCCESS;
	}
	
	
}
