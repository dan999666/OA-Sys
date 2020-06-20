import com.dan.entity.Employee;
import com.dan.service.employee.EmployeeService;
import com.dan.service.employee.EmployeeServiceImpl;
import org.junit.jupiter.api.Test;
import sun.security.util.Password;

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

    @Test
    public void loginTest() throws Exception {
        EmployeeService employeeService = new EmployeeServiceImpl();
        String user = "root";
        String password = "123456";
        Employee login = employeeService.login(user, password);
        System.out.println(login.toString());
    }
}
