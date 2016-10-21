package com.DaoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Dao.RegisterDao;
import com.Model.RegisterModel;
@Transactional
@Repository
public class RegisterDaoImpl implements RegisterDao{
	@Autowired
	private SessionFactory sessionFactory;

	public RegisterDaoImpl(SessionFactory sessionFactory)
	{
		
		this.sessionFactory = sessionFactory;
	}

	public java.util.List<RegisterModel> List() {
		
		return null;
	}
	
	public RegisterModel get(String username) {
	String hql ="from RegisterModel where username=" + "'"+ username + "'";
		return getRegisterModel(hql);
	}
	
	public boolean update(RegisterModel register) {
	try
	{
	sessionFactory.getCurrentSession().update(register);
	}catch (Exception e)
	{
		e.printStackTrace();
		return false;
	}
	return true;	
	}

	public boolean delete(String username) {
	RegisterModel registerModel = new RegisterModel();
	registerModel.setUsername(username);
		try
		{
			sessionFactory.getCurrentSession().delete(registerModel);	
		}catch (Exception e)
		{
		e.printStackTrace();
		return false;
	}
		return true;
	}

	public RegisterModel isValidUser(String username, String password) {
	String hql ="from RegisterModel where username= '" + username + "' and " + " password ='" + password + "'";
	Query query = sessionFactory.getCurrentSession().createQuery(hql);
	@SuppressWarnings("unchecked")
	List<RegisterModel> list = (List<RegisterModel>) query.list();
	if(list != null && !list.isEmpty())
	{
	
		return list.get(0);
	}
	
	return null;
	}
	private RegisterModel getRegisterModel(String hql)
	{
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<RegisterModel> list = (List<RegisterModel>) query.list();
		if(list != null && !list.isEmpty())
		{
		
			return list.get(0);
		}
		
		return null;
	}
	
	public boolean save(RegisterModel registerModel){
		try
		{
			sessionFactory.getCurrentSession().save(registerModel);
		}catch (Exception e)
		{
	   e.printStackTrace();
	   return false;
		}
		return true;
	}

}
