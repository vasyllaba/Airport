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

public class Pilot extends Employee {

    private PilotLicense license;
    private PilotRank rank;
    private List<String> foodAllergy;
    private Boolean isMilitaryExperience;
    private Integer flightHours;

    private static final Logger LOGGER = Logger.getLogger(Pilot.class);



    public Pilot() {
    }

    public Pilot(String name, String surname, Gender gender, Integer age, String department, AccessLevel accessLevel,
                 ArrayList<WorkExperience> workExperience, BigDecimal salary, PilotLicense license, PilotRank rank,
                 List<String> foodAllergy, Boolean isMilitaryExperience, Integer flightHours) {
        super(name, surname, gender, age, department, accessLevel, workExperience, salary);
        this.license = license;
        this.rank = rank;
        this.foodAllergy = foodAllergy;
        this.isMilitaryExperience = isMilitaryExperience;
        this.flightHours = flightHours;
    }

    public PilotLicense getLicense() {
        return license;
    }

    public void setLicense(PilotLicense license) {
        this.license = license;
    }

    public List<String> getFoodAllergy() {
        return foodAllergy;
    }

    public void setFoodAllergy(List<String> foodAllergy) {
        this.foodAllergy = foodAllergy;
    }

    public Boolean getMilitaryExperience() {
        return isMilitaryExperience;
    }

    public void setMilitaryExperience(Boolean militaryExperience) {
        isMilitaryExperience = militaryExperience;
    }

    public Integer getFlightHours() {
        return flightHours;
    }

    public void setFlightHours(Integer flightHours) {
        this.flightHours = flightHours;
    }

    public PilotRank getRank() {
        return rank;
    }

    public void setRank(PilotRank rank) {
        this.rank = rank;
    }

    public void turnOnEngine(Plane plane){
        plane.setEngine(true);
    }

    public void changeSpeed(Plane plane, Integer speed){
        if (speed < 0){
            LOGGER.error(IncorrectSpeedValueException.MESSAGE);
            throw new IncorrectSpeedValueException(IncorrectSpeedValueException.MESSAGE);
        }
        plane.setSpeed(speed);
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "license=" + license +
                ", rank=" + rank +
                ", foodAllergy=" + foodAllergy +
                ", isMilitaryExperience=" + isMilitaryExperience +
                ", flightHours=" + flightHours +
                "} " + super.toString();
    }
}
