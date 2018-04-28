package com.zyp.service;

import com.zyp.pojo.Drecord;
import com.zyp.pojo.User;
import com.zyp.util.Pagination;

/**
 * 行车距离 server
 * @author zyp
 * 定义操作行车记录的接口
 */
public interface DrecordService {
	
	//添加行车记录
	public void addDrecord(Drecord drecord);
	
	//分页获取行车记录
	public String drecordList(Pagination pagination);
	
	//删除
		public void deleteDrecord(Drecord drecord);
		
}
