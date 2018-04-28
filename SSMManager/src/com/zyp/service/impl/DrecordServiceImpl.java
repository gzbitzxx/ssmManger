package com.zyp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


import com.zyp.mapper.DrecordMapper;
import com.zyp.pojo.Drecord;
import com.zyp.pojo.User;
import com.zyp.service.DrecordService;

import com.zyp.util.Pagination;
import com.zyp.util.Util;

public class DrecordServiceImpl implements DrecordService {
	@Autowired
	@Qualifier("drecordMapper")
	private DrecordMapper drecordMapper;

	public void addDrecor(Drecord drecord) {
		drecordMapper.insertDrecord(drecord);
		
	}

	public String drecordList(Pagination pagination) {
		List<Drecord> drecords=drecordMapper.drecordList(pagination);
		pagination.setCount(drecordMapper.drecordCount(pagination));
		Util<Drecord> util=new Util<Drecord>();
		return util.SplitPage(drecords, pagination.getCount());
	}

	public void addDrecord(Drecord drecord) {
		// TODO Auto-generated method stub
		
	}
	public void deleteDrecord(Drecord drecord) {
		drecordMapper.deletedrecord(drecord);
	}

	
}
