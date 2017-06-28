package com.dao;

import java.io.Serializable;
import java.util.List;

import com.util.PageUtil;

public interface Dao {
	public void save(Object o);
	public void update(Object o);
	public void delete(Object o);
	public List<?> queryData(String sql,Object...objects);
	public Object get(Class<?> cls, Serializable id); 
	public <E> PageUtil<E> queryDataByPage(String sql,int pageSize,int currentPage,Class<E> cls,Object...objects);
	/**
	 * 
	 * @param hql ”√hqlÕÍ≥…update£¨delete£¨insert
	 * @param objects
	 */
	public void updateRes(String hql,Object...objects);
}
