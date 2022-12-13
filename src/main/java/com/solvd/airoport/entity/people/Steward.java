package com.solvd.airoport.entity.people;

import com.solvd.airoport.entity.enums.AccessLevel;
import com.solvd.airoport.entity.enums.Gender;
import com.solvd.airoport.entity.enums.Languages;
import com.solvd.airoport.entity.interfaces.IAnnouncement;
import com.solvd.airoport.entity.people.helper.Course;
import com.solvd.airoport.entity.people.helper.WorkExperience;
import org.apache.log4j.Logger;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Steward extends Employee implements IAnnouncement {

    private List<Course> courses;
    private List<Languages> languages;
    private Boolean preFlightAnnouncement;
    private Boolean preBoardingAnnouncement;

    private static final Logger LOGGER = Logger.getLogger(SeniorPilot.class);

    public Steward() {
        LOGGER.debug("create new Steward");
        this.preFlightAnnouncement = false;
        this.preBoardingAnnouncement = false;
    }

    public Steward(String name, String surname, Gender gender, Integer age, String department, AccessLevel accessLevel,
                   ArrayList<WorkExperience> workExperience, BigDecimal salary, List<Course> courses,
                   List<Languages> languages) {
        super(name, surname, gender, age, department, accessLevel, workExperience, salary);
        LOGGER.debug("create new Steward with params: courses " + courses + ", languages" +
                languages + ", preFlightAnnouncement" + preFlightAnnouncement + ", preBoardingAnnouncement" +
                preBoardingAnnouncement);
        this.courses = courses;
        this.languages = languages;
        this.preFlightAnnouncement = false;
        this.preBoardingAnnouncement = false;
    }

    public List<Course> getCourses() {
        LOGGER.info("call getCourses");
        return courses;
    }

    public void setCourses(List<Course> courses) {
        LOGGER.info("call setCourses with value " + courses);
        this.courses = courses;
    }

    public List<Languages> getLanguages() {
        LOGGER.info("call getLanguages");
        return languages;
    }

    public void setLanguages(List<Languages> languages) {
        LOGGER.info("call setLanguages with value " + languages);
        this.languages = languages;
    }

    @Override
    public String toString() {
        LOGGER.info("call toString()");
        return "Steward{" +
                "courses=" + courses +
                ", languages=" + languages +
                "} " + super.toString();
    }

    @Override
    public void preBoardingAnnouncement() {
        LOGGER.info("do pre-boarding announcement");
        this.preBoardingAnnouncement = true;
    }

    @Override
    public void preFlightAnnouncement() {
        LOGGER.info("do pre-flight announcement");
        this.preFlightAnnouncement = true;
    }

    @Override
    public boolean equals(Object o) {
        LOGGER.info("call equals()");
        if (this == o) return true;
        if (!(o instanceof Steward)) return false;

        Steward steward = (Steward) o;

        if (getCourses() != null ? !getCourses().equals(steward.getCourses()) : steward.getCourses() != null)
            return false;
        if (getLanguages() != null ? !getLanguages().equals(steward.getLanguages()) : steward.getLanguages() != null)
            return false;
        if (preFlightAnnouncement != null ? !preFlightAnnouncement.equals(steward.preFlightAnnouncement) : steward.preFlightAnnouncement != null)
            return false;
        return preBoardingAnnouncement != null ? preBoardingAnnouncement.equals(steward.preBoardingAnnouncement) : steward.preBoardingAnnouncement == null;
    }

    @Override
    public int hashCode() {
        LOGGER.info("call hashCode()");
        int result = getCourses() != null ? getCourses().hashCode() : 0;
        result = 31 * result + (getLanguages() != null ? getLanguages().hashCode() : 0);
        result = 31 * result + (preFlightAnnouncement != null ? preFlightAnnouncement.hashCode() : 0);
        result = 31 * result + (preBoardingAnnouncement != null ? preBoardingAnnouncement.hashCode() : 0);
        return result;
    }
}
