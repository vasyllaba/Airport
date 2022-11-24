package main.airport.licenses;

import java.time.LocalDateTime;

public class PilotLicense extends License {
    private String planeType;
    private Integer flightHours;

    public PilotLicense(String photo, LocalDateTime endDate, String planeType, Integer flightHours) {
        super(photo, endDate);
        this.planeType = planeType;
        this.flightHours = flightHours;
    }
}
