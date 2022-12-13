package com.solvd.airoport.entity.people.helper;

import com.solvd.airoport.entity.planes.Ticket;

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

    public FlyingHistory() {
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Boolean getReservationCanceled() {
        return reservationCanceled;
    }

    public void setReservationCanceled(Boolean reservationCanceled) {
        this.reservationCanceled = reservationCanceled;
    }

    public Date getBuyingDate() {
        return buyingDate;
    }

    public void setBuyingDate(Date buyingDate) {
        this.buyingDate = buyingDate;
    }

    public Date getTicketReturnDate() {
        return ticketReturnDate;
    }

    public void setTicketReturnDate(Date ticketReturnDate) {
        this.ticketReturnDate = ticketReturnDate;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<BaggageHistory> getBaggageHistoryList() {
        return baggageHistoryList;
    }

    public void setBaggageHistoryList(List<BaggageHistory> baggageHistoryList) {
        this.baggageHistoryList = baggageHistoryList;
    }
}
