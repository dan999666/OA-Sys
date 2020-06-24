package com.dan.dao.salaryrelease;

import com.dan.dao.BaseDao;
import com.dan.model.PayOffVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SalaryReleaseDaoImpl implements SalaryReleaseDao {

    @Override
    public List<PayOffVO> getSalaryPayOffInfo(Connection connection) throws Exception {
        List<PayOffVO> list = new ArrayList<>();
        ResultSet rs = null;
        PreparedStatement pstm = null;
        if (connection != null) {
            String sql = "select employee.employeeId, employee.name, employee.deptName, salary.releaseStatus from employee, salary where employee.employeeId = salary.employeeId";
            Object[] params = {};
            rs = BaseDao.execute(connection, pstm, rs, sql, params);
            while (rs.next()) {
                PayOffVO payOffVO = new PayOffVO();
                payOffVO.setEmployeeId(rs.getInt("employee.employeeId"));
                payOffVO.setName(rs.getString("employee.name"));
                payOffVO.setDeptName(rs.getString("employee.deptName"));
                payOffVO.setReleaseStatus(rs.getInt("salary.releaseStatus"));
                list.add(payOffVO);
            }
            BaseDao.closeResource(connection, pstm, rs);
        }
        return list;
    }

    @Override
    public int updateSalaryReleaseStatus(Connection connection, String id) throws Exception {
        int flag = 0;
        PreparedStatement pstm = null;
        if (connection != null) {
            String sql = "update salary set releaseStatus = 1 where employeeId = ?";
            Object[] params = {id};
            flag = BaseDao.execute(connection, pstm, sql, params);
        }
        BaseDao.closeResource(connection, pstm, null);
        return flag;
    }
}
