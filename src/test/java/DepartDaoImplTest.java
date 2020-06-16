import com.dan.dao.BaseDao;
import com.dan.dao.depart.DepartDao;
import com.dan.dao.depart.DepartDaoImpl;
import com.dan.entity.Department;
import org.junit.jupiter.api.Test;

import javax.sound.midi.Soundbank;
import java.sql.Connection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DepartDaoImplTest {

    @Test
    void addDepart() throws Exception {
        Connection connection = BaseDao.getConnection();
        DepartDao departDao = new DepartDaoImpl();
        Department department = new Department();
        department.setDeptId(32);
        department.setDeptName("中央政治局");
        int flag = departDao.addDepart(connection, department);
        System.out.println(flag);
    }

    @Test
    void modifyDepartById() throws Exception {
        Connection connection = BaseDao.getConnection();
        DepartDao departDao = new DepartDaoImpl();
        Department department = new Department();
        department.setDeptId(32);
        department.setDeptName("国务院");
        int res = departDao.modifyDepartById(connection, department);
        System.out.println(res);
    }

    @Test
    void deleteDepartById() throws Exception {
        Connection connection = BaseDao.getConnection();
        DepartDao departDao = new DepartDaoImpl();
        int res = departDao.deleteDepartById(connection, "32");
        System.out.println(res);
    }

    @Test
    void getDepartInfo() throws Exception {
        Connection connection = BaseDao.getConnection();
        DepartDao departDao = new DepartDaoImpl();
        List<Department> departInfo = departDao.getDepartInfo(connection);
        for (Department department : departInfo) {
            System.out.println(department.toString());
        }

    }

    @Test
    public void getDepartInfoByIdTest() throws Exception {
        Connection connection = BaseDao.getConnection();
        DepartDao departDao = new DepartDaoImpl();
        String id = "1";
        Department departInfoById = departDao.getDepartInfoById(connection, id);
        System.out.println(departInfoById.toString());
    }
}