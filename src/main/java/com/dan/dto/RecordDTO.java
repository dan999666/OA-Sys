package com.dan.dto;

public class RecordDTO {
    private Integer recordId;

    private Integer employeeId;

    private Integer lateRecord;

    private Double saleBonus;

    private Integer overtimeRecord;

    private Double festivalBenifit;

    private Double yearBonus;

    private Integer absentRecord;

    private Double benifit;

    private String name;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getLateRecord() {
        return lateRecord;
    }

    public void setLateRecord(Integer lateRecord) {
        this.lateRecord = lateRecord;
    }

    public Double getSaleBonus() {
        return saleBonus;
    }

    public void setSaleBonus(Double saleBonus) {
        this.saleBonus = saleBonus;
    }

    public Integer getOvertimeRecord() {
        return overtimeRecord;
    }

    public void setOvertimeRecord(Integer overtimeRecord) {
        this.overtimeRecord = overtimeRecord;
    }

    public Double getFestivalBenifit() {
        return festivalBenifit;
    }

    public void setFestivalBenifit(Double festivalBenifit) {
        this.festivalBenifit = festivalBenifit;
    }

    public Double getYearBonus() {
        return yearBonus;
    }

    public void setYearBonus(Double yearBonus) {
        this.yearBonus = yearBonus;
    }

    public Integer getAbsentRecord() {
        return absentRecord;
    }

    public void setAbsentRecord(Integer absentRecord) {
        this.absentRecord = absentRecord;
    }

    public Double getBenifit() {
        return benifit;
    }

    public void setBenifit(Double benifit) {
        this.benifit = benifit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RecordDTO{" +
                "recordId=" + recordId +
                ", employeeId=" + employeeId +
                ", lateRecord=" + lateRecord +
                ", saleBonus=" + saleBonus +
                ", overtimeRecord=" + overtimeRecord +
                ", festivalBenifit=" + festivalBenifit +
                ", yearBonus=" + yearBonus +
                ", absentRecord=" + absentRecord +
                ", benifit=" + benifit +
                ", name='" + name + '\'' +
                '}';
    }
}
