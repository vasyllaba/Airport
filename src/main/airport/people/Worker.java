package main.airport.people;

import main.airport.enums.AccessLevel;
import main.airport.enums.Gender;

import java.time.LocalDate;

public abstract class Worker extends Person {

    private String department;
    private LocalDate employmentDate;
    private AccessLevel accessLevel;

    public Worker() {
    }

    public Worker(String name, String surname, Gender gender, Integer age, String department, LocalDate employmentDate,
                  AccessLevel accessLevel) {
        super(name, surname, gender, age);
        this.department = department;
        this.employmentDate = employmentDate;
        this.accessLevel = accessLevel;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(LocalDate employmentDate) {
        this.employmentDate = employmentDate;
    }

    public AccessLevel getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(AccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }

    @Override
    public String toString() {
        return ' ' +
                "department='" + department + '\'' +
                ", employmentDate=" + employmentDate +
                ", accessLevel=" + accessLevel +
                super.toString() +
                '}';
    }
}
