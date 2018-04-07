package com.zyp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zyp.pojo.User;
import com.zyp.service.UserService;
import com.zyp.util.Pagination;
import com.zyp.util.SecurityUtil;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	@Qualifier("userService")
	private UserService userService;

	@RequestMapping("/toList")
	public String toList() {
		return "jsp/user/list";
	}
	@RequestMapping("/list")
	@ResponseBody
	public String list(Pagination pagination){
		System.out.println(pagination);
		System.out.println("-------------------------------");
		String data=userService.userlist(pagination);
		System.out.println(data);
		return data;
	}
	@RequestMapping("/regist")
	@ResponseBody
	public String regist(User user) {
		user.setPassword(SecurityUtil.strToMD5(user.getPassword()));
		//userService.insertUser(user);
		System.out.println(user.getPassword()+"------------------------");
		return "ok";
	}
}
