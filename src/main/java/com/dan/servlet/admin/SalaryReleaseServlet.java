package com.dan.servlet.admin;

import com.dan.model.PayOffVO;
import com.dan.service.salaryrelease.SalaryPayOffService;
import com.dan.service.salaryrelease.SalaryPayOffServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.MethodDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SalaryReleaseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("method");
//        System.out.println(method);
        if (method != null && method.equals("query")) {
            this.querySalaryPayOffInfo(req, resp);
        } else if (method != null && method.equals("release")) {
            this.releaseSalary(req, resp);
        }
    }

    private void releaseSalary(HttpServletRequest req, HttpServletResponse resp) throws  ServletException, IOException {
        boolean flag = false;
        String id = req.getParameter("id");
        SalaryPayOffService salaryPayOffService = new SalaryPayOffServiceImpl();
        try {
            flag = salaryPayOffService.releaseSalary(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (flag) {
            resp.sendRedirect(req.getContextPath() + "/jsp/admin/salaryRelease.do?method=query");
        }
    }

    private void querySalaryPayOffInfo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<PayOffVO> list = new ArrayList<>();
        SalaryPayOffService salaryPayOffService = new SalaryPayOffServiceImpl();
        try {
            list = salaryPayOffService.getSalaryReleaseInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        req.setAttribute("PayOffVO", list);
        req.getRequestDispatcher("/jsp/admin/salaryPayOff.jsp").forward(req, resp);
    }
}
