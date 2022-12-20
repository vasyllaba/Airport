package com.solvd.airoport.entity.people;

import com.solvd.airoport.entity.enums.Gender;
import com.solvd.airoport.entity.people.helper.Baggage;
import com.solvd.airoport.entity.people.helper.FlyingHistory;
import com.solvd.airoport.entity.planes.Ticket;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Objects;

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

    private static final Logger LOGGER = Logger.getLogger(Passenger.class);

    public Passenger() {
        LOGGER.debug("create new Passenger");
        this.underArrest = false;
    }

    public Passenger(String name, String surname, Gender gender, Integer age, String passportData,
                     Baggage currentBaggage, String description, Integer creditCard) {
        super(name, surname, gender, age);
        LOGGER.debug("create new Passenger with params: passportData " + passportData + ", currentBaggage" +
                currentBaggage + ", description" + description + ", creditCard" + creditCard + ", underArrest" +
                underArrest);
        this.passportData = passportData;
        this.currentBaggage = currentBaggage;
        this.description = description;
        this.creditCard = creditCard;
        this.underArrest = false;
    }

    public String getPassportData() {
        LOGGER.info("call getPassportData()");
        return passportData;
    }

    public void setPassportData(String passportData) {
        LOGGER.info("call setPassportData() with value " + passportData);
        this.passportData = passportData;
    }

    public List<FlyingHistory> getFlyingHistory() {
        LOGGER.info("call getFlyingHistory()");
        return flyingHistory;
    }

    public void setFlyingHistory(List<FlyingHistory> flyingHistory) {
        LOGGER.info("call setFlyingHistory() with value " + flyingHistory);
        this.flyingHistory = flyingHistory;
    }

    public Baggage getCurrentBaggage() {
        LOGGER.info("call getCurrentBaggage()");
        return currentBaggage;
    }

    public void setCurrentBaggage(Baggage currentBaggage) {
        LOGGER.info("call setCurrentBaggage() with value " + currentBaggage);
        this.currentBaggage = currentBaggage;
    }

    public String getDescription() {
        LOGGER.info("call getDescription()");
        return description;
    }

    public void setDescription(String description) {
        LOGGER.info("call setDescription() with value " + description);
        this.description = description;
    }

    public Integer getCreditCard() {
        LOGGER.info("call getCreditCard()");
        return creditCard;
    }

    public void setCreditCard(Integer creditCard) {
        LOGGER.info("call setCreditCard() with value " + creditCard);
        this.creditCard = creditCard;
    }

    public Integer getBonusPoint() {
        LOGGER.info("call getBonusPoint()");
        return bonusPoint;
    }

    public void setBonusPoint(Integer bonusPoint) {
        LOGGER.info("call setBonusPoint() with value " + bonusPoint);
        this.bonusPoint = bonusPoint;
    }

    public Boolean isOnBoard() {
        LOGGER.info("call isOnBoard()");
        return onBoard;
    }

    public void setOnBoard(Boolean onBoard) {
        LOGGER.info("call setOnBoard() with value " + onBoard);
        this.onBoard = onBoard;
    }

    public Boolean isUnderArrest() {
        LOGGER.info("call isUnderArrest()");
        return underArrest;
    }

    public Boolean takeUnderArrest() {
        LOGGER.info("call takeUnderArrest()");
        return this.underArrest = true;
    }

    public Boolean breakFree() {
        LOGGER.info("call breakFree()");
        return this.underArrest = false;
    }

    public Ticket getTicket() {
        LOGGER.info("call getTicket()");
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        LOGGER.info("call setTicket() with value " + ticket);
        this.ticket = ticket;
    }

    @Override
    public boolean equals(Object o) {
        LOGGER.info("call equals()");
        if (this == o) return true;
        if (!(o instanceof Passenger)) return false;

        Passenger passenger = (Passenger) o;

        if (getPassportData() != null ? !getPassportData().equals(passenger.getPassportData()) : passenger.getPassportData() != null)
            return false;
        if (getTicket() != null ? !getTicket().equals(passenger.getTicket()) : passenger.getTicket() != null)
            return false;
        if (getFlyingHistory() != null ? !getFlyingHistory().equals(passenger.getFlyingHistory()) : passenger.getFlyingHistory() != null)
            return false;
        if (getCurrentBaggage() != null ? !getCurrentBaggage().equals(passenger.getCurrentBaggage()) : passenger.getCurrentBaggage() != null)
            return false;
        if (getDescription() != null ? !getDescription().equals(passenger.getDescription()) : passenger.getDescription() != null)
            return false;
        if (getCreditCard() != null ? !getCreditCard().equals(passenger.getCreditCard()) : passenger.getCreditCard() != null)
            return false;
        if (getBonusPoint() != null ? !getBonusPoint().equals(passenger.getBonusPoint()) : passenger.getBonusPoint() != null)
            return false;
        if (!Objects.equals(onBoard, passenger.onBoard)) return false;
        return Objects.equals(underArrest, passenger.underArrest);
    }

    @Override
    public int hashCode() {
        LOGGER.info("call hashCode()");
        int result = getPassportData() != null ? getPassportData().hashCode() : 0;
        result = 31 * result + (getTicket() != null ? getTicket().hashCode() : 0);
        result = 31 * result + (getFlyingHistory() != null ? getFlyingHistory().hashCode() : 0);
        result = 31 * result + (getCurrentBaggage() != null ? getCurrentBaggage().hashCode() : 0);
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + (getCreditCard() != null ? getCreditCard().hashCode() : 0);
        result = 31 * result + (getBonusPoint() != null ? getBonusPoint().hashCode() : 0);
        result = 31 * result + (onBoard != null ? onBoard.hashCode() : 0);
        result = 31 * result + (underArrest != null ? underArrest.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        LOGGER.info("call toString()");
        return "Passenger{" +
                "passportData='" + passportData + '\'' +
                ", ticket=" + ticket +
                ", flyingHistory=" + flyingHistory +
                ", currentBaggage=" + currentBaggage +
                ", description='" + description + '\'' +
                ", creditCard=" + creditCard +
                ", bonusPoint=" + bonusPoint +
                ", onBoard=" + onBoard +
                ", underArrest=" + underArrest +
                "} " + super.toString();
    }
}
