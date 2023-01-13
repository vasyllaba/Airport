package com.solvd.airoport.entity.people;

import com.solvd.airoport.entity.enums.AccessLevel;
import com.solvd.airoport.entity.enums.Gender;
import com.solvd.airoport.entity.people.helper.WorkExperience;
import org.apache.log4j.Logger;
import java.math.BigDecimal;
import java.util.ArrayList;

public abstract class Employee extends Person {

    private String department;
    private AccessLevel accessLevel;
    private ArrayList<WorkExperience> workExperience;
    private BigDecimal salary;

    private static final Logger LOGGER = Logger.getLogger(Employee.class);

    //todo method calculate experience on current title and experience at all in some field

    public Employee() {
        LOGGER.debug("create new Employee");
    }

    public Employee(String name, String surname, Integer age)  {
        super(name, surname, Gender.OTHER, age);
        LOGGER.debug("create new Employee with name, surname and age");
    }

    public Employee(String name, String surname, Gender gender, Integer age, String department, AccessLevel accessLevel,
                    ArrayList<WorkExperience> workExperience, BigDecimal salary) {
        super(name, surname, gender, age);
        LOGGER.debug("create new DriverLicense with params: department " + department + ", accessLevel" + accessLevel +
                ", workExperience" + workExperience + ", salary" + salary);
        this.department = department;
        this.accessLevel = accessLevel;
        this.workExperience = workExperience;
        this.salary = salary;
    }

    public String getDepartment() {
        LOGGER.info("call getDepartment() method, return value " + department);
        return department;
    }

    public void setDepartment(String department) {
        LOGGER.info("call setDepartment() with value " + department);
        this.department = department;
    }

    public AccessLevel getAccessLevel() {
        LOGGER.info("call getAccessLevel() method, return value " + accessLevel);
        return accessLevel;
    }

    public void setAccessLevel(AccessLevel accessLevel) {
        LOGGER.info("call setAccessLevel() with value " + accessLevel);
        this.accessLevel = accessLevel;
    }

    public ArrayList<WorkExperience> getWorkExperience() {
        LOGGER.info("call getWorkExperience() method, return value " + workExperience);
        return workExperience;
    }

    public void setWorkExperience(ArrayList<WorkExperience> workExperience) {
        LOGGER.info("call setWorkExperience() with value " + workExperience);
        this.workExperience = workExperience;
    }

    public BigDecimal getSalary() {
        LOGGER.info("call getSalary() method, return value " + salary);
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        LOGGER.info("call setSalary() with value " + salary);
        this.salary = salary;
    }

    @Override
    public String toString() {
        LOGGER.info("call toString method");
        return "Worker{" +
                "department='" + department + '\'' +
                ", accessLevel=" + accessLevel +
                ", workExperience=" + workExperience +
                ", salary=" + salary +
                "} " + super.toString();
    }
}
