package com.zyp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.zyp.mapper.UserMapper;
import com.zyp.pojo.User;
import com.zyp.service.UserService;
import com.zyp.util.Pagination;
import com.zyp.util.Util;

public class UserServiceImpl implements UserService {
	@Autowired
	@Qualifier("userMapper")
	private UserMapper userMapper;

	public void insertUser(User user) {
		userMapper.insertUser(user);
	}

	@Override
	public String userlist(Pagination pagination) {
		List<User> users=userMapper.userlist(pagination);
		pagination.setCount(userMapper.usercount());
		Util<User> util=new Util<User>();
		return util.SplitPage(users, pagination.getCount());
	}

}
