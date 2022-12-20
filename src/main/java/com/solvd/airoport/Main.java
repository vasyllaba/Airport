package com.solvd.airoport;

import com.solvd.airoport.entity.enums.SeatClass;
import com.solvd.airoport.entity.people.Passenger;
import com.solvd.airoport.entity.people.Pilot;
import com.solvd.airoport.entity.people.Steward;
import com.solvd.airoport.entity.planes.Trip;
import com.solvd.airoport.entity.planes.PassengerPlane;
import com.solvd.airoport.entity.planes.Seat;
import com.solvd.airoport.entity.planes.Ticket;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        PassengerPlane plane = new PassengerPlane();
        plane.createSeats(2, SeatClass.First);
        plane.createSeats(6, SeatClass.Second);

        Pilot pilot1 = new Pilot();
        pilot1.setName("John");

        Steward steward = new Steward();

        Trip par_kyi = new Trip();
        par_kyi.setPlane(plane);
        par_kyi.addPilot(pilot1);
        par_kyi.addSteward(steward);
        par_kyi.setFrom("Paris");
        par_kyi.setTo("Kyiv");
        par_kyi.setDepartureTime(LocalDateTime.now());


        Passenger passenger = new Passenger();
        passenger.setName("Yuriy");
        passenger.setSurname("Kramskoi");

        Seat seat = plane.getSeats().get(2);
        seat.setAvailable(false);

        Ticket ticket = new Ticket(par_kyi, passenger, seat);
        ticket.printTicket();


    }
}
