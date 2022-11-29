package main.airport.planes;

import main.airport.enums.SeatClass;

import java.util.ArrayList;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassengerPlane)) return false;

        PassengerPlane that = (PassengerPlane) o;

        if (!Objects.equals(trunkVolume, that.trunkVolume)) return false;
        return Objects.equals(seats, that.seats) && this.equals(o);
    }

    @Override
    public int hashCode() {
        int result = trunkVolume != null ? trunkVolume.hashCode() : 0;
        result = 31 * result + (seats != null ? seats.hashCode() : 0);
        return result + this.hashCode();
    }
}
