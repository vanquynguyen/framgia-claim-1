package com.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.model.Users;

@Repository("loginDAO")
public class LoginDAOImpl implements LoginDAO{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@SuppressWarnings("unchecked")
	public Users getUserDetailsByEmailAndPassword(String email, String password) {
		DetachedCriteria detachedCriteria =  DetachedCriteria.forClass(Users.class);
		detachedCriteria.add(Restrictions.eq("email", email));
		detachedCriteria.add(Restrictions.eq("password", password));
		List<Users> findByCriteria = (List<Users>) hibernateTemplate.findByCriteria(detachedCriteria);
		if(findByCriteria !=null && findByCriteria.size()>0)
		return findByCriteria.get(0);
		else
			return null;
	}
}
