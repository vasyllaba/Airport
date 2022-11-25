package main.airport.people;

import main.airport.enums.AccessLevel;
import main.airport.enums.Gender;
import main.airport.licenses.PilotLicense;

import java.time.LocalDate;
import java.util.List;

public class Pilot extends Worker {

    private Integer flightHours;
    private Boolean isMilitaryExperience;
    private List<String> foodAllergy;
    private PilotLicense license;

    public Pilot() {
    }

    public Pilot(String name, String surname, Gender gender, Integer age, String department, LocalDate employmentDate,
                 AccessLevel accessLevel, Integer flightHours, Boolean isMilitaryExperience,
                 PilotLicense license) {
        super(name, surname, gender, age, department, employmentDate, accessLevel);
        this.flightHours = flightHours;
        this.isMilitaryExperience = isMilitaryExperience;
        this.license = license;
    }

    public Pilot(String name, String surname, Gender gender, Integer age, String department, LocalDate employmentDate,
                 AccessLevel accessLevel, Integer flightHours, Boolean isMilitaryExperience, List<String> foodAllergy,
                 PilotLicense license) {
        super(name, surname, gender, age, department, employmentDate, accessLevel);
        this.flightHours = flightHours;
        this.isMilitaryExperience = isMilitaryExperience;
        this.foodAllergy = foodAllergy;
        this.license = license;
    }

    public Integer getFlightHours() {
        return flightHours;
    }

    public void setFlightHours(Integer flightHours) {
        this.flightHours = flightHours;
    }

    public Boolean getMilitaryExperience() {
        return isMilitaryExperience;
    }

    public void setMilitaryExperience(Boolean militaryExperience) {
        isMilitaryExperience = militaryExperience;
    }

    public List<String> getFoodAllergy() {
        return foodAllergy;
    }

    public void setFoodAllergy(List<String> foodAllergy) {
        this.foodAllergy = foodAllergy;
    }

    public PilotLicense getLicense() {
        return license;
    }

    public void setLicense(PilotLicense license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "flightHours=" + flightHours +
                ", isMilitaryExperience=" + isMilitaryExperience +
                ", foodAllergy=" + foodAllergy +
                "license=" + license +
                super.toString() +
                '}';
    }
}
