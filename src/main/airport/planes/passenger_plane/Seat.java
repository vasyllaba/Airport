package main.airport.planes.passenger_plane;

import main.airport.enums.SeatClass;

public class Seat {
    private SeatClass seatClass;
    private Integer number;
    private Boolean available;

    public Seat(SeatClass seatClass, Integer number, Boolean available) {
        this.seatClass = seatClass;
        this.number = number;
        this.available = available;
    }

    public Seat(SeatClass seatClass, Integer number) {
        this.seatClass = seatClass;
        this.number = number;
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
}
