package main.airport;

import main.airport.people.Pilot;
import main.airport.planes.Plane;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Trip {
    private Plane plane;
    private ArrayList<Pilot> pilots;
    private String from;
    private String to;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;

    public Trip(Plane plane, ArrayList<Pilot> pilots, String from, String to, LocalDateTime departureTime, LocalDateTime arrivalTime) {
        this.plane = plane;
        this.pilots = pilots;
        this.from = from;
        this.to = to;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "plane=" + plane +
                ", pilots=" + pilots +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}
