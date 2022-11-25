package main.airport.planes;

import main.airport.people.Pilot;
import main.airport.people.Steward;

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
}
