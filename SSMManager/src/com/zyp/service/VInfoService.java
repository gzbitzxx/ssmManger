package com.zyp.service;
import com.zyp.pojo.User;
import com.zyp.pojo.VInfo;
import com.zyp.util.Pagination;

/**
 * 车辆 server
 * @author zyp
 * 定义操作车辆信息的接口
 */
public interface VInfoService {
	
	//添加车辆信息
	public void addVInfo(VInfo vinfo);
	
	//分页获取车车辆
	public String vinfoList(Pagination pagination);
	//删除
		public void deleteVInfo(VInfo vinfo);
}
