package main.airport;

import main.airport.people.Passenger;
import main.airport.planes.Seat;

public class Ticket {
    private Integer id;
    private Trip trip;
    private Passenger passenger;
    private Seat seat;

    public Ticket(Trip trip, Passenger passenger, Seat seat) {
        this.trip = trip;
        this.passenger = passenger;
        this.seat = seat;
        seat.setAvailable(false);
    }
}
