package cn.com.taiji.service;

import cn.com.taiji.domain.Technology;
import cn.com.taiji.domain.customize.CustomResult;
import cn.com.taiji.domain.customize.EUDataGridResult;

import java.util.List;

public interface TechnologyService {
	
	List<Technology> find() throws Exception;  
	
	EUDataGridResult getList(int page, int rows, Technology technology) throws Exception;

	Technology get(String string) throws Exception;
	
	CustomResult deleteBatch(String[] ids) throws Exception;

	
	CustomResult insert(Technology technology) throws Exception;
	
    //更新全部字段，不判断非空，直接进行更新
    CustomResult updateAll(Technology technology) throws Exception;

	EUDataGridResult searchTechnologyByTechnologyId(Integer page, Integer rows,
                                                    String technologyId) throws Exception;

	EUDataGridResult searchTechnologyByTechnologyName(Integer page,
                                                      Integer rows, String technologyName) throws Exception;

}
