package cn.com.taiji.service;

import cn.com.taiji.domain.Employee;
import cn.com.taiji.domain.customize.CustomResult;
import cn.com.taiji.domain.customize.EUDataGridResult;
import cn.com.taiji.domain.vo.EmployeeVO;

import java.util.List;

public interface EmployeeService {
    List<Employee> find() throws Exception;

    EUDataGridResult getList(int page, int rows, EmployeeVO employee) throws Exception;

    EmployeeVO get(String string) throws Exception;

    CustomResult delete(String string) throws Exception;

    CustomResult deleteBatch(String[] ids) throws Exception;

    CustomResult insert(Employee employee) throws Exception;

    //更新全部字段，不判断非空，直接进行更新
    CustomResult updateAll(Employee employee) throws Exception;

    CustomResult update(Employee employee) throws Exception;

    List<Employee> searchEmployeeByEmployeeName(String employeeName) throws Exception;

    List<Employee> searchEmployeeByEmployeeId(String employeeId) throws Exception;

    //根据员工id查找员工信息
    EUDataGridResult searchEmployeeByEmployeeId(Integer page, Integer rows,
                                                String employeeId) throws Exception;

    //根据员工姓名查找员工信息
    EUDataGridResult searchEmployeeByEmployeeName(Integer page, Integer rows,
                                                  String employeeName) throws Exception;

    //根据部门名称查找员工信息
    EUDataGridResult searchEmployeeByDepartmentName(Integer page, Integer rows,
                                                    String departmentName) throws Exception;
}
