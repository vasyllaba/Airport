package main.airport.planes;

import main.airport.enums.SeatClass;

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
}
