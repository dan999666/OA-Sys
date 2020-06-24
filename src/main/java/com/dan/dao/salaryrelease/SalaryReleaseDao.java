package com.dan.dao.salaryrelease;

import com.dan.model.PayOffVO;

import java.sql.Connection;
import java.util.List;

public interface SalaryReleaseDao {

    //获取应该发放员工薪资的信息
    public abstract List<PayOffVO> getSalaryPayOffInfo(Connection connection) throws Exception;

    //发放员工工资
    public abstract int updateSalaryReleaseStatus(Connection connection, String id) throws Exception;
}
