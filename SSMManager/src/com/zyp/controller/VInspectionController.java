package com.zyp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zyp.pojo.User;
import com.zyp.pojo.VInspection;
import com.zyp.service.VInspectionService;
import com.zyp.util.CreateNumber;
import com.zyp.util.Pagination;
import com.zyp.util.SecurityUtil;
/**
 * 年审 Controller
 * @author zyp
 * 负责转发和相应 vinspection 的操作
 */
@Controller
@RequestMapping("/vinspection")
public class VInspectionController {
	@Autowired
	private VInspectionService vinspectionService;

	/**
	 * 返回年审数据
	 * @return
	 */
	@RequestMapping("/toList")
	public String toList() {
		return "jsp/vinspection/list";
	}
	
	/**
	 * 返回年审数据
	 * @param pagination
	 * @return data
	 */
	@RequestMapping("/list")
	@ResponseBody
	public String list(Pagination pagination){
		String data=vinspectionService.vinspectionList(pagination);
		return data;
	}
	
	/**
	 * 注册年审
	 * @param VInspection
	 * @return 状态
	 */
	@RequestMapping("/regist")
	@ResponseBody
	public String regist(VInspection vinspection) {
		vinspection.setVnumber(CreateNumber.generateRandomStr(8));
		vinspectionService.addVInspection(vinspection);
		return "ok";
	}
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@RequestMapping("/detele")
	@ResponseBody
	public String delete(VInspection vinspection){
		vinspectionService.deleteVInspection(vinspection);
		return "ok";
	}
	 //通过id获取用户数据
	@RequestMapping("/findVInspectionById")
	@ResponseBody
	public String findVInspectionById(String id) {
		return vinspectionService.fingVInspectionById(id);
	}
	
	 //通过用户数据跟新数据库
	@RequestMapping("/update")
	@ResponseBody
	public String updateVInspection(VInspection vinspection) {
		vinspectionService.updateVInspection(vinspection);
		return "";
	}
	
}
