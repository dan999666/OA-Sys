package com.dan.service.salaryparams;

import com.dan.dao.BaseDao;
import com.dan.dao.salaryparams.SalaryParamsDao;
import com.dan.dao.salaryparams.SalaryParamsDaoImpl;
import com.dan.entity.SalaryParams;

import java.sql.Connection;

public class SalaryParamsServiceImpl implements SalaryParamsService {

    private SalaryParamsDao salaryParamsDao;

    public SalaryParamsServiceImpl() {
        salaryParamsDao = new SalaryParamsDaoImpl();
    }

    @Override
    public boolean addSalaryParameters(SalaryParams salaryParams) throws Exception {
        Connection connection = BaseDao.getConnection();
        boolean flag = false;
        int res = salaryParamsDao.addParams(connection, salaryParams);
        if (res > 0) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }
}
