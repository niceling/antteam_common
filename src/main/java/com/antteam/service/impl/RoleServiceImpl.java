package com.antteam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.anttam.service.IRoleService;
import com.antteam.mapper.RoleMapper;

public class RoleServiceImpl implements IRoleService{
	@Autowired
	private RoleMapper roleDao;
}
