package com.soft.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OgnlAction {

	private String username;
	private User user;
	private Cat cat;

	private List<User> users = new ArrayList<User>();
	private Map<String ,User> map = new HashMap<String, User>();
	private Set<User> set = new HashSet<User>();
	public String execute(){
		User user1 = new User(21);
		User user2 = new User(22);
		User user3 = new User(23);
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		
		map.put("a", user1);
		map.put("b", user2);
		map.put("c", user3);
		
		set.add(user1);
		set.add(user2);
		set.add(user3);
		return "success";
	}

	public Cat getCat() {
		return cat;
	}
	
	public User getUser() {
		return user;
	}

	public String getUsername() {
		return username;
	}

	public String m(){
		return "ognlAction putong method";
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Map<String, User> getMap() {
		return map;
	}

	public void setMap(Map<String, User> map) {
		this.map = map;
	}

	public Set<User> getSet() {
		return set;
	}

	public void setSet(Set<User> set) {
		this.set = set;
	}
}
