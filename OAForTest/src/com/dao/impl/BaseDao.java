package com.dao.impl;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.dao.Dao;
import com.util.PageUtil;
@Component
public class BaseDao implements Dao{
	@Resource(name="hibernateTemplate") //将配置文件中的hibernateTemplate注入到此属性中
	private HibernateTemplate template;
	public void save(Object o) {
		// TODO Auto-generated method stub
		template.save(o);
	}

	
	public void update(Object o) {
		// TODO Auto-generated method stub
		template.update(o);
	}

	public void delete(Object o) {
		// TODO Auto-generated method stub
		template.delete(o);
	}

	
	public List<?> queryData(String sql, Object... objects) {
		// TODO Auto-generated method stub
		return template.find(sql,objects);
	}


	public Object get(Class<?> cls, Serializable id) {
		// TODO Auto-generated method stub
		return template.get(cls, id);
	}


	public <E> PageUtil<E> queryDataByPage(final String sql,final int pageSize,
			final int currentPage, Class<E> cls,final Object... objects) {
		// 将hql改造，这是为了分页的准备，查询有多少数量的准备
		//select count(*) from XXX
		String countHql = "select count(*)" + sql.substring(sql.indexOf("from"));
		System.out.println(countHql);
		List<Long> totalRecordList = template.find(countHql, objects);
		int totalRecord = 0;
		if (totalRecordList !=null && totalRecordList.size()>0) {
			//只获取list集合中的第一条数据即可
			totalRecord = totalRecordList.get(0).intValue();
		}
		//通过HibernateCallback接口，由Spring回调 接口中的doInHibernate方法，传递一个Session对象，在此方法中就可以用
		   //hiernate session对象进行查询操作。
		//分页查询内部类
		List queryList = template.executeFind(new HibernateCallback() {
			
		
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				// TODO Auto-generated method stub
				Query query = session.createQuery(sql);
				query.setFirstResult(pageSize*(currentPage-1));
				query.setMaxResults(pageSize);
				if (objects != null) {
					for (int i = 0; i < objects.length; i++) {
						query.setParameter(i, objects[i]);
					}
				}
				return query.list();
			}
		});
		PageUtil<E> pageUtil = new PageUtil<E>(currentPage, totalRecord, pageSize, queryList);
		return pageUtil;
	}

	
	public void updateRes(final String hql,final Object... objects) {
		// TODO Auto-generated method stub
		Object execute = template.execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				// TODO Auto-generated method stub
				Query query = session.createQuery(hql);
				if (objects != null) {
					for (int i = 0; i < objects.length; i++) {
						query.setParameter(i, objects[i]);
					}
				}
				return query.executeUpdate();
			}
		});
	}

}
