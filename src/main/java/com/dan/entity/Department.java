package com.dan.entity;

/**
 * (Department)实体类
 *
 * @author Dan
 * @since 2020-06-09 09:59:59
 */
public class Department {

    private Integer deptId;

    private String deptName;


    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptid=" + deptId +
                ", deptname='" + deptName + '\'' +
                '}';
    }
}