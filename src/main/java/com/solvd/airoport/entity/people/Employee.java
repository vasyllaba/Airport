package com.solvd.airoport.entity.people;

import com.solvd.airoport.entity.enums.AccessLevel;
import com.solvd.airoport.entity.enums.Gender;
import com.solvd.airoport.entity.people.helper.WorkExperience;

import java.math.BigDecimal;
import java.util.ArrayList;

public abstract class Employee extends Person {

    private String department;
    private AccessLevel accessLevel;
    private ArrayList<WorkExperience> workExperience;
    private BigDecimal salary;

    //todo method calculate досвід yf посаді на фірмі Ввесь досвід

    public Employee() {
    }

    public Employee(String name, String surname, Gender gender, Integer age, String department, AccessLevel accessLevel,
                    ArrayList<WorkExperience> workExperience, BigDecimal salary) {
        super(name, surname, gender, age);
        this.department = department;
        this.accessLevel = accessLevel;
        this.workExperience = workExperience;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public AccessLevel getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(AccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }

    public ArrayList<WorkExperience> getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(ArrayList<WorkExperience> workExperience) {
        this.workExperience = workExperience;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "department='" + department + '\'' +
                ", accessLevel=" + accessLevel +
                ", workExperience=" + workExperience +
                ", salary=" + salary +
                "} " + super.toString();
    }
}
