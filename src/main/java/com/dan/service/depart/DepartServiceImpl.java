package com.dan.service.depart;

import com.dan.dao.BaseDao;
import com.dan.dao.depart.DepartDao;
import com.dan.dao.depart.DepartDaoImpl;
import com.dan.entity.Department;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class DepartServiceImpl implements DepartService {

    private DepartDao departDao;

    public DepartServiceImpl() {
        departDao = new DepartDaoImpl();
    }

    @Override
    public boolean createDepart(Department department) throws Exception {
        boolean flag = false;
        Connection connection = BaseDao.getConnection();
        int res = departDao.addDepart(connection, department);
        if (res > 0) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    @Override
    public boolean renameDepartById(Department department) throws Exception {
        boolean flag = false;
        Connection connection = BaseDao.getConnection();
        int res = departDao.modifyDepartById(connection, department);
        if (res > 0) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    @Override
    public boolean deleteDepart(Department department) throws Exception {
        boolean flag = false;
        Connection connection = BaseDao.getConnection();
        int res = departDao.modifyDepartById(connection, department);
        if (res > 0) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    @Override
    public List<Department> getDepartInfo() throws Exception {
        Connection connection = BaseDao.getConnection();
        List<Department> list = new ArrayList<>();
        list = departDao.getDepartInfo(connection);
        return list;
    }
}
