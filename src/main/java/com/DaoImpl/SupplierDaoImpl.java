package com.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Dao.SupplierDao;
import com.Model.Supplier;

@Transactional
@Repository("supplierDao")
public class SupplierDaoImpl implements SupplierDao {
	@Autowired
	private SessionFactory sessionFactory;

	public SupplierDaoImpl(SessionFactory sessionFactory)
	{
		
		this.sessionFactory = sessionFactory;
	}

	public boolean save(Supplier supplier) {
		try
		{
			sessionFactory.getCurrentSession().save(supplier);
		}catch (Exception e)
		{
	   e.printStackTrace();
	   return false;
		}
		return true;
	}

	public boolean update(Supplier supplier) {
		try
		{
			sessionFactory.getCurrentSession().update(supplier);
		}catch (Exception e)
		{
	   e.printStackTrace();
	   return false;
		}
		return true;	
	
	}

	public boolean delete(String sid) {
	Supplier supplier = new Supplier();
	supplier.setSid(sid);
	try
	{
		sessionFactory.getCurrentSession().delete(supplier);
	}catch (Exception e)
	{
   e.printStackTrace();
   return false;
	}
	return true;	
	
	}
	
	
	public Supplier get(String sid) {
	String hql = "from Supplier where sid =" + "'" + sid + "'";
	Query query = sessionFactory.getCurrentSession().createQuery(hql);
	@SuppressWarnings("unchecked")
	List<Supplier> list = (List<Supplier>) query.list();
	if(list != null && !list.isEmpty())
	{
		return list.get(0);
	}
	return null;
}
@Transactional
	public List<Supplier> list() {
	@SuppressWarnings("unchecked")
	List<Supplier> list = (List<Supplier>) 
	          sessionFactory.getCurrentSession()
			.createCriteria(Supplier.class)
			.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

	return list;
			
	}
@Transactional
public Supplier getByName(String name) {

	String hql = "from Supplier where name=" + "'"+ name +"'";
	Query query = sessionFactory.getCurrentSession().createQuery(hql);
	
	@SuppressWarnings("unchecked")
	List<Supplier> list = (List<Supplier>) query.list();
	
	if (list != null && !list.isEmpty()) {
		return list.get(0);
	}
	
	return null;
	
}

public void saveOrUpdate(Supplier supplier) {
		sessionFactory.getCurrentSession().saveOrUpdate(supplier);
	

}

}
