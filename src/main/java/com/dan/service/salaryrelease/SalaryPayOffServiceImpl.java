package com.dan.service.salaryrelease;

import com.dan.dao.BaseDao;
import com.dan.dao.salaryrelease.SalaryReleaseDao;
import com.dan.dao.salaryrelease.SalaryReleaseDaoImpl;
import com.dan.model.PayOffVO;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class SalaryPayOffServiceImpl implements SalaryPayOffService {

    private SalaryReleaseDao salaryReleaseDao;

    public SalaryPayOffServiceImpl() {
        salaryReleaseDao = new SalaryReleaseDaoImpl();
    }

    @Override
    public List<PayOffVO> getSalaryReleaseInfo() throws Exception {
        List<PayOffVO> list = new ArrayList<>();
        Connection connection = BaseDao.getConnection();
        list = salaryReleaseDao.getSalaryPayOffInfo(connection);
        return list;
    }

    @Override
    public boolean releaseSalary(String id) throws Exception {
        boolean flag = false;
        Connection connection = BaseDao.getConnection();
        int res = salaryReleaseDao.updateSalaryReleaseStatus(connection, id);
        if (res > 0) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }
}
