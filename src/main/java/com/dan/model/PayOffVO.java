package com.dan.model;

public class PayOffVO {

    private Integer employeeId;

    private String name;

    private String deptName;

    private Integer releaseStatus;

    public Integer getReleaseStatus() {
        return releaseStatus;
    }

    public void setReleaseStatus(Integer releaseStatus) {
        this.releaseStatus = releaseStatus;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "PayOffVO{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", deptName='" + deptName + '\'' +
                ", releaseStatus=" + releaseStatus +
                '}';
    }
}
