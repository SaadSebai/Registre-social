package com.master.registre.dao;

import java.util.List;

public interface IDao<T> {

	public List<T> findAll();
	public T findById(long id);
	public T findByEmail(String email);
	public void save(T p);
	public void update(T p);
	public void delete(T p);
	
}
