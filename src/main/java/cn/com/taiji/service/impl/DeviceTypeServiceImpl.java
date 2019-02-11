package cn.com.taiji.service.impl;

import cn.com.taiji.domain.DeviceType;
import cn.com.taiji.domain.customize.CustomResult;
import cn.com.taiji.domain.customize.EUDataGridResult;
import cn.com.taiji.mapper.DeviceTypeMapper;
import cn.com.taiji.service.DeviceTypeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceTypeServiceImpl implements DeviceTypeService {

    @Autowired
    private DeviceTypeMapper deviceTypeMapper;

    @Override
    public EUDataGridResult getList(int page, int rows, DeviceType deviceType) throws Exception {
        //分页处理
        PageHelper.startPage(page,rows);
        //进行查询
        List<DeviceType> list = deviceTypeMapper.find(deviceType);

        //创建返回值对象
        EUDataGridResult result = new EUDataGridResult();

        //创建PageInfo对象，来获取page的相关信息
        PageInfo<DeviceType> pageInfo = new PageInfo<>(list);


        result.setTotal(pageInfo.getTotal());

        result.setRows(list);

        return result;
    }

    @Override
    public DeviceType get(String device_id) throws Exception {
        return deviceTypeMapper.selectByPrimaryKey(device_id);
    }

    @Override
    public List<DeviceType> find() throws Exception {
        List<DeviceType> list = deviceTypeMapper.listType();
        return list;
    }

    @Override
    public CustomResult insert(DeviceType deviceType) throws Exception {
        int i = deviceTypeMapper.insert(deviceType);
        if (i > 0){
            return CustomResult.ok();
        }else {
        return CustomResult.build(101,"新增设备种类失败");
        }
    }

    @Override
    public CustomResult deleteBatch(String[] ids) throws Exception {
        int i = deviceTypeMapper.deleteBatch(ids);
        if (i > 0){
            return CustomResult.ok();
        }else {
            return null;
        }

    }

    @Override
    public CustomResult update(DeviceType deviceType) throws Exception {
        int i = deviceTypeMapper.updateByPrimaryKeySelective(deviceType);

        if (i > 0){
            return CustomResult.ok();
        }else {
            return CustomResult.build(101,"修改设备种类信息失败");
        }
    }

    @Override
    public CustomResult updateAll(DeviceType deviceType) throws Exception {
        int i = deviceTypeMapper.updateByPrimaryKey(deviceType);

        if (i > 0){
            return CustomResult.ok();
        }else {
            return CustomResult.build(101,"修改设备种类信息失败");
        }
    }

    @Override
    public EUDataGridResult searchDeviceTypeByDeviceTypeId(Integer page, Integer rows, String deviceTypeId) throws Exception {
        //分页处理
        PageHelper.startPage(page,rows);
        //进行查询处理
        List<DeviceType> list  = deviceTypeMapper.searchDeviceTypeByDeviceTypeId(deviceTypeId);

        EUDataGridResult result = new EUDataGridResult();

        PageInfo<DeviceType> pageInfo = new PageInfo<>(list);

        result.setRows(list);
        result.setTotal(pageInfo.getTotal());
        return result;
    }

    @Override
    public EUDataGridResult searchDeviceTypeByDeviceTypeName(Integer page, Integer rows, String deviceTypeName) throws Exception {
        PageHelper.startPage(page,rows);

        List<DeviceType> list = deviceTypeMapper.searchDeviceTypeByDeviceTypeName(deviceTypeName);

        EUDataGridResult result = new EUDataGridResult();

        PageInfo<DeviceType> info = new PageInfo<>(list);

        result.setTotal(info.getTotal());

        result.setRows(list);

        return result;
    }
}
