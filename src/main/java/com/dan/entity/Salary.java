package com.dan.entity;

/**
 * (Salary)实体类
 *
 * @author Dan
 * @since 2020-06-09 10:00:20
 */
public class Salary {

    private Integer employeeId;

    private Double basicSalary;

    private Double weekendSalary;

    private Double festivalSalary;

    private Double absentPunish;

    private Double latePunish;


    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Object getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Object getWeekendSalary() {
        return weekendSalary;
    }

    public void setWeekendSalary(Double weekendSalary) {
        this.weekendSalary = weekendSalary;
    }

    public Object getFestivalSalary() {
        return festivalSalary;
    }

    public void setFestivalSalary(Double festivalSalary) {
        this.festivalSalary = festivalSalary;
    }

    public Object getAbsentPunish() {
        return absentPunish;
    }

    public void setAbsentPunish(Double absentPunish) {
        this.absentPunish = absentPunish;
    }

    public Object getLatePunish() {
        return latePunish;
    }

    public void setLatePunish(Double latePunish) {
        this.latePunish = latePunish;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "employeeid=" + employeeId +
                ", basicsalary=" + basicSalary +
                ", weekensalary=" + weekendSalary +
                ", festivalsalary=" + festivalSalary +
                ", absentpunish=" + absentPunish +
                ", latepunish=" + latePunish +
                '}';
    }
}