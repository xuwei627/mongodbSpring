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
	 * ��������д��������캯����������һ���޲������캯����
	 * ��Ȼstruts2 ʵ������ʱ���Ҳ�����Ӧ�Ĺ��캯�����޷�ʵ����
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
