package com.soft.xww.dao;

import java.util.List;

import com.soft.xww.model.Users;

public interface UserDao {

	/** 
	 * 查询数据
	 * @return
	 */
	public List<Users> select();
	/** 
	 * 主键查询
	 */
	public Users selectById(int id);
	/**
	 * 用户存在否
	 */
	public Users selectUserExsit(Users user);
	/** 
	 * 更新数据
	 */
	public void update(Users user);
	/** 
	 * 增加数据
	 */
	public void insert(Users user);
	/** 
	 * 删除数据
	 */
	public void deleteById(int id);
}
