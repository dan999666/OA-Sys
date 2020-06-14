package com.dan.entity;

public class Record {

    private Integer recordId;

    private Integer employeeId;

    private Integer lateRecord;

    private Double saleBonus;

    private Integer overtimeRecord;

    private Double festivalBenifit;

    private Double yearBonus;

    private Integer absentRecord;

    private Double benifit;

    public Double getBenifit() {
        return benifit;
    }

    public void setBenifit(Double benifit) {
        this.benifit = benifit;
    }

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

    public Object getSaleBonus() {
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

    public Object getFestivalBenifit() {
        return festivalBenifit;
    }

    public void setFestivalBenifit(Double festivalBenifit) {
        this.festivalBenifit = festivalBenifit;
    }

    public Object getYearBonus() {
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

    @Override
    public String toString() {
        return "Record{" +
                "recordid=" + recordId +
                ", employeeid=" + employeeId +
                ", laterecord=" + lateRecord +
                ", salebonus=" + saleBonus +
                ", overtimerecord=" + overtimeRecord +
                ", festivalbenifit=" + festivalBenifit +
                ", yearbonus=" + yearBonus +
                ", absentrecord=" + absentRecord +
                '}';
    }
}