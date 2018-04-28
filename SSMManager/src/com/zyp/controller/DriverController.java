package com.zyp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zyp.pojo.Driver;
import com.zyp.pojo.User;
import com.zyp.service.DriverService;
import com.zyp.util.CreateNumber;
import com.zyp.util.Pagination;
import com.zyp.util.SecurityUtil;
/**
 * 驾驶员 Controller
 * @author zyp
 * 负责转发和相应 驾驶员 的操作
 */
@Controller
@RequestMapping("/driver")
public class DriverController {
	@Autowired
	@Qualifier("driverService")
	private DriverService driverService;

	/**
	 * 返回用户数据
	 * @return
	 */
	@RequestMapping("/toList")
	public String toList() {
		
		return "jsp/dirver/list";
	}
	
	/**
	 * 返回用户数据
	 * @param pagination
	 * @return data
	 */
	@RequestMapping("/list")
	@ResponseBody
	public String list(Pagination pagination){
		String data=driverService.driverList(pagination);
		System.out.println(data);
		return data;
	}
	
	/**
	 * 注册用户
	 * @param user
	 * @return 状态
	 */
	@RequestMapping("/regist")
	@ResponseBody
	public String regist(Driver driver) {
		driver.setNumber(CreateNumber.generateRandomStr(8));
		driverService.addDriver(driver);
		return "ok";
	}
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@RequestMapping("/detele")
	@ResponseBody
	public String delete(Driver driver){
		System.out.println("-----------------------------------------------------");
		System.out.println(driver.getId());
		driverService.deleteDriver(driver);
		return "ok";
	}
}
