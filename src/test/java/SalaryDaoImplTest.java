import com.dan.dao.BaseDao;
import com.dan.dao.salary.SalaryDao;
import com.dan.dao.salary.SalaryDaoImpl;
import com.dan.dto.SalaryDTO;
import com.dan.entity.Salary;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.util.List;

public class SalaryDaoImplTest {

    @Test
    public void getAllSalaryInfoTest() throws Exception {
        SalaryDao salaryDao = new SalaryDaoImpl();
        Connection connection = BaseDao.getConnection();
        List<SalaryDTO> list = salaryDao.getAllSalaryInfo(connection);
        for (SalaryDTO s : list) {
            System.out.println(s.toString());
        }
    }

    @Test
    public void getSalaryInfoByIdTest() throws Exception {
        SalaryDao salaryDao = new SalaryDaoImpl();
        Connection connection = BaseDao.getConnection();
        String id = "1";
        SalaryDTO s = salaryDao.getSalaryInfoById(connection, id);
        System.out.println(s.toString());
    }

    @Test
    public void modifySalaryInfoByIdTest() throws Exception {
        SalaryDao salaryDao = new SalaryDaoImpl();
        Connection connection = BaseDao.getConnection();
        Salary salary = new Salary();
        salary.setEmployeeId(1);
        salary.setBasicSalary(10000.0);
        salary.setWeekendSalary(2000.0);
        salary.setFestivalSalary(1000.0);
        salary.setAbsentPunish(500.0);
        salary.setLatePunish(180.0);
        int flag = salaryDao.modifySalaryInfoById(connection, salary);
        System.out.println(flag);
    }

    @Test
    public void deleteSalaryInfoByIdTest() throws Exception {
        SalaryDao salaryDao = new SalaryDaoImpl();
        Connection connection = BaseDao.getConnection();
        int flag = salaryDao.deleteSalaryInfoById(connection, "7");
        System.out.println(flag);
    }

    @Test
    public void addSalaryInfoTest() throws Exception {
        SalaryDao salaryDao = new SalaryDaoImpl();
        Connection connection = BaseDao.getConnection();
        Salary salary = new Salary();
        salary.setEmployeeId(7);
        salary.setBasicSalary(10000.0);
        salary.setWeekendSalary(2000.0);
        salary.setFestivalSalary(1000.0);
        salary.setAbsentPunish(500.0);
        salary.setLatePunish(180.0);
        int flag = salaryDao.addSalaryInfo(connection, salary);
        System.out.println(flag);
    }
}

