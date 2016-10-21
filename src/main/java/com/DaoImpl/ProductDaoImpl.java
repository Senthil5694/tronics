package com.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Dao.ProductDao;
import com.Model.Product;

@Transactional
@Repository("productDao")
public class ProductDaoImpl implements  ProductDao {
	@Autowired
	private SessionFactory sessionFactory;

	public ProductDaoImpl(SessionFactory sessionFactory)
	{
		
		this.sessionFactory = sessionFactory;
	}

	public boolean save(Product product) {
		try
		{
			sessionFactory.getCurrentSession().save(product);
		}catch (Exception e)
		{
	  e.printStackTrace();
	  return false;
		}
		return true;
	}
	public boolean update(Product product) {
		
		try
		{
			sessionFactory.getCurrentSession().update(product);
		}catch (Exception e)
		{
	  e.printStackTrace();
	  return false;
		}
		return true;
	}

	public boolean delete(String pid) {
	Product product = new Product();
	product.setPid(pid);
		try
		{
			sessionFactory.getCurrentSession().delete(product);
		}catch (Exception e)
		{
	  e.printStackTrace();
	  return false;
		}
		return true;
	}

	public Product get(String pid) {
	String hql = "from Product where pid =" + "'" + pid + "'";
	Query query = sessionFactory.getCurrentSession().createQuery(hql);
	@SuppressWarnings("unchecked")
	List<Product> list = (List<Product>) query.list();
	if(list != null && !list.isEmpty())
	{
		return list.get(0);
	}
	return null;
}

	public List<Product> list() {
		@SuppressWarnings("unchecked")
		List<Product> list = (List<Product>) 
		          sessionFactory.getCurrentSession()
				.createCriteria(Product.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return list;
		
	}

	public void saveOrUpdate(Product product) {
		sessionFactory.getCurrentSession().saveOrUpdate(product);
		
	}

}
