package com.soft.xww.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.soft.xww.model.User;

/**
 * model  ������ʵ��modelDriven�ӿ�ʵ��  �������ʱ������Լ�new User��������
 * 
 * @author xuweiwei
 *
 */
public class UserVaildateAction extends ActionSupport{

	public String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String check(){
		if(name==null || !name.equals("admin")){
			this.addFieldError("name", "���ִ���");
			return "error";
		}
		return "success";
	}
	
}
