import com.dan.dao.BaseDao;
import com.dan.dao.statistics.StatisticsDao;
import com.dan.dao.statistics.StatisticsDaoImpl;
import com.dan.model.Statistics;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

class StatisticsDaoImplTest {

    @Test
    void sumOfSalary() throws Exception {
        StatisticsDao statisticsDao = new StatisticsDaoImpl();
        Connection connection = BaseDao.getConnection();
        Statistics statistics = statisticsDao.sumOfSalary(connection);
        System.out.println(statistics.toString());
    }

    @Test
    void maxOfSalary() {
    }
}