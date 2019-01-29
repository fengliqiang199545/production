package cn.com.taiji.service.impl;

import cn.com.taiji.domain.Custom;
import cn.com.taiji.domain.CustomExample;
import cn.com.taiji.domain.customize.CustomResult;
import cn.com.taiji.domain.customize.EUDataGridResult;
import cn.com.taiji.mapper.CustomMapper;
import cn.com.taiji.service.CustomService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomServiceImpl implements CustomService {

    @Autowired
    private CustomMapper customMapper;

    @Override
    public List<Custom> find() throws Exception {
        CustomExample customExample = new CustomExample();
        return customMapper.selectByExample(customExample);
    }

    @Override
    public EUDataGridResult getList(int page, int rows, Custom custom) throws Exception {
        CustomExample customExample = new CustomExample();

        PageHelper.startPage(page,rows);

        List<Custom> list =   customMapper.selectByExample(customExample);

        //创建一个返回值对象
        EUDataGridResult euDataGridResult  = new EUDataGridResult();

        euDataGridResult.setRows(list);

        PageInfo<Custom> pageInfo = new PageInfo<Custom>(list);

        euDataGridResult.setTotal(pageInfo.getTotal());

        return euDataGridResult;
    }

    @Override
    public Custom get(String s) throws Exception {

        return customMapper.selectByPrimaryKey(s);
    }

    @Override
    public CustomResult delete(String string) throws Exception {

        CustomResult customResult = new CustomResult();

        int i =  customMapper.deleteByPrimaryKey(string);

        if (i > 0){
           return customResult.ok();
        }else {

            return null;
        }
    }

    @Override
    public CustomResult deleteBatch(String[] ids) throws Exception {

        int i = customMapper.deleteBatch(ids);
        if (i > 0){
            return  CustomResult.ok();
        }else {
            return null;
        }
    }

    @Override
    public CustomResult insert(Custom custom) throws Exception {
        int i = customMapper.insert(custom);
        if (i > 0){
            return CustomResult.ok();
        }else {
            return CustomResult.build(101,"新增客户失败");
        }
    }

    @Override
    public CustomResult update(Custom custom) throws Exception {
        int i = customMapper.updateByPrimaryKeySelective(custom);
        if (i > 0){
            return CustomResult.ok();
        }else {
            return CustomResult.build(101,"更新用户失败");
        }
    }

    @Override
    public CustomResult updateAll(Custom custom) throws Exception {
        int i = customMapper.updateByPrimaryKey(custom);
        if (i > 0){
            return CustomResult.ok();
        }else {
            return CustomResult.build(101,"修改客户失败");
        }

    }

    @Override
    public CustomResult updateNote(Custom custom) throws Exception {
        int i = customMapper.updateNote(custom);
        if(i>0){
            return CustomResult.ok();
        }else{
            return CustomResult.build(101, "更新客户介绍失败");
        }

    }

    //批量改变状态
    @Override
    public CustomResult changeStatus(String[] ids) throws Exception {
        customMapper.changeStatus(ids);

        return CustomResult.ok();
    }

    @Override
    public EUDataGridResult searchCustomByCustomName(int page, int rows, String customName) throws Exception {

        PageHelper.startPage(page,rows);

        List<Custom> customs = customMapper.searchCustomByCustomName(customName);

        EUDataGridResult euDataGridResult = new EUDataGridResult();

        euDataGridResult.setRows(customs);

        PageInfo<Custom> pageInfo = new PageInfo<>(customs);

        euDataGridResult.setTotal(pageInfo.getTotal());


        return euDataGridResult;
    }

    @Override
    public EUDataGridResult searchCustomByCustomId(int page, int rows, String customId) throws Exception {

        PageHelper.startPage(page,rows);

        List<Custom> list = customMapper.searchCustomByCustomId(customId);

        EUDataGridResult result = new EUDataGridResult();

        result.setRows(list);

        PageInfo<Custom> pageInfo = new PageInfo<>(list);

        result.setTotal(pageInfo.getTotal());

        return result;
    }
}
