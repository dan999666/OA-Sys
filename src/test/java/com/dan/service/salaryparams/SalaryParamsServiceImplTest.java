package com.dan.service.salaryparams;

import com.dan.entity.SalaryParams;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryParamsServiceImplTest {

    @Test
    void addSalaryParameters() throws Exception {
        SalaryParamsService salaryParamsService = new SalaryParamsServiceImpl();
        SalaryParams salaryParams = new SalaryParams();
        salaryParams.setSalaryparamsId(2);
        salaryParams.setLateStandard(200);
        salaryParams.setAbsentStandard(120);
        salaryParams.setOvertimeStandard(122);
        boolean flag = salaryParamsService.addSalaryParameters(salaryParams);
        System.out.println(flag);
    }
}