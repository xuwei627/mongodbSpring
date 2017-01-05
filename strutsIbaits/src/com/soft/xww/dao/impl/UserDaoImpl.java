package com.soft.xww.dao.impl;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.soft.xww.dao.UserDao;
import com.soft.xww.model.Users;

public class UserDaoImpl implements UserDao {

	private static SqlMapClient sqlMapClient= null;
	static {
		try {
			Reader reader = Resources.getResourceAsReader("sqlMapConfig.xml");
			sqlMapClient = (SqlMapClient)SqlMapClientBuilder.buildSqlMapClient(reader);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public List<Users> select() {
		List<Users> list = null;
		try {
			list =  sqlMapClient.queryForList("selectUsers");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Users selectById(int id) {
		Users user = null;
		try {
			user = (Users)sqlMapClient.queryForObject("selectById", id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public void update(Users user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insert(Users user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Users selectUserExsit(Users user) {
		Users users = null;
		try {
			users = (Users)sqlMapClient.queryForObject("selectUserExsit", user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

}
