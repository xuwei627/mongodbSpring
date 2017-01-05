package com.soft.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.soft.dao.UserDao;
import com.soft.entity.Users;

public class UserDaoImpl implements UserDao {
	
	// 准备数据库链接
private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
	return hibernateTemplate;
}

public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	this.hibernateTemplate = hibernateTemplate;
}

	@Override
	public void add(Users user) {
		hibernateTemplate.save(user);
	}

	@Override
	public boolean exist(Users user) {
		List<Users> list = hibernateTemplate.find("from Users u where u.username='"+user.getUsername()+"'");
		if(list != null && list.size() > 0){
			return true;
		}
		return false;
	}

}
