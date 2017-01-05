package com.soft.action;

public class User {

	public User(){
		
	}
	
	public User(int age){
		this.age = age;
		toString();
	}
	private int age;
	private String name = "niha";
	public int getAge() {
		return age;
	}

	/**
	 * 如果里面有带参数构造函数，必须有一个无参数构造函数。
	 * 不然struts2 实例化的时候找不到对应的构造函数，无法实例化
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return ""+age;
	}
}
