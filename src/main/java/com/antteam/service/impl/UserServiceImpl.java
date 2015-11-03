package com.antteam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anttam.service.IUserService;
import com.antteam.bean.User;
import com.antteam.mapper.RoleMapper;
import com.antteam.mapper.UserMapper;
import com.antteam.utils.PaginationBean;

@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private UserMapper userDao;
	public int deleteByPrimaryKey(Integer id) {
		return userDao.deleteByPrimaryKey(id);
	}

	public int insertSelective(User record) {
		return userDao.insertSelective(record);
	}

	public User selectByPrimaryKey(Integer id) {
		return userDao.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(User record) {
		return userDao.updateByPrimaryKeySelective(record);
	}

	public List<User> query(PaginationBean<User> paginationBean) throws Exception {
		return userDao.query(paginationBean);
	}

	public int count(PaginationBean<User> paginationBean) throws Exception {
		return userDao.count(paginationBean);
	}

}
