package com.antteam.utils;

import java.io.Serializable;

public class PaginationBean<T> implements Serializable{

	private static final long serialVersionUID = -5587249940635839267L;

	private T bean;
	private Pagination pagination;
	
	public PaginationBean(T bean, Pagination pagination) {
		super();
		this.bean = bean;
		this.pagination = pagination;
	}
	
	public T getBean() {
		return bean;
	}


	public void setBean(T bean) {
		this.bean = bean;
	}

	public Pagination getPagination() {
		return pagination;
	}
	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}
	
	
}
