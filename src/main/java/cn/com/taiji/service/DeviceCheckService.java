package cn.com.taiji.service;

import cn.com.taiji.domain.DeviceCheck;
import cn.com.taiji.domain.customize.CustomResult;
import cn.com.taiji.domain.customize.EUDataGridResult;

public interface DeviceCheckService {
	
	EUDataGridResult getList(int page, int rows, DeviceCheck deviceCheck) throws Exception;
	
	DeviceCheck get(String string) throws Exception;

	CustomResult insert(DeviceCheck deviceCheck) throws Exception;
	
	CustomResult delete(String deviceCheckId) throws Exception;
	
	CustomResult deleteBatch(String[] deviceCheckIds) throws Exception;

    CustomResult update(DeviceCheck deviceCheck) throws Exception;

    CustomResult updateNote(DeviceCheck deviceCheck) throws Exception;
    
	EUDataGridResult searchDeviceCheckByDeviceCheckId(Integer page,
                                                      Integer rows, String deviceCheckId) throws Exception;

	EUDataGridResult searchDeviceCheckByDeviceName(Integer page, Integer rows,
                                                   String deviceName) throws Exception;
}
