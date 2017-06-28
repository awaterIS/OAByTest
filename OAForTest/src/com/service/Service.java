package com.service;

import java.io.Serializable;
import java.util.List;

import com.util.PageUtil;

public interface Service<T> {
	public void save(T o);
	public void update(T o);
	public void delete(T o);
	public T get(Serializable id);
	public List<T> queryData(T t);
	public PageUtil<T> queryDataByPage(int pageSize,int currentPage,T t); 
}
