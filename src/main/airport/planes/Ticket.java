package main.airport.planes;

import main.airport.people.Passenger;

public class Ticket {
    private Integer id;
    private Trip trip;
    private Passenger passenger;
    private Seat seat;

    public Ticket() {
    }

    public Ticket(Trip trip, Passenger passenger, Seat seat) {
        this.trip = trip;
        this.passenger = passenger;
        this.seat = seat;
        seat.setAvailable(false);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id + '\n' +
                ", trip=" + trip + '\n' +
                ", passenger=" + passenger + '\n' +
                ", seat=" + seat + '\n' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ticket)) return false;

        Ticket ticket = (Ticket) o;

        if (getId() != null ? !getId().equals(ticket.getId()) : ticket.getId() != null) return false;
        if (getTrip() != null ? !getTrip().equals(ticket.getTrip()) : ticket.getTrip() != null) return false;
        return getSeat() != null ? getSeat().equals(ticket.getSeat()) : ticket.getSeat() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getTrip() != null ? getTrip().hashCode() : 0);
        result = 31 * result + (getSeat() != null ? getSeat().hashCode() : 0);
        return result;
    }
}
