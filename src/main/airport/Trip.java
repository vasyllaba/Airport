package main.airport;

import main.airport.people.Pilot;
import main.airport.planes.Plane;

import java.util.ArrayList;
import java.util.Date;

public class Trip {
    private Plane plane;
    private ArrayList<Pilot> pilots;
    private String from;
    private String to;
    private Date departureTime;
    private Date arrivalTime;
}
