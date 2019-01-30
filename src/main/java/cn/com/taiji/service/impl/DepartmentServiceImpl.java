package cn.com.taiji.service.impl;

import cn.com.taiji.domain.Department;
import cn.com.taiji.domain.DepartmentExample;
import cn.com.taiji.domain.customize.CustomResult;
import cn.com.taiji.domain.customize.EUDataGridResult;
import cn.com.taiji.mapper.DepartmentMapper;
import cn.com.taiji.service.DepartmentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;


    @Override
    public List<Department> find() throws Exception {
        DepartmentExample departmentExample = new DepartmentExample();
        return departmentMapper.selectByExample(departmentExample);
    }

    @Override
    public EUDataGridResult getList(int page, int rows, Department department) throws Exception {
        DepartmentExample example = new DepartmentExample();

        PageHelper.startPage(page , rows);

        List<Department> list = departmentMapper.selectByExample(example);

        EUDataGridResult result = new EUDataGridResult();

        result.setRows(list);

        PageInfo<Department> pageInfo = new PageInfo<>(list);

        result.setTotal(pageInfo.getTotal());


        return result;
    }

    @Override
    public Department get(String string) throws Exception {


        return departmentMapper.selectByPrimaryKey(string);
    }

    @Override
    public CustomResult delete(String string) throws Exception {
        int i = departmentMapper.deleteByPrimaryKey(string);
        if (i > 0){
            return CustomResult.ok();
        }else {
            return null;
        }

    }

    @Override
    public CustomResult deleteBatch(String[] ids) throws Exception {
        int i = departmentMapper.deleteBatch(ids);
        if (i > 0){
            return CustomResult.ok();
        }else {
            return null;
        }

    }

    @Override
    public CustomResult insert(Department department) throws Exception {

        int i = departmentMapper.insert(department);

        if (i > 0){
            return CustomResult.ok();
        }else {
            return null;
        }
    }

    @Override
    public CustomResult update(Department department) throws Exception {

        int i = departmentMapper.updateByPrimaryKeySelective(department);
        if (i > 0){
            return CustomResult.ok();
        }else {
            return null;
        }
    }

    @Override
    public CustomResult updateAll(Department department) throws Exception {

        int i = departmentMapper.updateByPrimaryKey(department);

        if (i > 0){
            return CustomResult.ok();
        }else {
            return null;
        }
    }

    @Override
    public CustomResult updateNote(Department department) throws Exception {

        int i = departmentMapper.updateNote(department);

        if (i > 0){
            return CustomResult.ok();
        }else {
            return null;
        }
    }

    @Override
    public List<Department> searchDepartmentByDepartmentId(String departmentId) throws Exception {
        DepartmentExample example = new DepartmentExample();
        DepartmentExample.Criteria criteria = example.createCriteria();
        criteria.andDepartmentIdLike(departmentId);
        return departmentMapper.selectByExample(example);
    }

    @Override
    public EUDataGridResult searchDepartmentByDepartmentId(Integer page, Integer rows, String departmentId) throws Exception {
        //分页处理
        PageHelper.startPage(page, rows);
        List<Department> list = departmentMapper.searchDepartmentByDepartmentId(departmentId);
        //创建一个返回值对象
        EUDataGridResult result = new EUDataGridResult();
        result.setRows(list);
        //取记录总条数
        PageInfo<Department> pageInfo = new PageInfo<>(list);
        result.setTotal(pageInfo.getTotal());
        return result;
    }

    @Override
    public EUDataGridResult searchDepartmentByDepartmentName(Integer page, Integer rows, String departmentName) throws Exception {
        //分页处理
        PageHelper.startPage(page, rows);
        List<Department> list = departmentMapper.searchDepartmentByDepartmentName(departmentName);
        //创建一个返回值对象
        EUDataGridResult result = new EUDataGridResult();
        result.setRows(list);
        //取记录总条数
        PageInfo<Department> pageInfo = new PageInfo<>(list);
        result.setTotal(pageInfo.getTotal());
        return result;
    }
}
