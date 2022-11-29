package main.airport.planes;

import main.airport.enums.SeatClass;

import java.util.Objects;

public class Seat {
    private SeatClass seatClass;
    private Integer number;
    private Boolean available;

    public Seat() {
    }

    public Seat(SeatClass seatClass, Integer number, Boolean available) {
        this.seatClass = seatClass;
        this.number = number;
        this.available = available;
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

    @Override
    public String toString() {
        return "Seat{" +
                "seatClass=" + seatClass +
                ", number=" + number +
                ", available=" + available +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seat)) return false;

        Seat seat = (Seat) o;

        if (getSeatClass() != seat.getSeatClass()) return false;
        return getNumber() != null ? getNumber().equals(seat.getNumber()) : seat.getNumber() == null;
    }

    @Override
    public int hashCode() {
        int result = getSeatClass() != null ? getSeatClass().hashCode() : 0;
        result = 31 * result + (getNumber() != null ? getNumber().hashCode() : 0);
        return result;
    }
}
