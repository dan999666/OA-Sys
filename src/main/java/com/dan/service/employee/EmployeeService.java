package com.dan.service.employee;

import com.dan.entity.Employee;

import java.util.List;

public interface EmployeeService {

    //创建账号
    public boolean addEmployee(Employee employee) throws Exception;

    //禁用账号
    public boolean banEmployee(String id) throws Exception;

    //删除账号
    public boolean deleteEmployee(String id) throws Exception;

    //查询所有的账号
    public List<Employee> getEmployees() throws Exception;

    //依据id查询账号信息
    public Employee getEmployeeById(String id) throws Exception;

    //将员工关联到指定部门
    public boolean updateDepart(String depart, String id) throws Exception;

    //登录功能
    public Employee login(String userName,String password) throws Exception;
}
