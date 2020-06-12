package com.dan.servlet;

import com.dan.entity.Employee;
import com.dan.service.EmployeeService;
import com.dan.service.EmployeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("method");
        //System.out.println(method);
        if (method != null && method.equals("query")) {
            this.query(req, resp);
        } else if (method != null && method.equals("view")) {
            this.view(req, resp);
        } else if (method != null && method.equals("delete")) {
            this.delete(req, resp);
        } else if (method != null && method.equals("add")) {
            this.add(req, resp);
        } else if (method != null && method.equals("ban")) {
            this.ban(req, resp);
        }
    }

    private void ban(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        boolean flag = false;
        EmployeeService employeeService = new EmployeeServiceImpl();
        try {
            flag = employeeService.banEmployee(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (flag) {
            resp.sendRedirect(req.getContextPath() + "/jsp/admin/employee.do?method=query");
        }
    }

    private void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*页面跳转，获取表单提交的参数
         * 将参数转化为Employee类
         * 调用employeeservice的方法将值存入数据库之中*/
        Employee employee = new Employee();
        boolean flag = false;

        String employeeId = req.getParameter("employeeId");
        String acountName = req.getParameter("acountName");
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String role = req.getParameter("role");
        String sex = req.getParameter("sex");
        String age = req.getParameter("age");
        String ban = req.getParameter("ban");
        String depart = req.getParameter("depart");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");

        int id = Integer.parseInt(employeeId);
        int employeeAge = Integer.parseInt(age);
        int status = Integer.parseInt(ban);

        employee.setEmployeeId(id);
        employee.setAcountName(acountName);
        employee.setName(name);
        employee.setPassword(password);
        employee.setRole(role);
        employee.setSex(sex);
        employee.setAge(employeeAge);
        employee.setBan(status);
        employee.setDeptName(depart);
        employee.setEmail(email);
        employee.setEmail(phone);

        EmployeeService employeeService = new EmployeeServiceImpl();
        try {
            flag = employeeService.addEmployee(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (flag) {
            resp.sendRedirect(req.getContextPath() + "/jsp/admin/employee.do?method=query");
        }

    }

    private void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        boolean flag = false;
        String id = req.getParameter("id");
        EmployeeService employeeService = new EmployeeServiceImpl();
        try {
            flag = employeeService.deleteEmployee(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (flag) {
            resp.sendRedirect(req.getContextPath() + "/jsp/admin/employee.do?method=query");
        }
    }

    private void view(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Employee employee = new Employee();
        EmployeeService employeeService = new EmployeeServiceImpl();
        try {
            employee = employeeService.getEmployeeById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        req.setAttribute("employee", employee);
        req.getRequestDispatcher("/jsp/admin/employeeView.jsp").forward(req, resp);
    }

    private void query(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Employee> list = new ArrayList<>();
        EmployeeService employeeService = new EmployeeServiceImpl();
        try {
            list = employeeService.getEmployees();
        } catch (Exception e) {
            e.printStackTrace();
        }
        req.setAttribute("employeeList", list);
        req.getRequestDispatcher("/jsp/admin/employeeList.jsp").forward(req, resp);
    }
}
