package com.dan.dao.depart;

import com.dan.dao.BaseDao;
import com.dan.entity.Department;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DepartDaoImpl implements DepartDao {

    @Override
    public int addDepart(Connection connection, Department department) throws Exception {
        int flag = 0;
        PreparedStatement pstm = null;
        if (connection != null) {
            String sql = "insert into department values(?,?)";
            Object[] params = {department.getDeptId(), department.getDeptName()};
            flag = BaseDao.execute(connection, pstm, sql, params);
        }
        BaseDao.closeResource(connection, pstm, null);
        return flag;
    }

    @Override
    public int modifyDepartById(Connection connection, Department department) throws Exception {
        int flag = 0;
        PreparedStatement pstm = null;
        if (connection != null) {
            String sql = "update department set deptName=? where deptId=?";
            Object[] params = {department.getDeptName(), department.getDeptId()};
            flag = BaseDao.execute(connection, pstm, sql, params);
        }
        BaseDao.closeResource(connection, pstm, null);
        return flag;
    }

    @Override
    public int deleteDepartById(Connection connection, String id) throws Exception {
        int flag = 0;
        PreparedStatement pstm = null;
        if (connection != null) {
            String sql = "delete from department where deptId=?";
            Object[] params = {id};
            flag = BaseDao.execute(connection, pstm, sql, params);
        }
        BaseDao.closeResource(connection, pstm, null);
        return flag;
    }

    @Override
    public List<Department> getDepartInfo(Connection connection) throws Exception {
        List<Department> list = new ArrayList<>();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        if (connection != null) {
            String sql = "SELECT * FROM department";
            Object[] params = {};
            rs = BaseDao.execute(connection, pstm, rs, sql, params);
            while (rs.next()) {
                Department department = new Department();
                department.setDeptId(rs.getInt("deptId"));
                department.setDeptName(rs.getString("deptName"));
                list.add(department);
            }
            BaseDao.closeResource(connection, pstm, rs);
        }
        return list;
    }

    @Override
    public Department getDepartInfoById(Connection connection, String id) throws Exception {
        Department department = new Department();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        if (connection != null) {
            String sql = "select * from department where deptId=?";
            Object[] params = {id};
            rs = BaseDao.execute(connection, pstm, rs, sql, params);
            if (rs.next()){
                department.setDeptId(rs.getInt("deptId"));
                department.setDeptName(rs.getString("deptName"));
            }
        }
        BaseDao.closeResource(connection,pstm,rs);
        return department;
    }
}
