package com.dan.servlet.user;

import com.dan.entity.Employee;
import com.dan.service.employee.EmployeeService;
import com.dan.service.employee.EmployeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Employee employee = new Employee();
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        System.out.println(userName);
        System.out.println(password);

        EmployeeService employeeService = new EmployeeServiceImpl();
        try {
            employee = employeeService.login(userName, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(employee.toString());
        Integer ban = employee.getBan();
        System.out.println(ban);

        boolean status = false;
        if (ban != null && ban == 0) {
            status = true;
        } else {
            status = false;
        }

        String role = employee.getRole();
        Integer employeeId = employee.getEmployeeId();
        if (status) {
            if (role.equals("root")) {
                resp.sendRedirect("jsp/admin/index.jsp");
            } else if (role.equals("hr")) {
                req.getSession().setAttribute("employeeRole", employee.getRole());
                resp.sendRedirect("jsp/hr/index.jsp");
            } else if (role.equals("develop")) {
                req.getSession().setAttribute("employeeRole", employee.getRole());
                req.getSession().setAttribute("employeeId", employeeId);
                resp.sendRedirect("jsp/employee/index.jsp");
            } else if (role.equals("finance")) {
                req.getSession().setAttribute("employeeRole", employee.getRole());
                resp.sendRedirect("jsp/finance/index.jsp");
            }
        } else {
            //在登录页面添加一个提示信息
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }
}
