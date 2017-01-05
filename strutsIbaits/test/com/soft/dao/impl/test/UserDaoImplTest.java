package com.soft.dao.impl.test;

import java.util.List;

import org.junit.Test;

import com.soft.xww.dao.UserDao;
import com.soft.xww.dao.impl.UserDaoImpl;
import com.soft.xww.model.Users;

public class UserDaoImplTest {
	UserDao dao = new UserDaoImpl();
	@Test
	public void testSelect() {
		List<Users> list = dao.select();
		for(Users user : list){
			System.out.println(user);
		}
			
	}
	
	@Test
	public void testSelectById() {
			System.out.println(dao.selectById(2));
	}

}
