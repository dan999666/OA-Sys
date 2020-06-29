package com.dan.servlet.hr;

import com.dan.entity.SalaryParams;
import com.dan.service.salaryparams.SalaryParamsService;
import com.dan.service.salaryparams.SalaryParamsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HrSalaryParamsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SalaryParams salaryParams = new SalaryParams();
        boolean flag = false;

        String id = req.getParameter("id");
        String late = req.getParameter("late");
        String absent = req.getParameter("absent");
        String overTime = req.getParameter("overTime");

        int salaryId = Integer.parseInt(id);
        int lateStandard = Integer.parseInt(late);
        int absentStandard = Integer.parseInt(absent);
        int overTimeStandard = Integer.parseInt(overTime);

        salaryParams.setSalaryparamsId(salaryId);
        salaryParams.setLateStandard(lateStandard);
        salaryParams.setAbsentStandard(absentStandard);
        salaryParams.setOvertimeStandard(overTimeStandard);

        SalaryParamsService salaryParamsService = new SalaryParamsServiceImpl();
        try {
            flag = salaryParamsService.addSalaryParameters(salaryParams);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (flag) {
            req.getRequestDispatcher("/jsp/hr/salary.do?method=query").forward(req, resp);
        }
    }
}
