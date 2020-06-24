package com.dan.dao.salaryrelease;

import com.dan.dao.BaseDao;
import com.dan.model.PayOffVO;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.util.List;

class SalaryReleaseDaoImplTest {

    @Test
    void getSalaryPayOffInfo() throws Exception {
        SalaryReleaseDao salaryReleaseDao = new SalaryReleaseDaoImpl();
        Connection connection = BaseDao.getConnection();
        List<PayOffVO> salaryPayOffInfo = salaryReleaseDao.getSalaryPayOffInfo(connection);
        for (PayOffVO p : salaryPayOffInfo) {
            System.out.println(p.toString());
        }

    }

    @Test
    void updateSalaryReleaseStatus() throws Exception {
        SalaryReleaseDao salaryReleaseDao = new SalaryReleaseDaoImpl();
        Connection connection = BaseDao.getConnection();
        String id = "1";
        int flag = salaryReleaseDao.updateSalaryReleaseStatus(connection, id);
        System.out.println(flag);
    }
}