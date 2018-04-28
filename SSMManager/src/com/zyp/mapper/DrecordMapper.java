package com.zyp.mapper;

import java.util.List;
import com.zyp.pojo.Drecord;
import com.zyp.pojo.User;
import com.zyp.util.Pagination;

/***
 * 行车记录mapper
 * @author zyp
 *
 */
public interface DrecordMapper {
	/**
	 * 插入行车记录
	 * @param Drecord
	 */
	public boolean insertDrecord(Drecord drecord);
	
	/**
	 * 获取行车记录列表
	 * @param pagination 分页条件
	 * @return 行车记录 json 数据
	 */
	public List<Drecord> drecordList(Pagination pagination);
	
	/**
	 * 获取行车记录的个数
	 * @param pagination 分页条件
	 * @return 行车记录个数
	 */
	public int drecordCount(Pagination pagination);
	
	/**
	 * 删除行车记录
	 * @param id
	 * @return
	 */
	public void deletedrecord(Drecord drecord);
	
}

