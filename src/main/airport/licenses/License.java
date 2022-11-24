package main.airport.licenses;

import main.airport.people.Person;

import java.util.Date;

public abstract class License {
    private Integer id;
    private Person person;
    private String photo;
    private Date endDate;

    public License(Integer id, Person person, String photo, Date endDate) {
        this.id = id;
        this.person = person;
        this.photo = photo;
        this.endDate = endDate;
    }

}
