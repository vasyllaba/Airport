package com.solvd.airoport.entity.people.helper;

import org.apache.log4j.Logger;

public class Course {
    private String name;
    private double salaryModifier;

    private static final Logger LOGGER = Logger.getLogger(Course.class);

    public Course() {
        LOGGER.debug("create new Course");
    }

    public Course(String name, double salaryModifier) {
        LOGGER.debug("create new Course with params: name " + name + ", salaryModifier " + salaryModifier);
        this.name = name;
        this.salaryModifier = salaryModifier;
    }

    public String getName() {
        LOGGER.info("call getName() method");
        return name;
    }

    public void setName(String name) {
        LOGGER.info("call setName() method with param name = " + name);
        this.name = name;
    }

    public double getSalaryModifier() {
        LOGGER.info("call getSalaryModifier() method");
        return salaryModifier;
    }

    public void setSalaryModifier(double salaryModifier) {
        LOGGER.info("call setSalaryModifier() method with param salaryModifier = " + salaryModifier);
        this.salaryModifier = salaryModifier;
    }

    @Override
    public boolean equals(Object o) {
        LOGGER.info("call equals()");
        if (this == o) return true;
        if (!(o instanceof Course)) return false;

        Course course = (Course) o;

        if (Double.compare(course.getSalaryModifier(), getSalaryModifier()) != 0) return false;
        return getName() != null ? getName().equals(course.getName()) : course.getName() == null;
    }

    @Override
    public int hashCode() {
        LOGGER.info("call hashCode()");
        int result;
        long temp;
        result = getName() != null ? getName().hashCode() : 0;
        temp = Double.doubleToLongBits(getSalaryModifier());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        LOGGER.info("call toString()");
        return "Course{" +
                "name='" + name + '\'' +
                ", salaryModifier=" + salaryModifier +
                '}';
    }
}
