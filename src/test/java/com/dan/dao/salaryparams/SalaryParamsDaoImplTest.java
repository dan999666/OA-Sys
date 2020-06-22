package com.dan.dao.salaryparams;

import com.dan.dao.BaseDao;
import com.dan.entity.SalaryParams;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;

class SalaryParamsDaoImplTest {

    @Test
    void addParams() throws Exception {
        SalaryParams salaryParams = new SalaryParams();
        salaryParams.setSalaryparamsId(1);
        salaryParams.setLateStandard(100);
        salaryParams.setAbsentStandard(120);
        salaryParams.setOvertimeStandard(122);
        Connection connection = BaseDao.getConnection();
        SalaryParamsDao salaryParamsDao = new SalaryParamsDaoImpl();
        int flag = salaryParamsDao.addParams(connection, salaryParams);
        System.out.println(flag);
    }
}