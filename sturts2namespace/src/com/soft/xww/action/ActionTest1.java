package com.soft.xww.action;

/**
 * 创建action第一种方式  什么都不继承都不实现。但是必须自己写个execute方法  返回值为String
 * @author xuweiwei
 *
 */
public class ActionTest1 {
	
	private String name;
	private int age;
	private int xingbie;
	public String execute(){
		return "success";
	}
	public String add(){
		System.out.print("name : " + name);
		System.out.print("age : " + age);
		System.out.print("sex : " + xingbie);
		return "success";
	}
	public String update(){
		return "update";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return xingbie;
	}
	public void setSex(int sex) {
		this.xingbie = sex;
	}
}
