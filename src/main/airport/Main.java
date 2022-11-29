package main.airport;

import main.airport.enums.AccessLevel;
import main.airport.enums.Gender;
import main.airport.licenses.PilotLicense;
import main.airport.licenses.StewardLicense;
import main.airport.people.Passenger;
import main.airport.people.Pilot;
import main.airport.people.Steward;
import main.airport.planes.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PilotLicense shepardLicense = new PilotLicense("KT1111KK", LocalDateTime.now(), LocalDateTime.now(),
                new ArrayList<String>(Arrays.asList("JetFighter", "Cargo", "SmallPlane")), 1521,
                "Ukraine");

        PilotLicense armstrongLicense = new PilotLicense("AA0001AM", LocalDateTime.now(), LocalDateTime.now(),
                new ArrayList<String>(Arrays.asList("JetFighter", "Cargo", "SpaceRocket")), 3200,
                "USA");

        StewardLicense tinaLicense = new StewardLicense("EE1408AI", LocalDateTime.now(), LocalDateTime.now(),
                new ArrayList<String>(Arrays.asList("SuperCourses", "H1", "Num_1")));

        //test NullPointerException catcher
        StewardLicense lic = new StewardLicense();
        lic.addCourse("hello");

        Passenger ivan = new Passenger("Ivan", "Lancet", Gender.MALE, 22, new ArrayList<>(),
                "EK1234", "Very kind person");

        Pilot shepard = new Pilot("John", "Shepard", Gender.MALE, 31, "Civil",
                LocalDate.now(), AccessLevel.B, 1800, false,
                new ArrayList<String>(Arrays.asList("Potato")), shepardLicense);

        Pilot armstrong = new Pilot("Niel", "Armstrong", Gender.MALE, 54, "Civil",
                LocalDate.now(), AccessLevel.A, 1800, true, armstrongLicense);

        Steward tina = new Steward("Tina", "Armstrong", Gender.FEMALE, 46, "Civil",
                LocalDate.now(), AccessLevel.C, tinaLicense,
                new ArrayList<String>(Arrays.asList("Ukrainian", "English", "French")));

        PassengerPlane plane = new PassengerPlane(100, 6, 15, 480, "Gas",
                1.2, 2, 3);

        ArrayList<Pilot> pilots = new ArrayList<>();
        pilots.add(shepard);
        pilots.add(armstrong);

        ArrayList<Steward> stewards = new ArrayList<>();
        stewards.add(tina);

        Trip trip = new Trip(plane, pilots, stewards, "Lviv", "Kyiv", LocalDateTime.now(), LocalDateTime.now());

        ArrayList<Seat> seats = trip.getPlane().getSeats();

        System.out.println("Seats before reserving");
        System.out.println(seats);

        System.out.println("--------------------------------------------------");

        System.out.println("Seat №2 may be not available");
        Ticket ticket1 = new Ticket(trip, ivan, seats.get(1));

        System.out.println(ticket1);
        System.out.println("--------------------------------------------------");
        System.out.println(trip);
        System.out.println("--------------------------------------------------");
        System.out.println(plane);
        System.out.println("--------------------------------------------------");

        System.out.println(lic);

        CargoPlane planeC1 = new CargoPlane(100, 6, 15, 480, "Gas",
                1200, 2.1, true, 3.6, 3.2, 4.0);
        CargoPlane planeC2 = new CargoPlane(100, 6, 15, 480, "Gas",
                1200, 2.1, true, 3.1, 3.2, 4.0);
        System.out.println(planeC1.equals(planeC2));

    }
}
