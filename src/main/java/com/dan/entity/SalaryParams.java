package com.dan.entity;

public class SalaryParams {

    private Integer salaryparamsId;

    private Integer lateStandard;

    private Integer absentStandard;

    private Integer overtimeStandard;


    public Integer getSalaryparamsId() {
        return salaryparamsId;
    }

    public void setSalaryparamsId(Integer salaryparamsId) {
        this.salaryparamsId = salaryparamsId;
    }

    public Integer getLateStandard() {
        return lateStandard;
    }

    public void setLateStandard(Integer lateStandard) {
        this.lateStandard = lateStandard;
    }

    public Integer getAbsentStandard() {
        return absentStandard;
    }

    public void setAbsentStandard(Integer absentStandard) {
        this.absentStandard = absentStandard;
    }

    public Integer getOvertimeStandard() {
        return overtimeStandard;
    }

    public void setOvertimeStandard(Integer overtimeStandard) {
        this.overtimeStandard = overtimeStandard;
    }

}