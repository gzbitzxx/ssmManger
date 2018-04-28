package com.zyp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.zyp.mapper.VMaintenanceMapper;
import com.zyp.pojo.Drecord;
import com.zyp.pojo.VMaintenance;
import com.zyp.service.VMaintenanceService;
import com.zyp.util.Pagination;
import com.zyp.util.Util;

public class VMaintenanceServiceImpl implements VMaintenanceService {
	@Autowired
	private VMaintenanceMapper vmaintenanceMapper;

	public void addVMaintenance(VMaintenance vmaintenance) {
		vmaintenanceMapper.insertVMaintenance(vmaintenance);
		
	}

	public String vmaintenanceList(Pagination pagination) {
		List<VMaintenance> vmaintenances=vmaintenanceMapper.vmaintenanceList(pagination);
		pagination.setCount(vmaintenanceMapper.vmaintenanceCount(pagination));
		Util<VMaintenance> util=new Util<VMaintenance>();
		return util.SplitPage(vmaintenances, pagination.getCount());
	}

	public void deleteVMaintenance(VMaintenance vmaintenance) {
		vmaintenanceMapper.deleteVMaintenance(vmaintenance);
	}
}
