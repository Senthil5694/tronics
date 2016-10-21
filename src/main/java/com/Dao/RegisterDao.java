package com.Dao;

import java.util.List;

import com.Model.RegisterModel;

public interface RegisterDao {
	public List<RegisterModel> List();
	public RegisterModel get(String username);
	public boolean update(RegisterModel register);
	public boolean delete(String username);
	public RegisterModel isValidUser(String username, String password);
	public boolean save(RegisterModel register);
}
