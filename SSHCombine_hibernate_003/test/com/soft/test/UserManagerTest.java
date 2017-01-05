package com.soft.test;

import static org.junit.Assert.fail;
import junit.framework.Assert;

import org.junit.Test;

import com.soft.entity.Users;
import com.soft.service.UserManager;

public class UserManagerTest {
	UserManager um = new UserManager();
	@Test
	public void testExits() throws Exception{
		Users user = new Users();
		user.setUsername("nihao");
		Assert.assertEquals(true, um.exits(user));
	}

	@Test
	public void testAdd() throws Exception {
		Users user = new Users();
		user.setUsername("aaa");
		user.setPassword("aaa");
		if(um.exits(user)){
			fail(" ”√ªß¥Ê‘⁄  ");
		}else{
			um.add(user);
		}
	}
}
