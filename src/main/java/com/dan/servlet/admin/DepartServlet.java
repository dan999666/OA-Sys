package com.dan.servlet.admin;

import com.dan.entity.Department;
import com.dan.service.depart.DepartService;
import com.dan.service.depart.DepartServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DepartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("method");
        if (method != null && method.equals("query")) {
            this.query(req, resp);
        } else if (method != null && method.equals("modify")) {
            this.getDepartInfoById(req, resp);
        } else if (method != null && method.equals("modifySave")) {
            this.modifyDepart(req, resp);
        } else if (method != null && method.equals("delete")) {
            this.deleteDepart(req, resp);
        } else if (method != null && method.equals("add")) {
            this.addDepart(req, resp);
        } else if (method != null && method.equals("merge")) {
            this.mergeDepart(req, resp);
        }
    }

    private void mergeDepart(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        boolean flag = false;
        String id1 = req.getParameter("id1");
        String id2 = req.getParameter("id2");
        String id3 = req.getParameter("id3");
        String[] deleteIds = {id1, id2, id3};

        String id4 = req.getParameter("id4");
        int newDepartId = Integer.parseInt(id4);
        String departName = req.getParameter("departName");

        DepartServiceImpl departService = new DepartServiceImpl();
        for (String i :deleteIds){
            try {
                departService.deleteDepartById(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        Department department = new Department();
        department.setDeptId(newDepartId);
        department.setDeptName(departName);

        try {
            flag = departService.createDepart(department);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (flag) {
            resp.sendRedirect(req.getContextPath() + "/jsp/admin/depart.do?method=query");
        }
    }

    private void addDepart(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        boolean flag = false;

        String departId = req.getParameter("departId");
        String departName = req.getParameter("departName");

        int id = Integer.parseInt(departId);

        Department department = new Department();
        department.setDeptId(id);
        department.setDeptName(departName);

        DepartService departService = new DepartServiceImpl();
        try {
            flag = departService.createDepart(department);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (flag) {
            resp.sendRedirect(req.getContextPath() + "/jsp/admin/depart.do?method=query");
        }
    }

    private void deleteDepart(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        boolean flag = false;
        String id = req.getParameter("id");
        DepartService departService = new DepartServiceImpl();
        try {
            flag = departService.deleteDepartById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (flag) {
            resp.sendRedirect(req.getContextPath() + "/jsp/admin/depart.do?method=query");
        }
    }

    private void modifyDepart(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        boolean flag = false;
        Department department = new Department();
        String deptId = req.getParameter("deptId");
        String deptName = req.getParameter("deptName");
        System.out.println(deptId + deptName);
        int id = Integer.parseInt(deptId);
        department.setDeptId(id);
        department.setDeptName(deptName);
        DepartService departService = new DepartServiceImpl();
        try {
            flag = departService.modifyDepart(department);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (flag) {
            resp.sendRedirect(req.getContextPath() + "/jsp/admin/depart.do?method=query");
        }
    }

    private void getDepartInfoById(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        String id = req.getParameter("id");
        Department department = new Department();
        DepartService departService = new DepartServiceImpl();
        try {
            department = departService.getDepartById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        req.setAttribute("depart", department);
        req.getRequestDispatcher("/jsp/admin/departModify.jsp").forward(req, resp);
    }

    private void query(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Department> list = new ArrayList<>();
        DepartService departService = new DepartServiceImpl();
        try {
            list = departService.getDepartInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        req.setAttribute("departList", list);
        req.getRequestDispatcher("/jsp/admin/departList.jsp").forward(req, resp);
    }
}
