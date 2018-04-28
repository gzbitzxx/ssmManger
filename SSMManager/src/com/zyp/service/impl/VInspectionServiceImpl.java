package com.zyp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.zyp.mapper.VInspectionMapper;
import com.zyp.pojo.Drecord;
import com.zyp.pojo.VInspection;
import com.zyp.service.VInspectionService;
import com.zyp.util.Pagination;
import com.zyp.util.Util;

public class VInspectionServiceImpl implements VInspectionService {
	@Autowired
	private VInspectionMapper vinspectionMapper;

	public void addVInspection(VInspection vinspection) {
		vinspectionMapper.insertVInspection(vinspection);
		
	}

	public String vinspectionList(Pagination pagination) {
		List<VInspection> vinspections=vinspectionMapper.vinspectionList(pagination);
		pagination.setCount(vinspectionMapper.vinspectionCount(pagination));
		Util<VInspection> util=new Util<VInspection>();
		return util.SplitPage(vinspections, pagination.getCount());
	}

	public void deleteVInspection(VInspection vinspection) {
		vinspectionMapper.deleteVInspection(vinspection);
	}
}
