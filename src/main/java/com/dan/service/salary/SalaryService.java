package com.dan.service.salary;

import com.dan.model.dto.SalaryDTO;
import com.dan.entity.Salary;

import java.util.List;

public interface SalaryService {

    //查询所有员工的工资信息
    public List<SalaryDTO> getAllSalaryInfo() throws Exception;

    //依据员工id获取员工信息
    public SalaryDTO getSalaryInfoById(String id) throws Exception;

    //修改工资值[待定]
    public boolean modifySalaryById(Salary salary) throws Exception;

    //删除员工工资信息
    public boolean deleteInfoById(String id) throws Exception;

    //新增员工薪资信息
    public boolean addSalaryInfo(Salary salary) throws Exception;

}
