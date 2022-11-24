package main.airport.planes.passenger_plane;

import main.airport.enums.SeatClass;
import main.airport.planes.Plane;

import java.util.ArrayList;

public class PassengerPlane extends Plane {
    private ArrayList<Seat> seats;

    public PassengerPlane(Integer weight, Integer width, Integer length, Integer speed, String fuelType
            , Integer firstClassSeatsNumber, Integer secondClassSeatsNumber) {
        super(weight, width, length, speed, fuelType);
        createSeats(firstClassSeatsNumber, SeatClass.First);
        createSeats(secondClassSeatsNumber, SeatClass.Second);
    }

    public void createSeats(Integer number, SeatClass seatClass){
        while(number > 0){
            seats.add(new Seat(seatClass, number, true));
            number--;
        }
    }

    @Override
    public String toString() {
        return "PassengerPlane{" +
                "seats=" + seats +
                '}';
    }
}
