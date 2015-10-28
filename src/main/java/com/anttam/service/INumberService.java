package com.anttam.service;

import java.util.List;

import com.antteam.bean.Number;
import com.antteam.bean.NumberPagination;

public interface INumberService {
	public int insertSelective(Number record);
	
	public List<Number> selectNumberList(NumberPagination numberPagination);
	
	public int getcount();
	
	public  Number selectByPrimaryKey(Long order_id);
}
