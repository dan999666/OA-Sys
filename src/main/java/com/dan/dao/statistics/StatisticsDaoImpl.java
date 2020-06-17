package com.dan.dao.statistics;

import com.dan.dao.BaseDao;
import com.dan.model.Statistics;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StatisticsDaoImpl implements StatisticsDao {
    @Override
    public Statistics sumOfSalary(Connection connection) throws Exception {
        Statistics statistics = new Statistics();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        if (connection != null) {
            String sql = "select sum(basicSalary),sum(weekendSalary),sum(festivalSalary),sum(absentPunish),sum(latePunish),count(employeeId) from salary";
            Object[] params = {};
            rs = BaseDao.execute(connection, pstm, rs, sql, params);
            if (rs.next()) {
                statistics.setSumOfBasicSalary(rs.getDouble("sum(basicSalary)"));
                statistics.setSumOfweekendSalary(rs.getDouble("sum(weekendSalary)"));
                statistics.setSumOfFestivalSalary(rs.getDouble("sum(festivalSalary)"));
                statistics.setSumOfAbsentPunish(rs.getDouble("sum(absentPunish)"));
                statistics.setSumOfLatePunish(rs.getDouble("sum(latePunish)"));
                statistics.setNumsOfEmployee(rs.getInt("count(employeeId)"));
            }
            BaseDao.closeResource(connection, pstm, rs);
        }
        return statistics;
    }

    @Override
    public Statistics maxOfSalary() throws Exception {
        return null;
    }
}
