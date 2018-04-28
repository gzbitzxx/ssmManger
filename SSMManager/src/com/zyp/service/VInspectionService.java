package com.zyp.service;



import com.zyp.pojo.User;
import com.zyp.pojo.VInspection;
import com.zyp.util.Pagination;

/**
 * 年审 server
 * @author zyp
 * 定义操作年审的接口
 */
public interface VInspectionService {
	
	//添加年审
	public void addVInspection(VInspection vinspection);
	
	//分页获取年审
	public String vinspectionList(Pagination pagination);
	//删除
		public void deleteVInspection(VInspection vinspection);
}
