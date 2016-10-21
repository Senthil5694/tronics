package com.Dao;

import java.util.List;

import com.Model.Supplier;

public interface SupplierDao {
	public boolean save(Supplier supplier);
	public boolean update(Supplier supplier);
	public boolean delete(String sid);
	public Supplier get(String sid);
	public List<Supplier> list();
	public Supplier getByName(String name);
	public void saveOrUpdate(Supplier supplier);
}
