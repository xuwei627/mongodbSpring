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
public class ModelDrvenAction extends ActionSupport implements ModelDriven<User>{

	public String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User user = new User();
	
	public String add(){
		System.out.print(user.getName());
		return "success";
	}
	
	@Override
	public User getModel() {
		return user;
	}

}
