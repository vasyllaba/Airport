package main.airport.planes;

import main.airport.enums.SeatClass;

import java.util.ArrayList;

public class PassengerPlane extends Plane {

    private Double trunkVolume;
    private ArrayList<Seat> seats;

    public PassengerPlane() {
    }

    public PassengerPlane(Integer weight, Integer width, Integer length, Integer speed, String fuelType,
                          Double trunkVolume, Integer firstClassSeatsNumber, Integer secondClassSeatsNumber) {
        super(weight, width, length, speed, fuelType);
        this.trunkVolume = trunkVolume;
        createSeats(firstClassSeatsNumber, SeatClass.First);
        createSeats(secondClassSeatsNumber, SeatClass.Second);
    }

    public void createSeats(Integer number, SeatClass seatClass){
        if(seats == null)
            seats = new ArrayList<Seat>();
        while(number > 0){
            seats.add(new Seat(seatClass, number, true));
            number--;
        }
    }

    public Double getTrunkVolume() {
        return trunkVolume;
    }

    public void setTrunkVolume(Double trunkVolume) {
        this.trunkVolume = trunkVolume;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "PassengerPlane{" +
                "trunkVolume=" + trunkVolume +
                ", seats=" + seats +
                ' ' + super.toString() +
                '}';
    }
}
