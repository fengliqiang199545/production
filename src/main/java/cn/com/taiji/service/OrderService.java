package cn.com.taiji.service;

import cn.com.taiji.domain.COrder;
import cn.com.taiji.domain.customize.CustomResult;
import cn.com.taiji.domain.customize.EUDataGridResult;
import cn.com.taiji.domain.vo.COrderVO;

import java.util.List;

public interface OrderService {
	
	List<COrderVO> find() throws Exception;
	
	EUDataGridResult getList(int page, int rows, COrderVO cOrder) throws Exception;

	COrderVO get(String string) throws Exception;
	
	CustomResult delete(String string) throws Exception;

	CustomResult deleteBatch(String[] ids) throws Exception;

	CustomResult insert(COrder cOrder) throws Exception;

	//更新部分字段，用的是updateSelective判断非空的字段进行更新
    CustomResult update(COrder cOrder) throws Exception;
    
    //更新全部字段，不判断非空，直接进行更新
    CustomResult updateAll(COrder cOrder) throws Exception;
    
    CustomResult updateNote(COrder cOrder) throws Exception;

    CustomResult changeStatus(String[] ids) throws Exception;

    //根据订单id查找订单信息
    EUDataGridResult searchOrderByOrderId(int page, int rows, String orderId) throws Exception;
	
    //根据客户名称查找订单信息
	EUDataGridResult searchOrderByCustomName(int page, int rows,
                                             String customName) throws Exception;

	//根据产品名称查找订单信息
	EUDataGridResult searchOrderByProductName(int page, int rows,
                                              String productName) throws Exception;
}
