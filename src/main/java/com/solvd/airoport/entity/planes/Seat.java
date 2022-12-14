package com.solvd.airoport.entity.planes;

import com.solvd.airoport.entity.enums.SeatClass;
import org.apache.log4j.Logger;

public class Seat {
    private SeatClass seatClass;
    private Integer number;
    private Boolean available;
    private Double baggageVolume;

    private static final Logger LOGGER = Logger.getLogger(Seat.class);

    public Seat() {
        LOGGER.debug("create new Seat");
    }

    public Seat(SeatClass seatClass, Integer number, Boolean available, Double baggageVolume) {
        LOGGER.debug("create new Seat with params: seatClass " + seatClass +
                ", number" + number +
                ", available" + available +
                ", baggageVolume" + baggageVolume);
        this.seatClass = seatClass;
        this.number = number;
        this.available = available;
        this.baggageVolume = baggageVolume;
    }

    public SeatClass getSeatClass() {
        LOGGER.info("call getSeatClass()");
        return seatClass;
    }

    public Integer getNumber() {
        LOGGER.info("call getNumber()");
        return number;
    }

    public Boolean getAvailable() {
        LOGGER.info("call getAvailable()");
        return available;
    }

    public void setAvailable(Boolean available) {
        LOGGER.info("call setAvailable() with value " + available);
        this.available = available;
    }

    public void setSeatClass(SeatClass seatClass) {
        LOGGER.info("call setSeatClass() with value " + seatClass);
        this.seatClass = seatClass;
    }

    public void setNumber(Integer number) {
        LOGGER.info("call setNumber() with value " + number);
        this.number = number;
    }

    public Double getBaggageVolume() {
        LOGGER.info("call getBaggageVolume");
        return baggageVolume;
    }

    public void setBaggageVolume(Double baggageVolume) {
        LOGGER.info("call setBaggageVolume() with value " + baggageVolume);
        this.baggageVolume = baggageVolume;
    }

    @Override
    public boolean equals(Object o) {
        LOGGER.info("call equals()");
        if (this == o) return true;
        if (!(o instanceof Seat)) return false;

        Seat seat = (Seat) o;

        if (getSeatClass() != seat.getSeatClass()) return false;
        if (getNumber() != null ? !getNumber().equals(seat.getNumber()) : seat.getNumber() != null) return false;
        if (getAvailable() != null ? !getAvailable().equals(seat.getAvailable()) : seat.getAvailable() != null)
            return false;
        return getBaggageVolume() != null ? getBaggageVolume().equals(seat.getBaggageVolume()) : seat.getBaggageVolume() == null;
    }

    @Override
    public int hashCode() {
        LOGGER.info("call hashCode()");
        int result = getSeatClass() != null ? getSeatClass().hashCode() : 0;
        result = 31 * result + (getNumber() != null ? getNumber().hashCode() : 0);
        result = 31 * result + (getAvailable() != null ? getAvailable().hashCode() : 0);
        result = 31 * result + (getBaggageVolume() != null ? getBaggageVolume().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        LOGGER.info("call toString()");
        return "Seat{" +
                "seatClass=" + seatClass +
                ", number=" + number +
                ", available=" + available +
                ", baggageVolume=" + baggageVolume +
                '}';
    }
}
