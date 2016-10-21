package com.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Dao.CategoryDao;
import com.Model.Category;

@Transactional
@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {
	@Autowired
	private SessionFactory sessionFactory;
	
@Autowired
	public CategoryDaoImpl(SessionFactory sessionFactory)
	{
		
		try {
			this.sessionFactory = sessionFactory;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

public boolean save(Category category) {
		try
		{
			sessionFactory.getCurrentSession().save(category);
		}catch (Exception e)
		{
	   e.printStackTrace();
	   return false;
		}
		return true;
	}

	public boolean update(Category category) {
		try
		{
			sessionFactory.getCurrentSession().update(category);	
		}catch (Exception e)
		{
		e.printStackTrace();
		return false;
	}
		return true;
	}

	public boolean delete(String cid){
	Category category = new Category();
	category.setCid(cid);
	try
	{
		sessionFactory.getCurrentSession().delete(category);	
	}catch (Exception e)
	{
	e.printStackTrace();
	return false;
}
	return true;
}

	public Category get(String cid) {
	String hql = "from Category where cid =" + "'" + cid + "'";
	Query query = sessionFactory.getCurrentSession().createQuery(hql);
	@SuppressWarnings("unchecked")
	List<Category> list = (List<Category>) query.list();
	if(list != null && !list.isEmpty())
	{
		return list.get(0);
	}
	return null;
}

	

	public List<Category> list() {	
		@SuppressWarnings("unchecked")
		List<Category> list = (List<Category>) 
		          sessionFactory.getCurrentSession()
				.createCriteria(Category.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return list;	
	}

public Category getByName(String cname) {
	
	String hql = "from Category where cname=" + "'"+ cname +"'";
	Query query = sessionFactory.getCurrentSession().createQuery(hql);
	
	@SuppressWarnings("unchecked")
	List<Category> list = (List<Category>) query.list();
	
	if (list != null && !list.isEmpty()) {
		return list.get(0);
	}
	
	return null;
}

public void saveOrUpdate(Category category) {

		sessionFactory.getCurrentSession().saveOrUpdate(category);	
}
}
