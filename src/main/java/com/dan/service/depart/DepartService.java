package com.dan.service.depart;

import com.dan.entity.Department;

import java.util.List;

public interface DepartService {

    //创建部门
    public boolean createDepart(Department department) throws Exception;

    //更名部门
    public boolean renameDepartById(Department department) throws Exception;

    //修改部门
    public boolean modifyDepart(Department department) throws Exception;

    //获取所有部门信息
    public List<Department> getDepartInfo() throws Exception;

    //删除部门信息
    public boolean deleteDepartById(String id) throws Exception;

    //通过id获取部门信息
    public Department getDepartById(String id) throws Exception;

}
