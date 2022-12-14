package com.solvd.airoport.entity.planes;

import com.solvd.airoport.entity.people.Passenger;
import org.apache.log4j.Logger;

public class Ticket {
    private Integer id;
    private Trip trip;
    private Passenger passenger;
    private Seat seat;

    private static final Logger LOGGER = Logger.getLogger(Ticket.class);

    public Ticket() {
        LOGGER.debug("create new Ticket");
    }

    public Ticket(Trip trip, Passenger passenger, Seat seat) {
        LOGGER.debug("create new Ticket with params: trip " + trip +
                ", passenger " + passenger +
                ", seat " + seat +
                ", available false");
        this.trip = trip;
        this.passenger = passenger;
        this.seat = seat;
        seat.setAvailable(false);
    }

    public Integer getId() {
        LOGGER.info("call getId");
        return id;
    }

    public void setId(Integer id) {
        LOGGER.info("call setId with value " + id);
        this.id = id;
    }

    public Trip getTrip() {
        LOGGER.info("call getTrip");
        return trip;
    }

    public void setTrip(Trip trip) {
        LOGGER.info("call setTrip with value " + trip);
        this.trip = trip;
    }

    public Passenger getPassenger() {
        LOGGER.info("call getPassenger");
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        LOGGER.info("call setPassenger with value " + passenger);
        this.passenger = passenger;
    }

    public Seat getSeat() {
        LOGGER.info("call getSeat");
        return seat;
    }

    public void setSeat(Seat seat) {
        LOGGER.info("call setSeat with value " + seat);
        this.seat = seat;
    }

    @Override
    public String toString() {
        LOGGER.info("call toString()");
        return "Ticket{" +
                "id=" + id + '\n' +
                ", trip=" + trip + '\n' +
                ", passenger=" + passenger + '\n' +
                ", seat=" + seat + '\n' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        LOGGER.info("call equals()");
        if (this == o) return true;
        if (!(o instanceof Ticket)) return false;

        Ticket ticket = (Ticket) o;

        if (getId() != null ? !getId().equals(ticket.getId()) : ticket.getId() != null) return false;
        if (getTrip() != null ? !getTrip().equals(ticket.getTrip()) : ticket.getTrip() != null) return false;
        return getSeat() != null ? getSeat().equals(ticket.getSeat()) : ticket.getSeat() == null;
    }

    @Override
    public int hashCode() {
        LOGGER.info("call hashCode()");
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getTrip() != null ? getTrip().hashCode() : 0);
        result = 31 * result + (getSeat() != null ? getSeat().hashCode() : 0);
        return result;
    }
}
