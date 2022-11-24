package main.airport.licenses;

import main.airport.people.Person;

import java.time.LocalDateTime;

public class GuardLicense extends License {
    private String rank;

    public GuardLicense(Integer id, Person person, String photo, LocalDateTime endDate, String rank) {
        super(photo, endDate);
        this.rank = rank;
    }

}
