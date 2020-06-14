package com.dan.service.depart;

import com.dan.entity.Department;

import java.util.List;

public interface DepartService {

    //创建部门
    public boolean createDepart(Department department) throws Exception;

    //更名部门
    public boolean renameDepartById(Department department) throws Exception;

    //删除部门
    public boolean deleteDepart(Department department) throws Exception;

    //获取所有部门信息
    public List<Department> getDepartInfo() throws Exception;
}
