package com.dan.service;

import com.dan.dao.BaseDao;
import com.dan.dao.employee.EmployeeDao;
import com.dan.dao.employee.EmployeeDaoImpl;
import com.dan.entity.Employee;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao;

    public EmployeeServiceImpl() {
        employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public boolean addEmployee(Employee employee) throws Exception {
        boolean flag = false;
        Connection connection = BaseDao.getConnection();
        int res = employeeDao.addEmployee(connection, employee);
        if (res > 0) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    @Override
    public boolean banEmployee(String id) throws Exception {
        boolean flag = false;
        Connection connection = BaseDao.getConnection();
        int res = employeeDao.banEmployee(connection, id);
        if (res > 0) {
            flag = true;
        } else {

            flag = false;
        }
        return flag;
    }

    @Override
    public boolean deleteEmployee(String id) throws Exception {
        boolean flag = false;
        Connection connection = BaseDao.getConnection();
        int res = employeeDao.deleteEmployee(connection, id);
        if (res > 0) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    @Override
    public List<Employee> getEmployees() throws Exception {
        List<Employee> list = new ArrayList<>();
        Connection connection = BaseDao.getConnection();
        list = employeeDao.getEmployees(connection);
        return list;
    }

    @Override
    public Employee getEmployeeById(String id) throws Exception {
        Employee employee = new Employee();
        Connection connection = BaseDao.getConnection();
        employee = employeeDao.getEmployeeById(connection, id);
        return employee;
    }

    @Override
    public boolean updateDepart(String depart, String id) throws Exception {
        boolean flag = false;
        Connection connection = BaseDao.getConnection();
        int res = employeeDao.updateDepart(connection, depart, id);
        if (res > 0) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }
}
