package com.antteam.mapper;

import java.util.List;

import com.antteam.bean.Number;
import com.antteam.bean.NumberPagination;

public interface NumberMapper {
    public int deleteByPrimaryKey(String order_id);

    public int insert(Number record);

    public int insertSelective(Number record);

    public  Number selectByPrimaryKey(Long order_id);

    public int updateByPrimaryKeySelective(Number record);

    public int updateByPrimaryKey(Number record);
    
    public List<Number> selectNumberList(NumberPagination numberPagination);
    
    public int count();
}