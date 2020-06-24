package com.dan.service.salaryrelease;

import com.dan.model.PayOffVO;

import java.util.List;

public interface SalaryPayOffService {

    //获取信息
    public List<PayOffVO> getSalaryReleaseInfo() throws Exception;

    //发放工资
    public boolean releaseSalary(String id) throws Exception;
}
