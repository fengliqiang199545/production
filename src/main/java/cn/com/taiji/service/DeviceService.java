package cn.com.taiji.service;

import cn.com.taiji.domain.Device;
import cn.com.taiji.domain.customize.CustomResult;
import cn.com.taiji.domain.customize.EUDataGridResult;

import java.util.List;

public interface DeviceService {

	EUDataGridResult getList(int page, int rows, Device device) throws Exception;
	
	List<Device> find() throws Exception;
	
	Device get(String string) throws Exception;

	CustomResult insert(Device device) throws Exception;
	
	CustomResult deleteBatch(String[] deviceIds) throws Exception;

    CustomResult update(Device device) throws Exception;

	CustomResult updateNote(Device device) throws Exception;

	//更新全部字段，不判断非空，直接进行更新
    CustomResult updateAll(Device device) throws Exception;

	EUDataGridResult searchDeviceByDeviceId(Integer page, Integer rows,
                                            String deviceId);

	EUDataGridResult searchDeviceByDeviceName(Integer page, Integer rows,
                                              String deviceName) throws Exception;

	EUDataGridResult searchDeviceByDeviceTypeName(Integer page, Integer rows,
                                                  String deviceTypeName) throws Exception;
}