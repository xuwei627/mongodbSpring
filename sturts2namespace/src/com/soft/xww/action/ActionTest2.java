package com.soft.xww.action;

import com.opensymphony.xwork2.Action;

/**
 * 创建action第二种方式  实现Action。重写execute方法  返回值为String
 * @author xuweiwei
 *
 */
public class ActionTest2 implements Action{

	@Override
	public String execute() {
		return SUCCESS;
	}

}
