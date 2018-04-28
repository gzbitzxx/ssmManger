package com.zyp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.zyp.mapper.VInfoMapper;
import com.zyp.pojo.Drecord;
import com.zyp.pojo.VInfo;
import com.zyp.service.VInfoService;
import com.zyp.util.Pagination;
import com.zyp.util.Util;

public class VInfoServiceImpl implements VInfoService {
	@Autowired
	private VInfoMapper vinfoMapper;

	public void addVInfo(VInfo vinfo) {
		vinfoMapper.insertVInfo(vinfo);
		
	}

	public String vinfoList(Pagination pagination) {
		List<VInfo> vinfos=vinfoMapper.vinfoList(pagination);
		pagination.setCount(vinfoMapper.vinfoCount(pagination));
		Util<VInfo> util=new Util<VInfo>();
		return util.SplitPage(vinfos, pagination.getCount());
	}
	public void deleteVInfo(VInfo vinfo) {
		vinfoMapper.deleteVInfo(vinfo);
	}
	
}
