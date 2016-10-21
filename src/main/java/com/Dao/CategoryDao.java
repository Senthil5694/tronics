package com.Dao;

import java.util.List;

import com.Model.Category;

public interface CategoryDao {
	public boolean save(Category category);
	public boolean update(Category category);
	public boolean delete(String cid);
	public Category get(String cid);
	public List<Category> list();
	public Category getByName(String cname);
	public void saveOrUpdate(Category category);
}
