package com.anttam.service;

import com.antteam.bean.User;

public interface IUserService {
	
    int deleteByPrimaryKey(Integer id) throws Exception;

    int insertSelective(User record) throws Exception;

    User selectByPrimaryKey(Integer id) throws Exception;

    int updateByPrimaryKeySelective(User record) throws Exception;

}
