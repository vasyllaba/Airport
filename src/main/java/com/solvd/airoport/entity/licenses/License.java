package com.solvd.airoport.entity.licenses;

import java.time.LocalDateTime;

public abstract class License {
    private String passportCode;
    private LocalDateTime issueDate;
    private LocalDateTime endDate;

    public License() {
    }

    public License(String passportCode, LocalDateTime issueDate, LocalDateTime endDate) {
        this.passportCode = passportCode;
        this.issueDate = issueDate;
        this.endDate = endDate;
    }

    public String getPassportCode() {
        return passportCode;
    }

    public void setPassportCode(String passportCode) {
        this.passportCode = passportCode;
    }

    public LocalDateTime getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDateTime issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Passport code =" + passportCode +
                ", issueDate=" + issueDate +
                ", endDate=" + endDate + ' ';
    }
}
