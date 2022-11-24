package main.airport.licenses;

import main.airport.people.Person;

import java.time.LocalDateTime;

public abstract class License {
    private String photo;
    private LocalDateTime endDate;

    public License( String photo, LocalDateTime endDate) {
        this.photo = photo;
        this.endDate = endDate;
    }

}
