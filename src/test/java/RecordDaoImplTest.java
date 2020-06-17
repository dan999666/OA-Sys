import com.dan.dao.BaseDao;
import com.dan.dao.record.RecordDao;
import com.dan.dao.record.RecordDaoImpl;
import com.dan.model.dto.RecordDTO;
import com.dan.entity.Record;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.util.List;

public class RecordDaoImplTest {

    @Test
    public void getRecordsTest() throws Exception {
        Connection connection = BaseDao.getConnection();
        RecordDao recordDao = new RecordDaoImpl();
        List<RecordDTO> records = recordDao.getRecords(connection);
        for (RecordDTO r : records) {
            System.out.println(r.toString());
        }
    }

    @Test
    public void getRecordByIdTest() throws Exception {
        Connection connection = BaseDao.getConnection();
        RecordDao recordDao = new RecordDaoImpl();
        String id = "1";
        Record recordById = recordDao.getRecordById(connection, id);
        System.out.println(recordById.toString());
    }

    @Test
    public void addRecordTest() throws Exception {
        Connection connection = BaseDao.getConnection();
        RecordDao recordDao = new RecordDaoImpl();
        Record record = new Record();
        record.setRecordId(43);
        record.setEmployeeId(32);
        record.setLateRecord(21);
        record.setSaleBonus(312.0);
        record.setAbsentRecord(21);
        record.setOvertimeRecord(12);
        record.setYearBonus(3122.0);
        record.setFestivalBenifit(3231.1);
        record.setBenifit(2122.0);
        int flag = recordDao.addRecord(connection, record);
        System.out.println(flag);
    }

    @Test
    public void modifyRecordByIdTest() throws Exception {
        Connection connection = BaseDao.getConnection();
        RecordDao recordDao = new RecordDaoImpl();
        Record record = new Record();
        record.setRecordId(43);
        record.setEmployeeId(32);
        record.setLateRecord(21);
        record.setSaleBonus(312.0);
        record.setAbsentRecord(21);
        record.setOvertimeRecord(144444444);
        record.setYearBonus(3122.0);
        record.setFestivalBenifit(3231.1);
        record.setBenifit(2122.0);
        int i = recordDao.modifyRecordById(connection, record);
        System.out.println(i);
    }

    @Test
    public void deleteRecordByIdTest() throws Exception {
        Connection connection = BaseDao.getConnection();
        RecordDao recordDao = new RecordDaoImpl();
        String id = "32";
        int i = recordDao.deleteRecordById(connection, id);
        System.out.println(i);
    }
}
