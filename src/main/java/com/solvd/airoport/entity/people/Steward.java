package com.solvd.airoport.entity.people;

import com.solvd.airoport.entity.enums.AccessLevel;
import com.solvd.airoport.entity.enums.Gender;
import com.solvd.airoport.entity.enums.Languages;
import com.solvd.airoport.entity.interfaces.IAnnouncement;
import com.solvd.airoport.entity.people.helper.Course;
import com.solvd.airoport.entity.people.helper.WorkExperience;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Steward extends Employee implements IAnnouncement {

    private List<Course> courses;
    private List<Languages> languages;
    private Boolean preFlightAnnouncement;
    private Boolean preBoardingAnnouncement;

    public Steward() {
        this.preFlightAnnouncement = false;
        this.preBoardingAnnouncement = false;
    }

    public Steward(String name, String surname, Gender gender, Integer age, String department, AccessLevel accessLevel,
                   ArrayList<WorkExperience> workExperience, BigDecimal salary, List<Course> courses,
                   List<Languages> languages) {
        super(name, surname, gender, age, department, accessLevel, workExperience, salary);
        this.courses = courses;
        this.languages = languages;
        this.preFlightAnnouncement = false;
        this.preBoardingAnnouncement = false;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Languages> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Languages> languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "Steward{" +
                "courses=" + courses +
                ", languages=" + languages +
                "} " + super.toString();
    }

    @Override
    public void preBoardingAnnouncement() {
        this.preBoardingAnnouncement = true;
    }

    @Override
    public void preFlightAnnouncement() {
        this.preFlightAnnouncement = true;
    }
}
