package com.dan.dao.statistics;

import com.dan.model.Statistics;

import java.sql.Connection;

public interface StatisticsDao {

    //获取所有的工资种类的和
    public Statistics sumOfSalary(Connection connection) throws Exception;

    //获取最大值
    public Statistics maxOfSalary() throws Exception;
}
