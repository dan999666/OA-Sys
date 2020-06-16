import com.dan.dao.BaseDao;
import com.dan.dao.WageStatistics.WageStatisticsDao;
import com.dan.dao.WageStatistics.WageStatisticsDaoImpl;
import com.dan.entity.WageStatistics;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;

class WageStatisticsDaoImplTest {

    @Test
    void sumOfSalary() throws Exception {
        WageStatisticsDao wageStatisticsDao = new WageStatisticsDaoImpl();
        Connection connection = BaseDao.getConnection();
        WageStatistics wageStatistics = wageStatisticsDao.sumOfSalary(connection);
        System.out.println(wageStatistics.toString());
    }

    @Test
    void maxOfSalary() {
    }
}