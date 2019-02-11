package cn.com.taiji.service;

import cn.com.taiji.domain.DeviceType;
import cn.com.taiji.domain.customize.CustomResult;
import cn.com.taiji.domain.customize.EUDataGridResult;

import java.util.List;

public interface DeviceTypeService {

    //获取全部设备类型，并返回页的参数
    EUDataGridResult getList(int page, int rows, DeviceType deviceType) throws Exception;

    //根据主键获取某一个设备类型
    DeviceType get(String device_id) throws Exception;

    //获取全部设备类型
    List<DeviceType> find() throws Exception;

    //创建一个新的设备类型
    CustomResult insert(DeviceType deviceType) throws Exception;

    //批量删除
    CustomResult deleteBatch(String[] ids) throws Exception;

    //更新某个设备类型
    CustomResult update(DeviceType deviceType) throws Exception;

    //更新全部字段，不判断非空，直接全部覆盖更新
    CustomResult updateAll(DeviceType deviceType) throws Exception;

    //根据设备类型id模糊查询设备类型
    EUDataGridResult searchDeviceTypeByDeviceTypeId(Integer page,Integer rows , String deviceTypeId) throws Exception;

    //根据设备类型名称模糊查询设备类型
    EUDataGridResult searchDeviceTypeByDeviceTypeName(Integer page,Integer rows ,String deviceTypeName)throws Exception;
}
