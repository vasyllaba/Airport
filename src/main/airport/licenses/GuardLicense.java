package main.airport.licenses;

import main.airport.people.Person;

import java.util.Date;

public class GuardLicense extends License {
    private String rank;

    public GuardLicense(Integer id, Person person, String photo, Date endDate, String rank) {
        super(id, person, photo, endDate);
        this.rank = rank;
    }

}
