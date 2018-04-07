package com.zyp.service;

import java.util.List;

import com.zyp.pojo.User;
import com.zyp.util.Pagination;

public interface UserService {
	public void insertUser(User user);
	public String userlist(Pagination pagination);
}
