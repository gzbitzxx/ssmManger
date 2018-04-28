package com.zyp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.zyp.mapper.DriverMapper;
import com.zyp.pojo.Drecord;
import com.zyp.pojo.Driver;
import com.zyp.service.DriverService;
import com.zyp.util.Pagination;
import com.zyp.util.Util;

public class DriverServiceImpl implements DriverService {
	@Autowired
	@Qualifier("driverMapper")
	private DriverMapper driverMapper;

	public void addDriver(Driver driver) {
		driverMapper.insertDriver(driver);
		
	}

	public String driverList(Pagination pagination) {
		List<Driver> drivers=driverMapper.driverList(pagination);
		pagination.setCount(driverMapper.driverCount(pagination));
		Util<Driver> util=new Util<Driver>();
		return util.SplitPage(drivers, pagination.getCount());
	}
	public void deleteDriver(Driver driver) {
		driverMapper.deleteDriver(driver);
	}
	
}
