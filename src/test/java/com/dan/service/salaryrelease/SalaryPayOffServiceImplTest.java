package com.dan.service.salaryrelease;

import com.dan.model.PayOffVO;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalaryPayOffServiceImplTest {

    @Test
    void getSalaryReleaseInfo() throws Exception {
        SalaryPayOffServiceImpl salaryPayOffService = new SalaryPayOffServiceImpl();
        List<PayOffVO> salaryReleaseInfo = salaryPayOffService.getSalaryReleaseInfo();
        for (PayOffVO p : salaryReleaseInfo) {
            System.out.println(p.toString());
        }
    }

    @Test
    void releaseSalary() throws Exception {
        SalaryPayOffServiceImpl salaryPayOffService = new SalaryPayOffServiceImpl();
        String id = "1";
        boolean b = salaryPayOffService.releaseSalary(id);
        System.out.println(b);
    }
}