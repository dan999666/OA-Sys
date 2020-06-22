package com.dan.dao.salaryparams;

import com.dan.entity.SalaryParams;

import java.sql.Connection;

public interface SalaryParamsDao {

    //添加薪资参数
    public int addParams(Connection connection, SalaryParams salaryParams) throws Exception;
}
