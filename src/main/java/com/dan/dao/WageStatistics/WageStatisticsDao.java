package com.dan.dao.WageStatistics;

import com.dan.entity.WageStatistics;

import java.sql.Connection;

public interface WageStatisticsDao {

    //获取所有的工资种类的和
    public WageStatistics sumOfSalary(Connection connection) throws Exception;

    //获取最大值
    public WageStatistics maxOfSalary() throws Exception;
}
