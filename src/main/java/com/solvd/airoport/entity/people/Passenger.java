package com.solvd.airoport.entity.people;

import com.solvd.airoport.entity.enums.Gender;
import com.solvd.airoport.entity.people.helper.Baggage;
import com.solvd.airoport.entity.people.helper.FlyingHistory;
import com.solvd.airoport.entity.planes.Ticket;

import java.util.List;

public class Passenger extends Person {

    private String passportData;
    private Ticket ticket;
    private List<FlyingHistory> flyingHistory;
    private Baggage currentBaggage;
    private String description;
    private Integer creditCard;
    private Integer bonusPoint;
    private Boolean onBoard;
    private Boolean underArrest;

    public Passenger() {
        this.underArrest = false;
    }

    public Passenger(String name, String surname, Gender gender, Integer age, String passportData,
                     Baggage currentBaggage, String description, Integer creditCard) {
        super(name, surname, gender, age);
        this.passportData = passportData;
        this.currentBaggage = currentBaggage;
        this.description = description;
        this.creditCard = creditCard;
        this.underArrest = false;
    }

    public String getPassportData() {
        return passportData;
    }

    public void setPassportData(String passportData) {
        this.passportData = passportData;
    }

    public List<FlyingHistory> getFlyingHistory() {
        return flyingHistory;
    }

    public void setFlyingHistory(List<FlyingHistory> flyingHistory) {
        this.flyingHistory = flyingHistory;
    }

    public Baggage getCurrentBaggage() {
        return currentBaggage;
    }

    public void setCurrentBaggage(Baggage currentBaggage) {
        this.currentBaggage = currentBaggage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(Integer creditCard) {
        this.creditCard = creditCard;
    }

    public Integer getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(Integer bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public Boolean isOnBoard() {
        return onBoard;
    }

    public void setOnBoard(Boolean onBoard) {
        this.onBoard = onBoard;
    }

    public Boolean isUnderArrest() {
        return underArrest;
    }

    public Boolean takeUnderArrest() {
        return this.underArrest = true;
    }

    public Boolean breakFree() {
        return this.underArrest = false;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
