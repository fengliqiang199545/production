package cn.com.taiji.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.com.taiji.domain.ProcessMeasureCheck;
import cn.com.taiji.domain.customize.CustomResult;
import cn.com.taiji.domain.customize.EUDataGridResult;
import cn.com.taiji.domain.vo.ProcessMeasureCheckVO;
import cn.com.taiji.mapper.ProcessMeasureCheckMapper;
import cn.com.taiji.service.PMeasureCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PMeasureCheckServiceImpl implements PMeasureCheckService {

	@Autowired
    ProcessMeasureCheckMapper processMeasureCheckMapper;
	
	@Override
	public EUDataGridResult getList(int page, int rows, ProcessMeasureCheck processMeasureCheck) throws Exception{
		
		//分页处理
		PageHelper.startPage(page, rows);
		List<ProcessMeasureCheckVO> list = processMeasureCheckMapper.find(processMeasureCheck);

		//创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<ProcessMeasureCheckVO> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	@Override
	public CustomResult deleteBatch(String[] ids) throws Exception{
		int i = processMeasureCheckMapper.deleteBatch(ids);
		if(i>0){
			return CustomResult.ok();
		}else{
			return null;
		}
	}

	@Override
	public CustomResult insert(ProcessMeasureCheck processMeasureCheck) throws Exception{
		int i = processMeasureCheckMapper.insert(processMeasureCheck);
		if(i>0){
			return CustomResult.ok();
		}else{
			return CustomResult.build(101, "新增工序计量质检信息失败");
		}
	}

	@Override
	public CustomResult updateAll(ProcessMeasureCheck processMeasureCheck) throws Exception{
		int i = processMeasureCheckMapper.updateByPrimaryKey(processMeasureCheck);
		if(i>0){
			return CustomResult.ok();
		}else{
			return CustomResult.build(101, "修改工序计量质检信息失败");
		}
	}

	@Override
	public CustomResult updateNote(ProcessMeasureCheck processMeasureCheck) throws Exception{
		
		int i = processMeasureCheckMapper.updateNote(processMeasureCheck);
		if(i>0){
			return CustomResult.ok();
		}else{
			return CustomResult.build(101, "修改工序计量质检备注失败");
		}
	}

	@Override
	public EUDataGridResult searchPMeasureCheckByPMeasureCheckId(int page,
			int rows, String pMeasureCheckId) throws Exception{
		//分页处理
		PageHelper.startPage(page, rows);
		List<ProcessMeasureCheckVO> list = processMeasureCheckMapper.searchPMeasureCheckByPMeasureCheckId(pMeasureCheckId);
		//创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<ProcessMeasureCheckVO> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}
}
