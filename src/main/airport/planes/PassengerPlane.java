package main.airport.planes;

import main.airport.enums.SeatClass;

import java.util.ArrayList;

public class PassengerPlane extends Plane {
    private ArrayList<Seat> seats;

    public PassengerPlane(Integer weight, Integer width, Integer length, Integer speed, String fuelType
            , Integer firstClassSeatsNumber, Integer secondClassSeatsNumber) {
        super(weight, width, length, speed, fuelType);
        seats = new ArrayList<>();
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
        return super.toString() + " " +
                "seats=" + seats +
                '}';
    }
}
