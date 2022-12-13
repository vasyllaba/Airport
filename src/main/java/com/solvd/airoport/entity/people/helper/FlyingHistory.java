package com.solvd.airoport.entity.people.helper;

import com.solvd.airoport.entity.planes.Ticket;
import org.apache.log4j.Logger;

import java.util.Date;
import java.util.List;

public class FlyingHistory {
    private Ticket ticket;
    private Date reservationDate;
    private Boolean reservationCanceled;
    private Date buyingDate;
    private Date ticketReturnDate;
    private Boolean success;
    private List<BaggageHistory> baggageHistoryList;

    private static final Logger LOGGER = Logger.getLogger(FlyingHistory.class);

    public FlyingHistory() {
        LOGGER.debug("create new FlyingHistory");
    }

    public Ticket getTicket() {
        LOGGER.info("call getTicket()");
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        LOGGER.info("call setTicket()");
        this.ticket = ticket;
    }

    public Date getReservationDate() {
        LOGGER.info("call getReservationDate()");
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        LOGGER.info("call setReservationDate()");
        this.reservationDate = reservationDate;
    }

    public Boolean getReservationCanceled() {
        LOGGER.info("call getReservationCanceled()");
        return reservationCanceled;
    }

    public void setReservationCanceled(Boolean reservationCanceled) {
        LOGGER.info("call setReservationCanceled()");
        this.reservationCanceled = reservationCanceled;
    }

    public Date getBuyingDate() {
        LOGGER.info("call getBuyingDate()");
        return buyingDate;
    }

    public void setBuyingDate(Date buyingDate) {
        LOGGER.info("call setBuyingDate()");
        this.buyingDate = buyingDate;
    }

    public Date getTicketReturnDate() {
        LOGGER.info("call getTicketReturnDate()");
        return ticketReturnDate;
    }

    public void setTicketReturnDate(Date ticketReturnDate) {
        LOGGER.info("call setTicketReturnDate()");
        this.ticketReturnDate = ticketReturnDate;
    }

    public Boolean getSuccess() {
        LOGGER.info("call getSuccess()");
        return success;
    }

    public void setSuccess(Boolean success) {
        LOGGER.info("call setSuccess()");
        this.success = success;
    }

    public List<BaggageHistory> getBaggageHistoryList() {
        LOGGER.info("call getBaggageHistoryList()");
        return baggageHistoryList;
    }

    public void setBaggageHistoryList(List<BaggageHistory> baggageHistoryList) {
        LOGGER.info("call setBaggageHistoryList()");
        this.baggageHistoryList = baggageHistoryList;
    }

    @Override
    public String toString() {
        LOGGER.info("call toString()");
        return "FlyingHistory{" +
                "ticket=" + ticket +
                ", reservationDate=" + reservationDate +
                ", reservationCanceled=" + reservationCanceled +
                ", buyingDate=" + buyingDate +
                ", ticketReturnDate=" + ticketReturnDate +
                ", success=" + success +
                ", baggageHistoryList=" + baggageHistoryList +
                '}';
    }
}
