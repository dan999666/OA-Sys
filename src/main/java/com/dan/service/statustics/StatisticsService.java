package com.dan.service.statustics;

import com.dan.model.Statistics;

public interface StatisticsService {

    //获取各项工资的统计结果
    public Statistics getSumOfSalary() throws Exception;
}
