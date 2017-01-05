package com.soft.xww.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 获取web元素  request  session application之实现对应的接口
 *  	RequestAware SessionAware ApplicationAware
 *  	俗称IoC控制反转
 * @author xuweiwei
 *
 */
@SuppressWarnings("serial")
public class DongtaiAction extends ActionSupport {

	private String r;
	
	public String execute(){
		r="/dongtai.jsp";
		return SUCCESS;
	}

	public String getR() {
		return r;
	}

	public void setR(String r) {
		this.r = r;
	}
	
	
}
