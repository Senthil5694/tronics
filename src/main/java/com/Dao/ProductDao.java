package com.Dao;

import java.util.List;

import com.Model.Product;

public interface ProductDao {
	public boolean save(Product product);
	public boolean update(Product product);
	public boolean delete(String pid);
	public Product get(String pid);
	public List<Product> list();
	public void saveOrUpdate(Product product);
	
}
