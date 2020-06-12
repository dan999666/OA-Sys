import com.dan.entity.Employee;
import com.dan.service.employee.EmployeeService;
import com.dan.service.employee.EmployeeServiceImpl;
import org.junit.jupiter.api.Test;

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
