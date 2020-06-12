import com.dan.dto.SalaryDTO;
import com.dan.service.salary.SalaryService;
import com.dan.service.salary.SalaryServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SalaryServiceImplTest {

    @Test
    public void getAllSalaryInfoTest() throws Exception {
        SalaryService salaryService = new SalaryServiceImpl();
        List<SalaryDTO> allSalaryInfo = salaryService.getAllSalaryInfo();
        for (SalaryDTO s : allSalaryInfo) {
            System.out.println(s.toString());
        }
    }
}
