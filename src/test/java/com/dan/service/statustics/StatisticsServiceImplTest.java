package com.dan.service.statustics;

import com.dan.model.Statistics;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceImplTest {

    @Test
    void getSumOfSalary() {
        StatisticsService statisticsService = new StatisticsServiceImpl();
        Statistics sumOfSalary = new Statistics();
        try {
            sumOfSalary = statisticsService.getSumOfSalary();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(sumOfSalary.toString());

    }
}