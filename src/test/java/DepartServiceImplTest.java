import com.dan.entity.Department;
import com.dan.service.depart.DepartService;
import com.dan.service.depart.DepartServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DepartServiceImplTest {

    @Test
    void createDepart() throws Exception {
        Department department = new Department();
        department.setDeptId(32);
        department.setDeptName("国务院");
        DepartService departService = new DepartServiceImpl();
        boolean res = departService.createDepart(department);
        System.out.println(res);
    }

    @Test
    void renameDepartById() {
    }

    @Test
    void deleteDepart() {
    }

    @Test
    void getDepartInfo() throws Exception {
        DepartService departService = new DepartServiceImpl();
        List<Department> departInfo = departService.getDepartInfo();
        for (Department department : departInfo) {
            System.out.println(department.toString());
        }
    }

}