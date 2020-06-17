package com.dan.model;

public class Statistics {

    private double sumOfBasicSalary;
    private double sumOfweekendSalary;
    private double sumOfFestivalSalary;
    private double sumOfAbsentPunish;
    private double sumOfLatePunish;
    private int numsOfEmployee;
    private int sumOfAll;

    public int getSumOfAll() {
        return sumOfAll;
    }

    public void setSumOfAll(int sumOfAll) {
        this.sumOfAll = sumOfAll;
    }

    public double getSumOfBasicSalary() {
        return sumOfBasicSalary;
    }

    public void setSumOfBasicSalary(double sumOfBasicSalary) {
        this.sumOfBasicSalary = sumOfBasicSalary;
    }

    public double getSumOfweekendSalary() {
        return sumOfweekendSalary;
    }

    public void setSumOfweekendSalary(double sumOfweekendSalary) {
        this.sumOfweekendSalary = sumOfweekendSalary;
    }

    public double getSumOfFestivalSalary() {
        return sumOfFestivalSalary;
    }

    public void setSumOfFestivalSalary(double sumOfFestivalSalary) {
        this.sumOfFestivalSalary = sumOfFestivalSalary;
    }

    public double getSumOfAbsentPunish() {
        return sumOfAbsentPunish;
    }

    public void setSumOfAbsentPunish(double sumOfAbsentPunish) {
        this.sumOfAbsentPunish = sumOfAbsentPunish;
    }

    public double getSumOfLatePunish() {
        return sumOfLatePunish;
    }

    public void setSumOfLatePunish(double sumOfLatePunish) {
        this.sumOfLatePunish = sumOfLatePunish;
    }

    public int getNumsOfEmployee() {
        return numsOfEmployee;
    }

    public void setNumsOfEmployee(int numsOfEmployee) {
        this.numsOfEmployee = numsOfEmployee;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "sumOfBasicSalary=" + sumOfBasicSalary +
                ", sumOfweekendSalary=" + sumOfweekendSalary +
                ", sumOfFestivalSalary=" + sumOfFestivalSalary +
                ", sumOfAbsentPunish=" + sumOfAbsentPunish +
                ", sumOfLatePunish=" + sumOfLatePunish +
                ", numsOfEmployee=" + numsOfEmployee +
                ", sumOfAll=" + sumOfAll +
                '}';
    }
}
