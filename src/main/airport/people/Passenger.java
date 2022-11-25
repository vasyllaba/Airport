package main.airport.people;

import main.airport.enums.Gender;

import java.util.List;

public class Passenger extends Person {

    // we store her tickets' id only
    private List<Integer> ticketHistory;
    private String passportData;
    private String description;

    public Passenger() {
    }

    public Passenger(String name, String surname, Gender gender, Integer age, List<Integer> ticketHistory,
                     String passportData, String description) {
        super(name, surname, gender, age);
        this.ticketHistory = ticketHistory;
        this.passportData = passportData;
        this.description = description;
    }

    public List<Integer> getTicketHistory() {
        return ticketHistory;
    }

    public void setTicketHistory(List<Integer> ticketHistory) {
        this.ticketHistory = ticketHistory;
    }

    public String getPassportData() {
        return passportData;
    }

    public void setPassportData(String passportData) {
        this.passportData = passportData;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "ticketHistory=" + ticketHistory +
                ", passportData='" + passportData + '\'' +
                "description='" + description + "\' " +
                super.toString() +
                '}';
    }
}
