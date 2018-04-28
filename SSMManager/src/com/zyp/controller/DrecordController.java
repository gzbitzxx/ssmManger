package com.zyp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.zyp.pojo.Drecord;
import com.zyp.pojo.User;
import com.zyp.service.DrecordService;
import com.zyp.util.CreateNumber;
import com.zyp.util.Pagination;

/**
 * 行车记录 Controller
 * @author zyp
 * 负责转发和相应 drecord 的操作
 */
@Controller
@RequestMapping("/drecord")
public class DrecordController {
	@Autowired
	@Qualifier("drecordService")
	private DrecordService drecordService;

	/**
	 * 返回用户数据
	 * @return
	 */
	@RequestMapping("/toList")
	public String toList() {
		return "jsp/drecord/list";
	}
	
	/**
	 * 返回行车记录数据
	 * @param pagination
	 * @return data
	 */
	@RequestMapping("/list")
	@ResponseBody
	public String list(Pagination pagination){
		String data=drecordService.drecordList(pagination);
		return data;
	}
	
	/**
	 * 注册行车记录
	 * @param user
	 * @return 状态
	 */
	@RequestMapping("/regist")
	@ResponseBody
	public String regist(Drecord drecord) {
		drecord.setVnumber(CreateNumber.generateRandomStr(8));
		drecordService.addDrecord(drecord);
		return "ok";
	}
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@RequestMapping("/detele")
	@ResponseBody
	public String delete(Drecord drecord){
		System.out.println("-----------------------------------------------------");
		System.out.println(drecord.getId());
		drecordService.deleteDrecord(drecord);
		return "ok";
	}
	
}
