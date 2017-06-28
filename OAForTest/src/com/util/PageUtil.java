package com.util;

import java.util.ArrayList;
import java.util.List;

public class PageUtil<E> {
	private int currentPage;
	private int pageSize;
	private int totalPage;
	private int totalRecord;
	private List<E> data=new ArrayList<E>();
	public PageUtil(int currentPage,int totalRecord,int pageSize,List<E> data) {
		super();
		// TODO Auto-generated constructor stub
		this.currentPage=currentPage;
		this.pageSize=pageSize;
		if (totalRecord%pageSize==0) {
			this.totalPage=totalRecord/pageSize;
		}else{
			this.totalPage=totalRecord/pageSize+1;
		}
		this.totalRecord=totalRecord;
		this.data=data;
	}
	public List<E> getData() {
		return data;
	}
	public void setData(List<E> data) {
		this.data = data;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
}
