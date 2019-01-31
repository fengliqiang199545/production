package cn.com.taiji.service;

import cn.com.taiji.domain.DeviceFault;
import cn.com.taiji.domain.customize.CustomResult;
import cn.com.taiji.domain.customize.EUDataGridResult;

import java.util.List;

public interface DeviceFaultService {

	EUDataGridResult getList(int page, int rows, DeviceFault deviceFault) throws Exception;
	
	DeviceFault get(String string) throws Exception;
	
	List<DeviceFault> find() throws Exception;

	CustomResult insert(DeviceFault deviceFault) throws Exception;
	
	CustomResult delete(String deviceFaultId) throws Exception;
	
	CustomResult deleteBatch(String[] deviceFaultIds) throws Exception;

    CustomResult update(DeviceFault deviceFault) throws Exception;

	CustomResult updateNote(DeviceFault deviceFault) throws Exception;

	CustomResult updateAll(DeviceFault deviceFault) throws Exception;

	EUDataGridResult searchDeviceFaultByDeviceFaultId(Integer page,
                                                      Integer rows, String deviceFaultId) throws Exception;

	EUDataGridResult searchDeviceFaultByDeviceName(Integer page, Integer rows,
                                                   String deviceName) throws Exception;
}
