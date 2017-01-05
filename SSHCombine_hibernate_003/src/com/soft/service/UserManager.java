package com.soft.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.soft.entity.Users;
import com.soft.util.HibernateUtil;

public class UserManager {

	public boolean exits(Users user) throws Exception{
		// 准备数据库链接
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		Long count = (Long)s.createQuery("select count(*) from Users u where u.username = :username")
		.setString("username", user.getUsername())
		.uniqueResult();
		s.getTransaction().commit();
		return count > 0 ? true : false;
	}
	
	public void add(Users user) throws Exception{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		s.save(user);
		s.getTransaction().commit();
	}
}
