package com.dan.service.salary;

import com.dan.dao.BaseDao;
import com.dan.dao.salary.SalaryDao;
import com.dan.dao.salary.SalaryDaoImpl;
import com.dan.dto.SalaryDTO;
import com.dan.entity.Salary;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class SalaryServiceImpl implements SalaryService {

    private SalaryDao salaryDao;

    public SalaryServiceImpl() {
        salaryDao = new SalaryDaoImpl();
    }

    @Override
    public List<SalaryDTO> getAllSalaryInfo() throws Exception {
        Connection connection = BaseDao.getConnection();
        List<SalaryDTO> list = new ArrayList<>();
        list = salaryDao.getAllSalaryInfo(connection);
        return list;
    }

    @Override
    public SalaryDTO getSalaryInfoById(String id) throws Exception {
        Connection connection = BaseDao.getConnection();
        SalaryDTO salaryDTO = new SalaryDTO();
        salaryDTO = salaryDao.getSalaryInfoById(connection, id);
        return salaryDTO;
    }

    @Override
    public boolean deleteInfoById(String id) throws Exception {
        boolean flag = false;
        Connection connection = BaseDao.getConnection();
        int res = salaryDao.deleteSalaryInfoById(connection, id);
        if (res > 0) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    @Override
    public boolean addSalaryInfo(Salary salary) throws Exception {
        boolean flag = false;
        Connection connection = BaseDao.getConnection();
        int res = salaryDao.addSalaryInfo(connection, salary);
        if (res > 0) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }
}
