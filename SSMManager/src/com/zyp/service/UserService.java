package com.zyp.service;



import com.zyp.pojo.User;
import com.zyp.util.Pagination;

/**
 * 用户 server
 * @author zyp
 * 定义操作用户的接口
 */
public interface UserService {
	
	//添加用户
	public void addUser(User user);
	
	//分页获取用户
	public String userList(Pagination pagination);
	
	//删除
	public void deleteUser(User user);
}
