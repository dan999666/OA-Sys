package com.dan.service.record;

import com.dan.dto.RecordDTO;
import com.dan.entity.Record;

import java.util.List;

public interface RecordService {

    public List<RecordDTO> getRecords() throws Exception;

    public boolean modifyRecordById(Record record) throws Exception;

    public Record getRecordById(String id) throws Exception;

    public boolean deleteRecordById(String id) throws Exception;

    public boolean addRecord(Record record) throws Exception;
}
