package com.solvd.airoport.entity.planes;

import com.solvd.airoport.entity.people.Pilot;
import com.solvd.airoport.entity.people.Steward;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class Trip {
    private PassengerPlane plane;
    private ArrayList<Pilot> pilots;
    private ArrayList<Steward> stewards;
    private String from;
    private String to;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;

    public Trip() {
    }

    public Trip(PassengerPlane plane, ArrayList<Pilot> pilots, ArrayList<Steward> stewards, String from, String to,
                LocalDateTime departureTime, LocalDateTime arrivalTime) {
        this.plane = plane;
        this.pilots = pilots;
        this.stewards = stewards;
        this.from = from;
        this.to = to;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public PassengerPlane getPlane() {
        return plane;
    }

    public void setPlane(PassengerPlane plane) {
        this.plane = plane;
    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public void setPilots(ArrayList<Pilot> pilots) {
        this.pilots = pilots;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public ArrayList<Steward> getStewards() {
        return stewards;
    }

    public void setStewards(ArrayList<Steward> stewards) {
        this.stewards = stewards;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "plane=" + plane +
                ", pilots=" + pilots +
                ", stewards=" + stewards +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trip)) return false;

        Trip trip = (Trip) o;

        if (getPlane() != null ? !getPlane().equals(trip.getPlane()) : trip.getPlane() != null) return false;
        if (getFrom() != null ? !getFrom().equals(trip.getFrom()) : trip.getFrom() != null) return false;
        if (getTo() != null ? !getTo().equals(trip.getTo()) : trip.getTo() != null) return false;
        if (getDepartureTime() != null ? !getDepartureTime().equals(trip.getDepartureTime()) : trip.getDepartureTime() != null)
            return false;
        return getArrivalTime() != null ? getArrivalTime().equals(trip.getArrivalTime()) : trip.getArrivalTime() == null;
    }

    @Override
    public int hashCode() {
        int result = getPlane() != null ? getPlane().hashCode() : 0;
        result = 31 * result + (getFrom() != null ? getFrom().hashCode() : 0);
        result = 31 * result + (getTo() != null ? getTo().hashCode() : 0);
        result = 31 * result + (getDepartureTime() != null ? getDepartureTime().hashCode() : 0);
        result = 31 * result + (getArrivalTime() != null ? getArrivalTime().hashCode() : 0);
        return result;
    }
}
