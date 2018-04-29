package com.zyp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zyp.pojo.User;
import com.zyp.pojo.VMaintenance;
import com.zyp.service.VMaintenanceService;
import com.zyp.util.CreateNumber;
import com.zyp.util.Pagination;

/**
 * 维修记录Controller
 * @author zyp
 * 负责转发和相应 vmaintenance 的操作
 */
@Controller
@RequestMapping("/vmaintenance")
public class VMaintenanceController {
	@Autowired
	@Qualifier("vmaintenanceService")
	private VMaintenanceService vmaintenanceService;

	/**
	 * 返回维修记录数据
	 * @return
	 */
	@RequestMapping("/toList")
	public String toList() {
		return "jsp/vmaintenance/list";
	}
	
	/**
	 * 返回维修记录数据
	 * @param pagination
	 * @return data
	 */
	@RequestMapping("/list")
	@ResponseBody
	public String list(Pagination pagination){
		String data=vmaintenanceService.vmaintenanceList(pagination);
		return data;
	}
	
	/**
	 * 注册维修记录
	 * @param vmaintenance
	 * @return 状态
	 */
	@RequestMapping("/regist")
	@ResponseBody
	public String regist(VMaintenance vmaintenance) {
		vmaintenance.setVnumber(CreateNumber.generateRandomStr(8));
		vmaintenanceService.addVMaintenance(vmaintenance);
		return "ok";
	}
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@RequestMapping("/detele")
	@ResponseBody
	public String delete(VMaintenance vmaintenance){
		vmaintenanceService.deleteVMaintenance(vmaintenance);
		return "ok";
	}
	 //通过id获取用户数据
	@RequestMapping("/findUserById")
	@ResponseBody
	public String findVMaintenanceById(String id) {
		return vmaintenanceService.fingVMaintenanceById(id);
	}
	
	 //通过用户数据跟新数据库
	@RequestMapping("/update")
	@ResponseBody
	public String updateVMaintenance(VMaintenance vmaintenance) {
	vmaintenanceService.updateVMaintenance(vmaintenance);
		return "";
	}
	
}
