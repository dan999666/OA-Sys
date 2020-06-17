package com.dan.dao.salary;

import com.dan.dao.BaseDao;
import com.dan.model.dto.SalaryDTO;
import com.dan.entity.Salary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SalaryDaoImpl implements SalaryDao {

    @Override
    public List<SalaryDTO> getAllSalaryInfo(Connection connection) throws Exception {
        PreparedStatement pstm = null;
        List<SalaryDTO> list = new ArrayList<>();
        ResultSet rs = null;
        if (connection != null) {
            String sql = "SELECT salary.*, employee.name FROM salary,employee WHERE employee.employeeId = salary.employeeId";//此条查询SQL需要获得员工所有的工资信息以及员工的姓名
            Object[] params = {};
            rs = BaseDao.execute(connection, pstm, rs, sql, params);
            while (rs.next()) {
                SalaryDTO salaryDTO = new SalaryDTO();
                salaryDTO.setEmployeeId(rs.getInt("employeeId"));
                salaryDTO.setName(rs.getString("name"));
                salaryDTO.setBasicSalary(rs.getDouble("basicSalary"));
                salaryDTO.setWeekendSalary(rs.getDouble("weekendSalary"));
                salaryDTO.setFestivalSalary(rs.getDouble("festivalSalary"));
                salaryDTO.setAbsentPunish(rs.getDouble("absentPunish"));
                salaryDTO.setLatePunish(rs.getDouble("latePunish"));
                list.add(salaryDTO);
            }
            BaseDao.closeResource(connection, pstm, rs);
        }
        return list;
    }

    @Override
    public SalaryDTO getSalaryInfoById(Connection connection, String id) throws Exception {
        PreparedStatement pstm = null;
        ResultSet rs = null;
        SalaryDTO salaryDTO = new SalaryDTO();
        if (connection != null) {
            String sql = "SELECT salary.*,employee.name FROM salary,employee WHERE salary.employeeId=? AND employee.employeeId=?;";
            Object[] params = {id, id};
            rs = BaseDao.execute(connection, pstm, rs, sql, params);
            if (rs.next()) {
                salaryDTO.setEmployeeId(rs.getInt("employeeId"));
                salaryDTO.setName(rs.getString("name"));
                salaryDTO.setBasicSalary(rs.getDouble("basicSalary"));
                salaryDTO.setWeekendSalary(rs.getDouble("weekendSalary"));
                salaryDTO.setFestivalSalary(rs.getDouble("festivalSalary"));
                salaryDTO.setAbsentPunish(rs.getDouble("absentPunish"));
                salaryDTO.setLatePunish(rs.getDouble("latePunish"));
            }
            BaseDao.closeResource(connection, pstm, rs);
        }
        return salaryDTO;
    }

    @Override
    public int modifySalaryInfoById(Connection connection, Salary salary) throws Exception {
        PreparedStatement pstm = null;
        int flag = 0;
        if (connection != null) {
            String sql = "UPDATE salary SET basicSalary=?,weekendSalary=?,festivalSalary=?,absentPunish=?,latePunish=? WHERE employeeId=?";
            Object[] params = {salary.getBasicSalary(), salary.getWeekendSalary(), salary.getFestivalSalary(), salary.getAbsentPunish(), salary.getLatePunish(), salary.getEmployeeId()};
            flag = BaseDao.execute(connection, pstm, sql, params);
            BaseDao.closeResource(connection, pstm, null);
        }
        return flag;
    }

    @Override
    public int deleteSalaryInfoById(Connection connection, String id) throws Exception {
        int flag = 0;
        PreparedStatement pstm = null;
        if (connection != null) {
            String sql = "DELETE FROM salary WHERE employeeId=?";
            Object[] params = {id};
            flag = BaseDao.execute(connection,pstm ,sql,params);
            BaseDao.closeResource(connection,pstm,null);
        }
        return flag;
    }

    @Override
    public int addSalaryInfo(Connection connection, Salary salary) throws Exception {
        int flag = 0;
        PreparedStatement pstm = null;
        if (connection!=null){
            String sql = "INSERT INTO salary VALUES(?,?,?,?,?,?)";
            Object[] params = {salary.getEmployeeId(),salary.getBasicSalary(),salary.getWeekendSalary(),salary.getFestivalSalary(),salary.getAbsentPunish(),salary.getLatePunish()};
            flag = BaseDao.execute(connection,pstm,sql,params);
            BaseDao.closeResource(connection,pstm,null);
        }
        return flag;
    }
}
