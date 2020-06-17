package com.dan.dao.salary;

import com.dan.model.dto.SalaryDTO;
import com.dan.entity.Salary;

import java.sql.Connection;
import java.util.List;

public interface SalaryDao {

    //查询所有员工的工资信息
    public List<SalaryDTO> getAllSalaryInfo(Connection connection) throws Exception;

    //根据员工id获取员工信息
    public SalaryDTO getSalaryInfoById(Connection connection,String id) throws Exception;

    //修改工资值需要修改的部分[待定]
    public int modifySalaryInfoById(Connection connection,Salary salary) throws Exception;

    //删除员工工资信息
    public int deleteSalaryInfoById(Connection connection,String id) throws Exception;

    //创建员工薪资信息
    public int addSalaryInfo(Connection connection,Salary salary) throws Exception;

}
