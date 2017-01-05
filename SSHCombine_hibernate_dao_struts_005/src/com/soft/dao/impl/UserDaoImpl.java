package com.soft.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.soft.dao.UserDao;
import com.soft.entity.Users;
import com.soft.util.HibernateUtil;

public class UserDaoImpl implements UserDao {
	
	// 准备数据库链接
	SessionFactory sf = HibernateUtil.getSessionFactory();
	
	@Override
	public void add(Users user) {
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		s.save(user);
		s.getTransaction().commit();

	}

	@Override
	public boolean exist(Users user) {
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		Long count = (Long)s.createQuery("select count(*) from Users u where u.username = :username")
		.setString("username", user.getUsername())
		.uniqueResult();
		s.getTransaction().commit();
		return count > 0 ? true : false;
	}

}
