package com.dan.service.record;

import com.dan.dao.BaseDao;
import com.dan.dao.record.RecordDao;
import com.dan.dao.record.RecordDaoImpl;
import com.dan.dto.RecordDTO;
import com.dan.entity.Record;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class RecordServiceImpl implements RecordService {

    private RecordDao recordDao;

    public RecordServiceImpl() {
        recordDao = new RecordDaoImpl();
    }

    @Override
    public List<RecordDTO> getRecords() throws Exception {
        List<RecordDTO> list = new ArrayList<>();
        Connection connection = BaseDao.getConnection();
        list = recordDao.getRecords(connection);
        return list;
    }

    @Override
    public boolean modifyRecordById(Record record) throws Exception {
        boolean flag = false;
        Connection connection = BaseDao.getConnection();
        int res = recordDao.modifyRecordById(connection, record);
        if (res > 0) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    @Override
    public Record getRecordById(String id) throws Exception {
        Record record = new Record();
        Connection connection = BaseDao.getConnection();
        record = recordDao.getRecordById(connection, id);
        return record;
    }

    @Override
    public boolean deleteRecordById(String id) throws Exception {
        boolean flag = false;
        Connection connection = BaseDao.getConnection();
        int res = recordDao.deleteRecordById(connection, id);
        if (res > 0) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    @Override
    public boolean addRecord(Record record) throws Exception {
        boolean flag = false;
        Connection connection = BaseDao.getConnection();
        int res = recordDao.addRecord(connection, record);
        if (res > 0) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }
}
