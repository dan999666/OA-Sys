package com.dan.servlet.hr;

import com.dan.entity.Salary;
import com.dan.model.dto.SalaryDTO;
import com.dan.service.salary.SalaryService;
import com.dan.service.salary.SalaryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HrSalaryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   //     String employeeRole = req.getSession().getAttribute("employeeRole").toString();
     //   System.out.println(employeeRole);
        String method = req.getParameter("method");
        if (method != null && method.equals("query")) {
            this.query(req, resp);
        } else if (method != null && method.equals("modify")) {
            this.modify(req, resp);
        } else if (method != null && method.equals("modifySave")) {
            this.modifySave(req, resp);
        } else if (method != null && method.equals("delete")) {
            this.deleteSalaryInfo(req, resp);
        } else if (method != null && method.equals("add")) {
            this.addSalaryRecord(req, resp);
        } else if (method != null && method.equals("queryInfo")) {
            this.queryInfo(req, resp);
        }

    }

    private void queryInfo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<SalaryDTO> salaryList = new ArrayList<>();
        SalaryService salaryService = new SalaryServiceImpl();
        try {
            salaryList = salaryService.getAllSalaryInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        req.setAttribute("salaryList", salaryList);
        req.getRequestDispatcher("/jsp/hr/showSalary.jsp").forward(req, resp);
    }

    private void addSalaryRecord(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        boolean flag = false;

        //获取参数
        String employeeId = req.getParameter("employeeId");
        String basic = req.getParameter("basicSalary");
        String weekend = req.getParameter("weekendSalary");
        String festival = req.getParameter("festivalSalary");
        String absent = req.getParameter("absentPunish");
        String late = req.getParameter("latePunish");

        //数据类型转化
        int id = Integer.parseInt(employeeId);
        double basicSalary = Double.parseDouble(basic);
        double weekendSalary = Double.parseDouble(weekend);
        double festivalSalary = Double.parseDouble(festival);
        double absentPunish = Double.parseDouble(absent);
        double latePunish = Double.parseDouble(late);

        //将数据转化为Salary
        Salary salary = new Salary();
        salary.setEmployeeId(id);
        salary.setBasicSalary(basicSalary);
        salary.setWeekendSalary(weekendSalary);
        salary.setFestivalSalary(festivalSalary);
        salary.setAbsentPunish(absentPunish);
        salary.setLatePunish(latePunish);

        //写入数据库
        SalaryService salaryService = new SalaryServiceImpl();
        try {
            flag = salaryService.addSalaryInfo(salary);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //页面转发
        if (flag) {
            resp.sendRedirect(req.getContextPath() + "/jsp/hr/salary.do?method=query");
        }
    }

    private void deleteSalaryInfo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        boolean flag = false;
        String id = req.getParameter("id");
        SalaryService salaryService = new SalaryServiceImpl();
        try {
            flag = salaryService.deleteInfoById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (flag) {
            resp.sendRedirect(req.getContextPath() + "/jsp/hr/salary.do?method=query");
        }
    }

    private void modifySave(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        boolean flag = false;

        //获取参数
        String employeeId = req.getParameter("employeeId");
        String basic = req.getParameter("basicSalary");
        String weekend = req.getParameter("weekendSalary");
        String festival = req.getParameter("festivalSalary");
        String absent = req.getParameter("absentPunish");
        String late = req.getParameter("latePunish");

        //数据类型转化
        int id = Integer.parseInt(employeeId);
        double basicSalary = Double.parseDouble(basic);
        double weekendSalary = Double.parseDouble(weekend);
        double festivalSalary = Double.parseDouble(festival);
        double absentPunish = Double.parseDouble(absent);
        double latePunish = Double.parseDouble(late);

        //将数据转化为Salary
        Salary salary = new Salary();
        salary.setEmployeeId(id);
        salary.setBasicSalary(basicSalary);
        salary.setWeekendSalary(weekendSalary);
        salary.setFestivalSalary(festivalSalary);
        salary.setAbsentPunish(absentPunish);
        salary.setLatePunish(latePunish);

        //写入数据库
        SalaryService salaryService = new SalaryServiceImpl();
        try {
            flag = salaryService.modifySalaryById(salary);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //页面转发
        if (flag) {
            resp.sendRedirect(req.getContextPath() + "/jsp/hr/salary.do?method=query");
        }
    }


    private void modify(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        SalaryDTO info = new SalaryDTO();
        SalaryService salaryService = new SalaryServiceImpl();
        try {
            info = salaryService.getSalaryInfoById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        req.setAttribute("salary", info);
        req.getRequestDispatcher("/jsp/hr/salaryModify.jsp").forward(req, resp);
    }

    private void query(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<SalaryDTO> salaryList = new ArrayList<>();
        SalaryService salaryService = new SalaryServiceImpl();
        try {
            salaryList = salaryService.getAllSalaryInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        req.setAttribute("salaryList", salaryList);
        req.getRequestDispatcher("/jsp/hr/salaryList.jsp").forward(req, resp);
    }
}
