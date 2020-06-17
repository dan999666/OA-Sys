package com.dan.servlet.admin;

import com.dan.model.Statistics;
import com.dan.service.statustics.StatisticsService;
import com.dan.service.statustics.StatisticsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StatisticsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("method");
        if (method != null && method.equals("query")) {
            this.query(req, resp);
        }
    }

    private void query(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StatisticsService statisticsService = new StatisticsServiceImpl();
        Statistics statistics = new Statistics();
        try {
            statistics = statisticsService.getSumOfSalary();
        } catch (Exception e) {
            e.printStackTrace();
        }
        req.setAttribute("statistics", statistics);
        req.getRequestDispatcher("/jsp/admin/wageAnalysis.jsp").forward(req, resp);
    }
}
