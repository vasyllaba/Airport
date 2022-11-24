package main.airport;

import main.airport.licenses.PilotLicense;
import main.airport.people.Pilot;
import main.airport.planes.PassengerPlane;
import main.airport.planes.Plane;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Plane plane = new PassengerPlane(100, 6, 15, 480, "Gas",
                3, 8);
        Pilot pilot1 = new Pilot("John Simpson", "Civil",
                new PilotLicense("/path", LocalDateTime.now(), "civil", 1000));
        ArrayList<Pilot> pilots = new ArrayList<>();
        pilots.add(pilot1);
        Trip trip = new Trip(plane,pilots, "Lviv", "Kyiv", LocalDateTime.now(), LocalDateTime.now());
        System.out.println(plane);
        System.out.println(trip);
    }
}
