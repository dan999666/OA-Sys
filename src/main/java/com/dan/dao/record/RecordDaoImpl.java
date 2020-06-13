package com.dan.dao.record;

import com.dan.dao.BaseDao;
import com.dan.dto.RecordDTO;
import com.dan.entity.Record;

import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RecordDaoImpl implements RecordDao {
    @Override
    public List<RecordDTO> getRecords(Connection connection) throws Exception {
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<RecordDTO> list = new ArrayList<>();
        if (connection != null) {
            String sql = "SELECT record.*,employee.name FROM record,employee WHERE record.employeeId = employee.employeeId";
            Object[] params = {};
            rs = BaseDao.execute(connection, pstm, rs, sql, params);
            while (rs.next()) {
                RecordDTO recordDTO = new RecordDTO();
                recordDTO.setRecordId(rs.getInt("recordId"));
                recordDTO.setEmployeeId(rs.getInt("employeeId"));
                recordDTO.setLateRecord(rs.getInt("lateRecord"));
                recordDTO.setSaleBonus(rs.getDouble("saleBonus"));
                recordDTO.setOvertimeRecord(rs.getInt("overtimeRecord"));
                recordDTO.setFestivalBenifit(rs.getDouble("festivalBenifit"));
                recordDTO.setYearBonus(rs.getDouble("yearBonus"));
                recordDTO.setAbsentRecord(rs.getInt("absentRecord"));
                recordDTO.setBenifit(rs.getDouble("benifit"));
                recordDTO.setName(rs.getString("name"));
                list.add(recordDTO);
            }
            BaseDao.closeResource(connection, pstm, null);
        }
        return list;
    }

    @Override
    public Record getRecordById(Connection connection, String id) throws Exception {
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Record record = new Record();
        if (connection != null) {
            String sql = "SELECT * FROM record WHERE employeeId = ?";
            Object[] params = {id};
            rs = BaseDao.execute(connection, pstm, rs, sql, params);
            if (rs.next()) {
                record.setRecordId(rs.getInt("recordId"));
                record.setEmployeeId(rs.getInt("employeeId"));
                record.setLateRecord(rs.getInt("lateRecord"));
                record.setSaleBonus(rs.getDouble("saleBonus"));
                record.setOvertimeRecord(rs.getInt("overtimeRecord"));
                record.setFestivalBenifit(rs.getDouble("festivalBenifit"));
                record.setYearBonus(rs.getDouble("yearBonus"));
                record.setAbsentRecord(rs.getInt("absentRecord"));
                record.setBenifit(rs.getDouble("benifit"));
            }
            BaseDao.closeResource(connection, pstm, rs);
        }
        return record;
    }

    @Override
    public int addRecord(Connection connection, Record record) throws Exception {
        int flag = 0;
        PreparedStatement pstm = null;
        if (connection != null) {
            String sql = "insert into record values (?,?,?,?,?,?,?,?,?)";
            Object[] params = {
                    record.getRecordId(), record.getEmployeeId(),
                    record.getLateRecord(), record.getSaleBonus(),
                    record.getOvertimeRecord(), record.getFestivalBenifit(),
                    record.getYearBonus(), record.getAbsentRecord(),
                    record.getBenifit()
            };
            flag = BaseDao.execute(connection, pstm, sql, params);
        }
        BaseDao.closeResource(connection, pstm, null);
        return flag;
    }

    @Override
    public int modifyRecordById(Connection connection, Record record) throws Exception {
        int flag = 0;
        PreparedStatement pstm = null;
        if (connection != null) {
            String sql = "update record set recordId=?,lateRecord=?,saleBonus=?,overtimeRecord=?,festivalBenifit=?,yearBonus=?,absentRecord=?,benifit=? where employeeId=?";
            Object[] params = {
                    record.getRecordId(), record.getLateRecord(),
                    record.getSaleBonus(), record.getOvertimeRecord(),
                    record.getFestivalBenifit(), record.getYearBonus(),
                    record.getAbsentRecord(), record.getBenifit(),
                    record.getEmployeeId()
            };
            flag = BaseDao.execute(connection, pstm, sql, params);
            BaseDao.closeResource(connection, pstm, null);
        }
        return flag;
    }

    @Override
    public int deleteRecordById(Connection connection, String id) throws Exception {
        int flag = 0;
        PreparedStatement pstm = null;
        if (connection != null) {
            String sql = "delete from record where employeeId=?";
            Object[] params = {id};
            flag = BaseDao.execute(connection, pstm, sql, params);
        }
        BaseDao.closeResource(connection,pstm,null);
        return flag;
    }
}
