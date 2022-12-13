package com.solvd.airoport.entity.planes;

import com.solvd.airoport.entity.enums.SeatClass;

public class Seat {
    private SeatClass seatClass;
    private Integer number;
    private Boolean available;
    private Double baggageVolume;

    public Seat() {
    }

    public Seat(SeatClass seatClass, Integer number, Boolean available, Double baggageVolume) {
        this.seatClass = seatClass;
        this.number = number;
        this.available = available;
        this.baggageVolume = baggageVolume;
    }

    public SeatClass getSeatClass() {
        return seatClass;
    }

    public Integer getNumber() {
        return number;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public void setSeatClass(SeatClass seatClass) {
        this.seatClass = seatClass;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getBaggageVolume() {
        return baggageVolume;
    }

    public void setBaggageVolume(Double baggageVolume) {
        this.baggageVolume = baggageVolume;
    }

    @Override
    public boolean equals(Object o) {
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
        int result = getSeatClass() != null ? getSeatClass().hashCode() : 0;
        result = 31 * result + (getNumber() != null ? getNumber().hashCode() : 0);
        result = 31 * result + (getAvailable() != null ? getAvailable().hashCode() : 0);
        result = 31 * result + (getBaggageVolume() != null ? getBaggageVolume().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatClass=" + seatClass +
                ", number=" + number +
                ", available=" + available +
                ", baggageVolume=" + baggageVolume +
                '}';
    }
}
