package com.solvd.airoport.entity.planes;

import com.solvd.airoport.entity.enums.SeatClass;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Objects;

public class PassengerPlane extends Plane {

    private Double trunkVolume;
    private ArrayList<Seat> seats;

    private static final Logger LOGGER = Logger.getLogger(PassengerPlane.class);

    public PassengerPlane() {
        LOGGER.debug("create new PassengerPlane");
    }

    public PassengerPlane(Integer weight, Integer width, Integer length, Integer speed, String fuelType,
                          Double fuelAmount, Double fuelTankSize, Double fuelUsagePerHour, Double trunkVolume,
                          ArrayList<Seat> seats) {
        super(weight, width, length, speed, fuelType, fuelAmount, fuelTankSize, fuelUsagePerHour);
        LOGGER.debug("create new PassengerPlane with params: trunkVolume " + trunkVolume + ", seats" +
                seats);
        this.trunkVolume = trunkVolume;
        this.seats = seats;
    }

    public void createSeats(Integer number, SeatClass seatClass){
        LOGGER.info("create " + number + " seats " + seatClass.getSeatClass() + " class");
        if(seats == null) {
            LOGGER.debug("create new ArrayList<>");
            seats = new ArrayList<>();
        }
        while(number > 0){
            LOGGER.debug("create new seat with number " + number);
            seats.add(new Seat(seatClass, number, true, 15.0));
            number--;
        }
    }

    public Double getTrunkVolume() {
        LOGGER.info("call getTrunkVolume");
        return trunkVolume;
    }

    public void setTrunkVolume(Double trunkVolume) {
        LOGGER.info("call setTrunkVolume with value " + trunkVolume);
        this.trunkVolume = trunkVolume;
    }

    public ArrayList<Seat> getSeats() {
        LOGGER.info("call getSeats");
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        LOGGER.info("call setSeats with value " + seats);
        this.seats = seats;
    }

    @Override
    public String toString() {
        LOGGER.info("call toString()");
        return "PassengerPlane{" +
                "trunkVolume=" + trunkVolume +
                ", seats=" + seats +
                ' ' + super.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        LOGGER.info("call equals()");
        if (this == o) return true;
        if (!(o instanceof PassengerPlane)) return false;

        PassengerPlane that = (PassengerPlane) o;

        if (!Objects.equals(trunkVolume, that.trunkVolume)) return false;
        return Objects.equals(seats, that.seats);
    }

    @Override
    public int hashCode() {
        LOGGER.info("call hashCode()");
        int result = trunkVolume != null ? trunkVolume.hashCode() : 0;
        result = 31 * result + (seats != null ? seats.hashCode() : 0);
        return result + this.hashCode();
    }
}
