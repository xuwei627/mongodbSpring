package com.soft.action;

public class Cat {

	private Dog friend;

	public Dog getFriend() {
		return friend;
	}

	public void setFriend(Dog friend) {
		this.friend = friend;
	}
	public String miao(){
		return "jiao jiao ";
	}
	
	public static String name = "odi";
	public static String mao(){
		return "mao";
	}
	
}
