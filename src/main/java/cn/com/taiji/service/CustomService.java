package cn.com.taiji.service;


import cn.com.taiji.domain.Custom;
import cn.com.taiji.domain.customize.CustomResult;
import cn.com.taiji.domain.customize.EUDataGridResult;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CustomService {

    List<Custom> find() throws Exception;

    //暂时看不懂，通过后面看实现和需求去理解
    EUDataGridResult getList(int page , int rows , Custom custom) throws Exception;

    Custom get(String s) throws Exception;

    CustomResult delete(String string) throws Exception;

    CustomResult deleteBatch(String[] ids) throws Exception;

    CustomResult insert(Custom custom) throws Exception;

    //更新部分字段
    CustomResult update(Custom custom) throws Exception;

    //更新全部字段，不进行判断非空，直接进行更新
    CustomResult updateAll(Custom custom) throws Exception;

    //更新备注
    CustomResult updateNote(Custom custom) throws Exception;

    CustomResult changeStatus(String[] ids) throws Exception;

    EUDataGridResult searchCustomByCustomName(int page, int rows, String customName) throws Exception;

    EUDataGridResult searchCustomByCustomId(int page, int rows, String customId) throws Exception;

}
