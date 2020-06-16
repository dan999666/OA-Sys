package com.dan.dao.depart;

import com.dan.entity.Department;

import java.sql.Connection;
import java.util.List;
import java.util.concurrent.ExecutionException;

public interface DepartDao {

    //创建部门
    public int addDepart(Connection connection, Department department) throws Exception;

    //更名部门
    public int modifyDepartById(Connection connection, Department department) throws Exception;

    //合并部门
    /*具体的操作逻辑，获取需要合并的部门名字，删除这些部门，后插入新的部门名字*/

    //删除部门
    public int deleteDepartById(Connection connection, String id) throws Exception;

    //获取所有部门信息
    public List<Department> getDepartInfo(Connection connection) throws Exception;

    //获取指定部门信息
    public Department getDepartInfoById(Connection connection, String id) throws Exception;
}
