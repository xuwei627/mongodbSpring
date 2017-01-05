package com.soft.xww.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 创建action第三种方式  也是项目中最常用的方式  或者说正常都是用这个方式
 * 实现ActionSupport。重写execute方法  返回值为String
 * @author xuweiwei
 *
 */
public class ActionTest3 extends ActionSupport{

	@Override
	public String execute() {
		return SUCCESS;
	}

}
