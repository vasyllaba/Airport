package main.airport.licenses;

import main.airport.people.Person;

import java.util.Date;

public class StewardLicense extends License {
    private String languages;

    public StewardLicense(Integer id, Person person, String photo, Date endDate, String languages) {
        super(id, person, photo, endDate);
        this.languages = languages;
    }
}
