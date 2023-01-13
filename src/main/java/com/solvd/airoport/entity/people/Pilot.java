package com.solvd.airoport.entity.people;

import com.solvd.airoport.entity.enums.AccessLevel;
import com.solvd.airoport.entity.enums.Gender;
import com.solvd.airoport.entity.enums.PilotRank;
import com.solvd.airoport.entity.licenses.PilotLicense;
import com.solvd.airoport.entity.people.helper.WorkExperience;
import com.solvd.airoport.entity.planes.Plane;
import com.solvd.airoport.exceptions.IncorrectSpeedValueException;
import org.apache.log4j.Logger;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pilot extends Employee implements Runnable {

    private PilotLicense license;
    private PilotRank rank;
    private List<String> foodAllergy;
    private Boolean isMilitaryExperience;
    private Integer flightHours;

    private static final Logger LOGGER = Logger.getLogger(Pilot.class);

    public Pilot() {
        LOGGER.debug("create new Pilot");
    }

    public Pilot(String name, String surname, Integer age) {
        super(name, surname, age);
        LOGGER.debug("create new Pilot with name, surname and age");
    }

    public Pilot(String name, String surname, Gender gender, Integer age, String department, AccessLevel accessLevel,
                 ArrayList<WorkExperience> workExperience, BigDecimal salary, PilotLicense license, PilotRank rank,
                 List<String> foodAllergy, Boolean isMilitaryExperience, Integer flightHours) {
        super(name, surname, gender, age, department, accessLevel, workExperience, salary);
        LOGGER.debug("create new Person with params: license " + license + ", rank" +
                rank + ", foodAllergy" + foodAllergy + ", isMilitaryExperience" + isMilitaryExperience +
                ", flightHours" + flightHours);
        this.license = license;
        this.rank = rank;
        this.foodAllergy = foodAllergy;
        this.isMilitaryExperience = isMilitaryExperience;
        this.flightHours = flightHours;
    }

    public PilotLicense getLicense() {
        LOGGER.info("call getName()");
        return license;
    }

    public void setLicense(PilotLicense license) {
        LOGGER.info("call setLicense() with value " + license);
        this.license = license;
    }

    public List<String> getFoodAllergy() {
        LOGGER.info("call getFoodAllergy()");
        return foodAllergy;
    }

    public void setFoodAllergy(List<String> foodAllergy) {
        LOGGER.info("call setFoodAllergy() with value " + foodAllergy);
        this.foodAllergy = foodAllergy;
    }

    public Boolean getMilitaryExperience() {
        LOGGER.info("call getMilitaryExperience()");
        return isMilitaryExperience;
    }

    public void setMilitaryExperience(Boolean militaryExperience) {
        LOGGER.info("call setMilitaryExperience() with value " + militaryExperience);
        isMilitaryExperience = militaryExperience;
    }

    public Integer getFlightHours() {
        LOGGER.info("call getFlightHours()");
        return flightHours;
    }

    public void setFlightHours(Integer flightHours) {
        LOGGER.info("call setFlightHours() with value " + flightHours);
        this.flightHours = flightHours;
    }

    public PilotRank getRank() {
        LOGGER.info("call getRank()");
        return rank;
    }

    public void setRank(PilotRank rank) {
        LOGGER.info("call setRank() with value " + rank);
        this.rank = rank;
    }

    public void turnOnEngine(Plane plane){
        LOGGER.info("call turnOnEngine()");
        plane.setEngine(true);
    }

    public void changeSpeed(Plane plane, Integer speed){
        LOGGER.info("call changeSpeed()");
        if (speed < 0){
            LOGGER.error(IncorrectSpeedValueException.MESSAGE);
            throw new IncorrectSpeedValueException(IncorrectSpeedValueException.MESSAGE);
        }
        LOGGER.debug("set speed value = " + speed);
        plane.setSpeed(speed);
    }

    @Override
    public boolean equals(Object o) {
        LOGGER.info("call equals()");
        if (this == o) return true;
        if (!(o instanceof Pilot)) return false;

        Pilot pilot = (Pilot) o;

        if (getLicense() != null ? !getLicense().equals(pilot.getLicense()) : pilot.getLicense() != null) return false;
        if (getRank() != pilot.getRank()) return false;
        if (getFoodAllergy() != null ? !getFoodAllergy().equals(pilot.getFoodAllergy()) : pilot.getFoodAllergy() != null)
            return false;
        if (!Objects.equals(isMilitaryExperience, pilot.isMilitaryExperience))
            return false;
        return getFlightHours() != null ? getFlightHours().equals(pilot.getFlightHours()) : pilot.getFlightHours() == null;
    }

    @Override
    public int hashCode() {
        LOGGER.info("call hashCode()");
        int result = getLicense() != null ? getLicense().hashCode() : 0;
        result = 31 * result + (getRank() != null ? getRank().hashCode() : 0);
        result = 31 * result + (getFoodAllergy() != null ? getFoodAllergy().hashCode() : 0);
        result = 31 * result + (isMilitaryExperience != null ? isMilitaryExperience.hashCode() : 0);
        result = 31 * result + (getFlightHours() != null ? getFlightHours().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        LOGGER.info("call toString()");
        return "Pilot{" +
                "license=" + license +
                ", rank=" + rank +
                ", foodAllergy=" + foodAllergy +
                ", isMilitaryExperience=" + isMilitaryExperience +
                ", flightHours=" + flightHours +
                "} " + super.toString();
    }

    @Override
    public void run() {

    }
}
