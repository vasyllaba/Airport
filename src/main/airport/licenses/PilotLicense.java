package main.airport.licenses;

import main.airport.people.Person;

import java.util.Date;

public class PilotLicense extends License {
    private String planeType;
    private Integer flightHours;

    public PilotLicense(Integer id, Person person, String photo, Date endDate, String planeType, Integer flightHours) {
        super(id, person, photo, endDate);
        this.planeType = planeType;
        this.flightHours = flightHours;
    }
}
