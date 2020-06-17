package com.dan.servlet.admin;

import com.dan.model.dto.RecordDTO;
import com.dan.entity.Record;
import com.dan.service.record.RecordService;
import com.dan.service.record.RecordServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RecordServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("method");
        if (method != null && method.equals("query")) {
            this.query(req, resp);
        } else if (method != null && method.equals("add")) {
            this.addRecord(req, resp);
        } else if (method != null && method.equals("modifySave")) {
            this.modifySaveRecord(req, resp);
        } else if (method != null && method.equals("modify")) {
            this.getRecordInfo(req, resp);
        } else if (method != null && method.equals("delete")) {
            this.deleteRecord(req, resp);
        }
    }

    private void deleteRecord(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        boolean flag = false;
        RecordService recordService = new RecordServiceImpl();
        try {
            flag = recordService.deleteRecordById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (flag) {
            resp.sendRedirect(req.getContextPath() + "/jsp/admin/record.do?method=query");
        }
    }

    private void getRecordInfo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Record record = new Record();
        RecordService recordService = new RecordServiceImpl();
        try {
            record = recordService.getRecordById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        req.setAttribute("record", record);
        req.getRequestDispatcher("/jsp/admin/recordModify.jsp").forward(req, resp);
    }

    private void modifySaveRecord(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Record record = new Record();
        boolean flag = false;

        String id = req.getParameter("recordId");
        String emId = req.getParameter("employeeId");
        String laRecord = req.getParameter("lateRecord");
        String saBonus = req.getParameter("saleBonus");
        String overRecord = req.getParameter("overtimeRecord");
        String fesBenifit = req.getParameter("festivalBenifit");
        String yBonus = req.getParameter("yearBonus");
        String abRecord = req.getParameter("absentRecord");
        String recordBenifit = req.getParameter("benifit");

        int recordId = Integer.parseInt(id);
        int employeeId = Integer.parseInt(emId);
        int lateRecord = Integer.parseInt(laRecord);
        double saleBonus = Double.parseDouble(saBonus);
        int overtimeRecord = Integer.parseInt(overRecord);
        double festivalBenifit = Double.parseDouble(fesBenifit);
        double yearBonus = Double.parseDouble(yBonus);
        int absentRecord = Integer.parseInt(abRecord);
        double benifit = Double.parseDouble(recordBenifit);

        record.setRecordId(recordId);
        record.setEmployeeId(employeeId);
        record.setLateRecord(lateRecord);
        record.setSaleBonus(saleBonus);
        record.setOvertimeRecord(overtimeRecord);
        record.setFestivalBenifit(festivalBenifit);
        record.setYearBonus(yearBonus);
        record.setAbsentRecord(absentRecord);
        record.setBenifit(benifit);

        RecordService recordService = new RecordServiceImpl();

        try {
            flag = recordService.modifyRecordById(record);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (flag) {
            resp.sendRedirect(req.getContextPath() + "/jsp/admin/record.do?method=query");
        }
    }

    private void addRecord(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Record record = new Record();
        boolean flag = false;

        String id = req.getParameter("recordId");
        String emId = req.getParameter("employeeId");
        String laRecord = req.getParameter("lateRecord");
        String saBonus = req.getParameter("saleBonus");
        String overRecord = req.getParameter("overtimeRecord");
        String fesBenifit = req.getParameter("festivalBenifit");
        String yBonus = req.getParameter("yearBonus");
        String abRecord = req.getParameter("absentRecord");
        String recordBenifit = req.getParameter("benifit");

        int recordId = Integer.parseInt(id);
        int employeeId = Integer.parseInt(emId);
        int lateRecord = Integer.parseInt(laRecord);
        double saleBonus = Double.parseDouble(saBonus);
        int overtimeRecord = Integer.parseInt(overRecord);
        double festivalBenifit = Double.parseDouble(fesBenifit);
        double yearBonus = Double.parseDouble(yBonus);
        int absentRecord = Integer.parseInt(abRecord);
        double benifit = Double.parseDouble(recordBenifit);

        record.setRecordId(recordId);
        record.setEmployeeId(employeeId);
        record.setLateRecord(lateRecord);
        record.setSaleBonus(saleBonus);
        record.setOvertimeRecord(overtimeRecord);
        record.setFestivalBenifit(festivalBenifit);
        record.setYearBonus(yearBonus);
        record.setAbsentRecord(absentRecord);
        record.setBenifit(benifit);

        RecordService recordService = new RecordServiceImpl();

        try {
            flag = recordService.addRecord(record);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (flag) {
            resp.sendRedirect(req.getContextPath() + "/jsp/admin/record.do?method=query");
        }
    }

    private void query(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<RecordDTO> list = new ArrayList<>();
        RecordService recordService = new RecordServiceImpl();
        try {
            list = recordService.getRecords();
        } catch (Exception e) {
            e.printStackTrace();
        }
        req.setAttribute("recordList", list);
        req.getRequestDispatcher("/jsp/admin/recordList.jsp").forward(req, resp);

    }
}
