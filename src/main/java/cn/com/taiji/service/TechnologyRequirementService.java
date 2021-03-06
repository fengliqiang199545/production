package cn.com.taiji.service;

import cn.com.taiji.domain.Technology;
import cn.com.taiji.domain.TechnologyRequirement;
import cn.com.taiji.domain.customize.CustomResult;
import cn.com.taiji.domain.customize.EUDataGridResult;

import java.util.List;

public interface TechnologyRequirementService {
	
	List<Technology> find() throws Exception;  
	
	EUDataGridResult getList(int page, int rows, TechnologyRequirement technologyRequirement)
			throws Exception;

	TechnologyRequirement get(String string) throws Exception;
	
	CustomResult deleteBatch(String[] ids) throws Exception;

	
	CustomResult insert(TechnologyRequirement technologyRequirement) throws Exception;
	
    //更新全部字段，不判断非空，直接进行更新
    CustomResult updateAll(TechnologyRequirement technologyRequirement) throws Exception;
    
    //更新要求
    CustomResult updateRequirement(TechnologyRequirement technologyRequirement) 
    		throws Exception;

	EUDataGridResult searchTechnologyRequirementByTechnologyRequirementId(
            Integer page, Integer rows, String technologyRequirementId) throws Exception;

	EUDataGridResult searchTechnologyRequirementByTechnologyName(Integer page,
                                                                 Integer rows, String technologyName) throws Exception;
}
