package com.zyp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zyp.pojo.User;
import com.zyp.pojo.VInfo;
import com.zyp.service.VInfoService;
import com.zyp.util.CreateNumber;
import com.zyp.util.Pagination;

/**
 * 车辆 Controller
 * @author zyp
 * 负责转发和相应 vinfo 的操作
 */
@Controller
@RequestMapping("/vinfo ")
public class VInfoController {
	@Autowired
	@Qualifier("vinfoService")
	private VInfoService vinfoService;

	/**
	 * 返回车辆数据
	 * @return
	 */
	@RequestMapping("/toList")
	public String toList() {
		return "jsp/vinfo/list";
	}
	
	/**
	 * 返回车辆数据
	 * @param pagination
	 * @return data
	 */
	@RequestMapping("/list")
	@ResponseBody
	public String list(Pagination pagination){
		String data=vinfoService.vinfoList(pagination);
		return data;
	}
	
	/**
	 * 注册车辆
	 * @param vinfo
	 * @return 状态
	 */
	@RequestMapping("/regist")
	@ResponseBody
	public String regist(VInfo vinfo) {
		vinfo.setVnumber(CreateNumber.generateRandomStr(8));
		vinfoService.addVInfo(vinfo);
		return "ok";
	}
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@RequestMapping("/detele")
	@ResponseBody
	public String delete(VInfo vinfo){
		System.out.println("-----------------------------------------------------");
		System.out.println(vinfo.getId());
		vinfoService.deleteVInfo(vinfo);
		return "ok";
	}
}
