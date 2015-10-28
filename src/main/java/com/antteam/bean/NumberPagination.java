package com.antteam.bean;

import java.io.Serializable;

import com.antteam.utils.Pagination;

public class NumberPagination implements Serializable{

	private static final long serialVersionUID = -5587249940635839267L;

	private Number number;
	private Pagination pagination;
	
	public NumberPagination(Number number, Pagination pagination) {
		super();
		this.number = number;
		this.pagination = pagination;
	}
	
	public Number getNumber() {
		return number;
	}
	public void setNumber(Number number) {
		this.number = number;
	}
	public Pagination getPagination() {
		return pagination;
	}
	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}
	
	
}
