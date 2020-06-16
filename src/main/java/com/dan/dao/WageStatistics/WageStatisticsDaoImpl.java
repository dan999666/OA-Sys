package com.dan.dao.WageStatistics;

import com.dan.dao.BaseDao;
import com.dan.entity.WageStatistics;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class WageStatisticsDaoImpl implements WageStatisticsDao {
    @Override
    public WageStatistics sumOfSalary(Connection connection) throws Exception {
        WageStatistics wageStatistics = new WageStatistics();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        if (connection != null) {
            String sql = "select sum(basicSalary),sum(weekendSalary),sum(festivalSalary),sum(absentPunish),sum(latePunish),count(employeeId) from salary";
            Object[] params = {};
            rs = BaseDao.execute(connection, pstm, rs, sql, params);
            if (rs.next()) {
                wageStatistics.setSumOfBasicSalary(rs.getDouble("sum(basicSalary)"));
                wageStatistics.setSumOfweekendSalary(rs.getDouble("sum(weekendSalary)"));
                wageStatistics.setSumOfFestivalSalary(rs.getDouble("sum(festivalSalary)"));
                wageStatistics.setSumOfAbsentPunish(rs.getDouble("sum(absentPunish)"));
                wageStatistics.setSumOfLatePunish(rs.getDouble("sum(latePunish)"));
                wageStatistics.setNumsOfEmployee(rs.getInt("count(employeeId)"));
            }
            BaseDao.closeResource(connection, pstm, rs);
        }
        return wageStatistics;
    }

    @Override
    public WageStatistics maxOfSalary() throws Exception {
        return null;
    }
}
