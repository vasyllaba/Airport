package main.airport.licenses;

import main.airport.people.Person;

import java.time.LocalDateTime;
import java.util.Date;

public class StewardLicense extends License {
    private String languages;

    public StewardLicense(Integer id, Person person, String photo, LocalDateTime endDate, String languages) {
        super( photo, endDate);
        this.languages = languages;
    }
}
