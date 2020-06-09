import com.dan.dao.BaseDao;
import com.dan.dao.employee.EmployeeDao;
import com.dan.dao.employee.EmployeeDaoImpl;
import com.dan.entity.Employee;
import com.dan.service.EmployeeService;
import com.dan.service.EmployeeServiceImpl;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.util.List;

public class EmployeeServiceTest {

    @Test
    public void getEmployeesTest() throws Exception {
        EmployeeService employeeService = new EmployeeServiceImpl();
        List<Employee> employees = employeeService.getEmployees();
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    @Test
    public void getEmployeeByIdTest() throws Exception {
        EmployeeService employeeService = new EmployeeServiceImpl();
        String id = "8";
        Employee employeeById = employeeService.getEmployeeById(id);
        System.out.println(employeeById.toString());
    }
}
