package com.dan.dao.salaryparams;

import com.dan.dao.BaseDao;
import com.dan.entity.SalaryParams;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class SalaryParamsDaoImpl implements SalaryParamsDao {
    @Override
    public int addParams(Connection connection, SalaryParams salaryParams) throws Exception {
        PreparedStatement pstm = null;
        int flag = 0;
        if (connection != null) {
            String sql = "insert into salaryparams values(?,?,?,?)";
            Object[] params = {salaryParams.getSalaryparamsId(), salaryParams.getLateStandard(), salaryParams.getAbsentStandard(), salaryParams.getOvertimeStandard()};
            flag = BaseDao.execute(connection, pstm, sql, params);
        }
        BaseDao.closeResource(connection, pstm, null);
        return flag;
    }
}
