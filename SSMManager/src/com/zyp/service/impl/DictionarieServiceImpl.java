package com.zyp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zyp.mapper.DictionarieMapper;
import com.zyp.pojo.Dictionarie;
import com.zyp.pojo.User;
import com.zyp.service.DictionarieService;
import com.zyp.util.Pagination;
import com.zyp.util.Util;

public class DictionarieServiceImpl implements DictionarieService {
	@Autowired
	private DictionarieMapper dictionarieMapper;

	public void addDictionarie(Dictionarie dictionarie) {
		dictionarieMapper.insertDictionarie(dictionarie);
		
	}

	public String dictionarieList(Pagination pagination) {
		List<Dictionarie> dictionaries=dictionarieMapper.dictionarieList(pagination);
		pagination.setCount(dictionarieMapper.dictionarieCount(pagination));
		Util<Dictionarie> util=new Util<Dictionarie>();
		return util.SplitPage(dictionaries, pagination.getCount());
	}
	public void deleteDictionarie(Dictionarie dictionarie) {
		dictionarieMapper.deleteDictionarie(dictionarie);
	}
	
}
