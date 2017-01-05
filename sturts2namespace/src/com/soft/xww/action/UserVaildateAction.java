package com.soft.xww.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.soft.xww.model.User;

/**
 * model  还可以实现modelDriven接口实现  不过这个时候必须自己new User（）对象
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
			this.addFieldError("name", "名字错了");
			return "error";
		}
		return "success";
	}
	
}
