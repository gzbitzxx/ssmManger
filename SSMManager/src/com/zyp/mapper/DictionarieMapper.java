package com.zyp.mapper;

import java.util.List;

import com.zyp.pojo.Dictionarie;
import com.zyp.util.Pagination;


public interface DictionarieMapper {
	public void insertDictionarie(Dictionarie dictionarie);
	public List<Dictionarie> Dictionarielist(Pagination pagination);
	public int dictionariescount();
}

