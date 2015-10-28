package com.antteam.utils;

public class Pagination {
	private int pageSize=10;
	private int min;//初始偏移量
	
	public Pagination(int currentPage) {
		super();
		setMin(currentPage,pageSize);
	}
	
	public Pagination(int currentPage, int pageSize) {
		super();
		this.pageSize = pageSize;
		setMin(currentPage,pageSize);
	}
	
	private int setMin(int currentPage,int pageSize){
		if(currentPage>1){
			this.min=(currentPage-1)*pageSize;
			return min;
		}
		return 0;
	}
	
	
}
