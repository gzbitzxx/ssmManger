package com.zyp.mapper;

import java.util.List;

import com.zyp.pojo.User;
import com.zyp.util.Pagination;

public interface UserMapper {
	public void insertUser(User user);
	public List<User> userlist(Pagination pagination);
	public int usercount();
}
