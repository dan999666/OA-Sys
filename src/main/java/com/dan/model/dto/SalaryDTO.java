package com.dan.model.dto;

public class SalaryDTO {
    private Integer employeeId;

    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Double getWeekendSalary() {
        return weekendSalary;
    }

    public void setWeekendSalary(Double weekendSalary) {
        this.weekendSalary = weekendSalary;
    }

    public Double getFestivalSalary() {
        return festivalSalary;
    }

    public void setFestivalSalary(Double festivalSalary) {
        this.festivalSalary = festivalSalary;
    }

    public Double getAbsentPunish() {
        return absentPunish;
    }

    public void setAbsentPunish(Double absentPunish) {
        this.absentPunish = absentPunish;
    }

    public Double getLatePunish() {
        return latePunish;
    }

    public void setLatePunish(Double latePunish) {
        this.latePunish = latePunish;
    }

    @Override
    public String toString() {
        return "SalaryDTO{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", basicSalary=" + basicSalary +
                ", weekendSalary=" + weekendSalary +
                ", festivalSalary=" + festivalSalary +
                ", absentPunish=" + absentPunish +
                ", latePunish=" + latePunish +
                '}';
    }
}
