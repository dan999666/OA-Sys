package com.dan.dao.record;

import com.dan.dto.RecordDTO;
import com.dan.entity.Record;

import java.sql.Connection;
import java.util.List;

public interface RecordDao {

    //查询所有奖惩信息
    public List<RecordDTO> getRecords(Connection connection) throws Exception;

    //依据employeeId修改Record信息
    public int modifyRecordById(Connection connection,Record record) throws Exception;

    //依据employeeId查看Record信息
    public Record getRecordById(Connection connection,String id) throws Exception;

    //依据emplooyeeId删除Record
    public int deleteRecordById(Connection connection,String id) throws Exception;

    //添加相关记录
    public int addRecord(Connection connection,Record record) throws Exception;
}
