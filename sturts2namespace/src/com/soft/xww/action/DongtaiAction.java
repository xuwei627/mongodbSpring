package com.soft.xww.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * ��ȡwebԪ��  request  session application֮ʵ�ֶ�Ӧ�Ľӿ�
 *  	RequestAware SessionAware ApplicationAware
 *  	�׳�IoC���Ʒ�ת
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
