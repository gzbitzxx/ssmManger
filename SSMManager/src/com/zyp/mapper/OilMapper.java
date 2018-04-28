package com.zyp.mapper;

import java.util.List;

import com.zyp.pojo.Oil;
import com.zyp.pojo.User;
import com.zyp.util.Pagination;

/***
 * 油量mapper
 * @author zyp
 *
 */
public interface OilMapper {
	/**
	 * 插入用户
	 * @param vinspection
	 */
	public boolean insertOil(Oil oil );
	
	/**
	 * 获取油量列表
	 * @param pagination 分页条件
	 * @return 油量json 数据
	 */
	public List<Oil> oilList(Pagination pagination);
	
	/**
	 * 获取油量的个数
	 * @param pagination 分页条件
	 * @return 油量个数
	 */
	public int oilCount(Pagination pagination);
	/**
	 * 删除油量
	 * @param id
	 * @return
	 */
	public void deleteOil(Oil oil);
}
