package com.anttam.service;

import java.util.List;

import com.antteam.bean.User;
import com.antteam.utils.PaginationBean;

public interface IUserService {
	
    int deleteByPrimaryKey(Integer id) throws Exception;

    int insertSelective(User record) throws Exception;

    User selectByPrimaryKey(Integer id) throws Exception;

    int updateByPrimaryKeySelective(User record) throws Exception;

    List<User> query(PaginationBean<User> paginationBean) throws Exception;
    
    int count(PaginationBean<User> paginationBean) throws Exception;
}
