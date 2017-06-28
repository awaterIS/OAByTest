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
	@Resource(name="hibernateTemplate") //�������ļ��е�hibernateTemplateע�뵽��������
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
		// ��hql���죬����Ϊ�˷�ҳ��׼������ѯ�ж���������׼��
		//select count(*) from XXX
		String countHql = "select count(*)" + sql.substring(sql.indexOf("from"));
		System.out.println(countHql);
		List<Long> totalRecordList = template.find(countHql, objects);
		int totalRecord = 0;
		if (totalRecordList !=null && totalRecordList.size()>0) {
			//ֻ��ȡlist�����еĵ�һ�����ݼ���
			totalRecord = totalRecordList.get(0).intValue();
		}
		//ͨ��HibernateCallback�ӿڣ���Spring�ص� �ӿ��е�doInHibernate����������һ��Session�����ڴ˷����оͿ�����
		   //hiernate session������в�ѯ������
		//��ҳ��ѯ�ڲ���
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
