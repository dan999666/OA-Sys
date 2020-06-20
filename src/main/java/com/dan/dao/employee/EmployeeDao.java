package com.dan.dao.employee;


import com.dan.entity.Employee;

import java.sql.Connection;
import java.util.List;

/*关于数据库的设计，employee表是员工表和账号表的结合
 * 创建 禁用 删除 查询 其他账户
 * 以上功能点对应的是 insert values, 将ban属性设置为 0 or 1, delete , select
 * 关联账户至指定部门
 * update deptName 属性
 * */
public interface EmployeeDao {

    //创建账号
    public int addEmployee(Connection connection, Employee employee) throws Exception;

    //禁用账号
    public int banEmployee(Connection connection, String id) throws Exception;

    //删除账号
    public int deleteEmployee(Connection connection, String id) throws Exception;

    //查询所有账号信息
    public List<Employee> getEmployees(Connection connection) throws Exception;

    //通过employeeId查询员工信息
    public Employee getEmployeeById(Connection connection, String id) throws Exception;

    //将员工关联到指定部门
    public int updateDepart(Connection connection, String departName,String id) throws Exception;

    //依据用户名和密码查询用户信息
    public Employee login(Connection connection,String userName, String password) throws Exception;
}
