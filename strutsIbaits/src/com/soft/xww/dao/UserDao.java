package com.soft.xww.dao;

import java.util.List;

import com.soft.xww.model.Users;

public interface UserDao {

	/** 
	 * ��ѯ����
	 * @return
	 */
	public List<Users> select();
	/** 
	 * ������ѯ
	 */
	public Users selectById(int id);
	/**
	 * �û����ڷ�
	 */
	public Users selectUserExsit(Users user);
	/** 
	 * ��������
	 */
	public void update(Users user);
	/** 
	 * ��������
	 */
	public void insert(Users user);
	/** 
	 * ɾ������
	 */
	public void deleteById(int id);
}
