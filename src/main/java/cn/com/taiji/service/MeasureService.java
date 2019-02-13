package cn.com.taiji.service;


import cn.com.taiji.domain.FinalMeasuretCheck;
import cn.com.taiji.domain.customize.CustomResult;
import cn.com.taiji.domain.customize.EUDataGridResult;

public interface MeasureService {
	
	EUDataGridResult getList(Integer page, Integer rows, FinalMeasuretCheck
            finalMeasuretCheck) throws Exception;

	FinalMeasuretCheck get(String string) throws Exception;

	CustomResult deleteBatch(String[] ids) throws Exception;

	CustomResult insert(FinalMeasuretCheck finalMeasuretCheck) throws Exception;

    //更新全部字段，不判断非空，直接进行更新
    CustomResult updateAll(FinalMeasuretCheck finalMeasuretCheck) throws Exception;

    CustomResult updateNote(FinalMeasuretCheck finalMeasuretCheck) throws Exception;

    EUDataGridResult searchFMeasureCheckByFMeasureCheckId(int page, int rows,
                                                          String fMeasureCheckId) throws Exception;

	EUDataGridResult searchFMeasureCheckByOrderId(Integer page, Integer rows,
                                                  String orderId) throws Exception;
}
