package com.soft.xww.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * ��ȡwebԪ��  request  session application֮ʵ�ֶ�Ӧ�Ľӿ�
 *  	RequestAware SessionAware ApplicationAware
 *  	�׳�IoC���Ʒ�ת
 * @author xuweiwei
 *
 */
@SuppressWarnings("serial")
public class LoginAction4 extends ActionSupport implements ServletRequestAware {

	public HttpServletRequest request;
	public HttpSession session;
	public ServletContext application;
	
	public String execute(){
		request.setAttribute("r1", "implhttprrrr");
		session.setAttribute("s1", "implhttpssss");
		application.setAttribute("a1", "implhttpaaaa");
		return SUCCESS;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		this.session = request.getSession();
		this.application = session.getServletContext();
		
	}
	
	
}
