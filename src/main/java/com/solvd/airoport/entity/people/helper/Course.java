package com.solvd.airoport.entity.people.helper;

public class Course {
    private String name;
    private double salaryModifier;

    public Course() {
    }

    public Course(String name, double salaryModifier) {
        this.name = name;
        this.salaryModifier = salaryModifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaryModifier() {
        return salaryModifier;
    }

    public void setSalaryModifier(double salaryModifier) {
        this.salaryModifier = salaryModifier;
    }
}
