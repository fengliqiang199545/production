package cn.com.taiji.service;

import cn.com.taiji.domain.ProcessCountCheck;
import cn.com.taiji.domain.customize.CustomResult;
import cn.com.taiji.domain.customize.EUDataGridResult;

public interface PCountCheckService {
	
	EUDataGridResult getList(int page, int rows, ProcessCountCheck processCountCheck) throws Exception;
	
	CustomResult deleteBatch(String[] ids) throws Exception;

	CustomResult insert(ProcessCountCheck processCountCheck) throws Exception;

    //更新全部字段，不判断非空，直接进行更新
    CustomResult updateAll(ProcessCountCheck processCountCheck) throws Exception;
    
    CustomResult updateNote(ProcessCountCheck processCountCheck) throws Exception;

    EUDataGridResult searchPCountCheckByPCountCheckId(int page, int rows,
                                                      String pCountCheckId) throws Exception;
}
