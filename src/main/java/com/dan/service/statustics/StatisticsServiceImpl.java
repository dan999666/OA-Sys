package com.dan.service.statustics;

import com.dan.dao.BaseDao;
import com.dan.dao.statistics.StatisticsDao;
import com.dan.dao.statistics.StatisticsDaoImpl;
import com.dan.model.Statistics;

import java.sql.Connection;

public class StatisticsServiceImpl implements StatisticsService {
    @Override
    public Statistics getSumOfSalary() throws Exception {
        Connection connection = BaseDao.getConnection();
        Statistics statistics = new Statistics();
        StatisticsDao statisticsDao = new StatisticsDaoImpl();
        statistics = statisticsDao.sumOfSalary(connection);

        double sumOfBasicSalary = statistics.getSumOfBasicSalary();
        double sumOfFestivalSalary = statistics.getSumOfFestivalSalary();
        double sumOfweekendSalary = statistics.getSumOfweekendSalary();
        double sumOfAbsentPunish = statistics.getSumOfAbsentPunish();
        double sumOfLatePunish = statistics.getSumOfLatePunish();
        int  sum = (int) (sumOfBasicSalary + sumOfFestivalSalary + sumOfweekendSalary - sumOfAbsentPunish - sumOfLatePunish);

        statistics.setSumOfAll(sum);

        return statistics;
    }
}
