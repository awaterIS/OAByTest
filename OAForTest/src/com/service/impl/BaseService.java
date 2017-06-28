package com.service.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.dao.Dao;
import com.service.Service;
import com.util.PageUtil;
@Component
public class BaseService<T> implements Service<T>{
	/**
	 * 通过调用Dao中的方法
	 */
	@Resource(name="baseDao")
	protected Dao dao;
	public void save(Object o) {
		// TODO Auto-generated method stub
		dao.save(o);
	}

	public void update(Object o) {
		// TODO Auto-generated method stub
		dao.update(o);
	}

	public void delete(Object o) {
		// TODO Auto-generated method stub
		dao.delete(o);
	}
	/**
	 * 根据子类的泛型类型动态生成hql语句。 如：from Backusser
	 * 如果有特殊的查询要求：按条件查询，在子类中重写该方法。
	 */
	private String getClassName(){
		//为了得到泛型类对象
		Type type = this.getClass().getGenericSuperclass();
		ParameterizedType paramtype = (ParameterizedType)type;
		Type ptype = paramtype.getActualTypeArguments()[0];
		System.out.println(ptype);
		String className = ptype.toString().replace("class", "");
		return className.trim();
	}
	public T get(Serializable id) {
		// TODO Auto-generated method stub
		try {
			Class<?> cls = Class.forName(getClassName());
			return (T)dao.get(cls,id);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<T> queryData(T t) {
		// TODO Auto-generated method stub
		String hql = "from "+getClassName();
		System.out.println(hql);
		
		return (List<T>) dao.queryData(hql);
	}

	public PageUtil<T> queryDataByPage(int pageSize, int currentPage, Object t) {
		String hql="from "+getClassName();
		try {
			Class cls = Class.forName(getClassName());
			return dao.queryDataByPage(hql, pageSize, currentPage, cls);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
