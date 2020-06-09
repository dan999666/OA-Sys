import com.dan.dao.BaseDao;
import com.dan.dao.employee.EmployeeDao;
import com.dan.dao.employee.EmployeeDaoImpl;
import com.dan.entity.Employee;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.util.List;

public class EmployeeDaoImplTest {

    @Test
    public void getEmployeesTest() throws Exception {
        Connection connection = BaseDao.getConnection();
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        List<Employee> employees = employeeDao.getEmployees(connection);
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    @Test
    public void getEmployeeByIdTest() throws Exception {
        Connection connection = BaseDao.getConnection();
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        String id = "1";
        Employee employeeById = employeeDao.getEmployeeById(connection, id);
        System.out.println(employeeById.toString());
    }

    @Test
    public void addEmployeeTest() throws Exception {
        Connection connection = BaseDao.getConnection();
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        Employee employee = new Employee();
        employee.setEmployeeId(9);
        employee.setAcountName("lily");
        employee.setName("李丽");
        employee.setPassword("lily123");
        employee.setRole("finance");
        employee.setSex("女");
        employee.setAge(23);
        employee.setBan(0);
        employee.setDeptName("财务部");
        employee.setEmail("787281@126.com");
        employee.setPhone("18854367832");
        int flag = employeeDao.addEmployee(connection, employee);
        System.out.println(flag);
    }

    @Test
    public void deleteEmployeeTest() throws Exception {
        Connection connection = BaseDao.getConnection();
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        String id = "9";
        int flag = employeeDao.deleteEmployee(connection, id);
        System.out.println(flag);
    }

    @Test
    public void banEmployeeTest() throws Exception {
        Connection connection = BaseDao.getConnection();
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        String id = "8";
        int flag = employeeDao.banEmployee(connection, id);
        System.out.println(flag);
    }

    @Test
    public void updateDepartTest() throws Exception {
        Connection connection = BaseDao.getConnection();
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        String depart = "人力资源部";
        String id = "8";
        int flag = employeeDao.updateDepart(connection, depart, id);
        System.out.println(flag);
    }
}
