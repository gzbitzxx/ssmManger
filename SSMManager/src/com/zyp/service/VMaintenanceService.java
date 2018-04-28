package com.zyp.service;

import com.zyp.pojo.User;
import com.zyp.pojo.VMaintenance;
import com.zyp.util.Pagination;

/**
 * 维修记录 server
 * @author zyp
 * 定义操作维修记录的接口
 */
public interface VMaintenanceService {
	
	//添加维修记录
	public void addVMaintenance(VMaintenance vmaintenance);
	
	//分页获取维修记录
	public String vmaintenanceList(Pagination pagination);
	//删除
		public void deleteVMaintenance(VMaintenance vmaintenance);
}
