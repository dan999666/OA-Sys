package com.dan.dao.employee;

import com.dan.dao.BaseDao;
import com.dan.entity.Employee;
import com.sun.xml.internal.bind.v2.model.core.ID;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public int addEmployee(Connection connection, Employee employee) throws Exception {
        PreparedStatement pstm = null;
        int flag = 0;
        if (connection != null) {
            String sql = "INSERT INTO employee VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            Object[] params = {
                    employee.getEmployeeId(), employee.getAcountName(), employee.getName(), employee.getPassword(),
                    employee.getRole(), employee.getSex(), employee.getAge(), employee.getBan(), employee.getDeptName(),
                    employee.getEmail(), employee.getPhone()
            };
            flag = BaseDao.execute(connection, pstm, sql, params);
            BaseDao.closeResource(connection, pstm, null);
        }
        return flag;
    }

    @Override
    public int banEmployee(Connection connection, String id) throws Exception {
        int flag = 0;
        PreparedStatement pstm = null;
        if (connection != null) {
            String sql = "UPDATE employee SET ban=1 WHERE employeeId=?";
            Object[] params = {id};
            flag = BaseDao.execute(connection, pstm, sql, params);
        }
        BaseDao.closeResource(connection, pstm, null);
        return flag;
    }

    @Override
    public int deleteEmployee(Connection connection, String id) throws Exception {
        PreparedStatement pstm = null;
        int flag = 0;
        if (connection != null) {
            String sql = "DELETE FROM employee WHERE employeeId=?";
            Object[] params = {id};
            flag = BaseDao.execute(connection, pstm, sql, params);
        }
        BaseDao.closeResource(connection, pstm, null);
        return flag;
    }

    @Override
    public List<Employee> getEmployees(Connection connection) throws Exception {
        PreparedStatement pstm = null;
        List<Employee> list = new ArrayList<>();
        ResultSet rs = null;
        if (connection != null) {
            String sql = "select * from employee";
            Object[] params = {};
            rs = BaseDao.execute(connection, pstm, rs, sql, params);
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setEmployeeId(rs.getInt("employeeId"));
                employee.setAcountName(rs.getString("acountName"));
                employee.setName(rs.getString("name"));
                employee.setPassword(rs.getString("password"));
                employee.setRole(rs.getString("role"));
                employee.setSex(rs.getString("sex"));
                employee.setAge(rs.getInt("age"));
                employee.setBan(rs.getInt("ban"));
                employee.setDeptName(rs.getString("deptName"));
                employee.setEmail(rs.getString("email"));
                employee.setPhone(rs.getString("phone"));
                list.add(employee);
            }
            BaseDao.closeResource(connection, pstm, rs);
        }
        return list;
    }

    @Override
    public Employee getEmployeeById(Connection connection, String id) throws Exception {
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Employee employee = new Employee();
        if (connection != null) {
            String sql = "SELECT * FROM employee WHERE employeeId=?";
            Object[] params = {id};
            rs = BaseDao.execute(connection, pstm, rs, sql, params);
            if (rs.next()) {
                employee.setEmployeeId(rs.getInt("employeeId"));
                employee.setAcountName(rs.getString("acountName"));
                employee.setName(rs.getString("name"));
                employee.setPassword(rs.getString("password"));
                employee.setRole(rs.getString("role"));
                employee.setSex(rs.getString("sex"));
                employee.setAge(rs.getInt("age"));
                employee.setBan(rs.getInt("ban"));
                employee.setDeptName(rs.getString("deptName"));
                employee.setEmail(rs.getString("email"));
                employee.setPhone(rs.getString("phone"));
            }
            BaseDao.closeResource(connection, pstm, rs);
        }
        return employee;
    }

    @Override
    public int updateDepart(Connection connection, String departName, String id) throws Exception {
        int flag = 0;
        PreparedStatement pstm = null;
        if (connection != null) {
            String sql = "UPDATE employee set deptName=? WHERE employeeId=?";
            Object[] params ={departName, id};
            flag = BaseDao.execute(connection, pstm, sql, params);
        }
        BaseDao.closeResource(connection,pstm,null);
        return flag;
    }
}
