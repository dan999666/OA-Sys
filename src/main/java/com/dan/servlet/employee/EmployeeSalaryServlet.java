package com.dan.servlet.employee;

import com.dan.model.dto.SalaryDTO;
import com.dan.service.salary.SalaryService;
import com.dan.service.salary.SalaryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EmployeeSalaryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("method");
        if (method != null && method.equals("query")){
            this.query(req,resp);
        }
    }

    private void query(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SalaryDTO salaryDTO = new SalaryDTO();
        String employeeId = req.getSession().getAttribute("employeeId").toString();

        SalaryService salaryService = new SalaryServiceImpl();
        try{
            salaryDTO=salaryService.getSalaryInfoById(employeeId);
        }catch(Exception e){
            e.printStackTrace();
        }
        req.setAttribute("salaryDTO",salaryDTO);
        req.getRequestDispatcher("/jsp/employee/employeeSalaryList.jsp").forward(req,resp);
    }
}


