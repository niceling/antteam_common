package com.antteam.utils;

import java.io.Serializable;

public class PaginationBean<T> implements Serializable{

	private static final long serialVersionUID = -5587249940635839267L;

	private T bean;
	private int page=1;//当前页码
	private int rows=10;//每页几条记录
	private int min;
	public PaginationBean() {
		setMin(page,rows);
	}
	public PaginationBean(T bean, Pagination pagination) {
		super();
		this.bean = bean;
	}
	
	public T getBean() {
		return bean;
	}

	public void setBean(T bean) {
		this.bean = bean;
	}
	
	private int setMin(int currentPage,int pageSize){
		if(currentPage>1){
			this.min=(currentPage-1)*pageSize;
			return min;
		}
		return 0;
	}
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	
}
