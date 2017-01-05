package com.soft.xww.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 获取web元素  request  session application之实现对应的接口
 *  	RequestAware SessionAware ApplicationAware
 *  	俗称IoC控制反转
 * @author xuweiwei
 *
 */
@SuppressWarnings("serial")
public class LoginAction2 extends ActionSupport implements RequestAware,SessionAware,ApplicationAware {

	public Map<String, Object> request;
	public Map<String, Object> session;
	public Map<String, Object> application;
	
	public String execute(){
		request.put("r1", "implrrrr");
		session.put("s1", "implssss");
		application.put("a1", "implaaaa");
		return SUCCESS;
	}

	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	
	
}
