package com.solvd.airoport.entity.licenses;

import org.apache.log4j.Logger;

import java.time.LocalDateTime;

public abstract class License {
    private String passportCode;
    private LocalDateTime issueDate;
    private LocalDateTime endDate;

    private static final Logger LOGGER = Logger.getLogger(License.class);

    public License() {
        LOGGER.debug("create new License");
    }

    public License(String passportCode, LocalDateTime issueDate, LocalDateTime endDate) {
        LOGGER.debug("create new License with params: passportCode " + passportCode + ", issueDate" + issueDate +
                ", endDate " + endDate);
        this.passportCode = passportCode;
        this.issueDate = issueDate;
        this.endDate = endDate;
    }

    public String getPassportCode() {
        LOGGER.info("call getPassportCode() method, return value " + passportCode);
        return passportCode;
    }

    public void setPassportCode(String passportCode) {
        LOGGER.info("call setPassportCode() method, with value " + passportCode);
        this.passportCode = passportCode;
    }

    public LocalDateTime getIssueDate() {
        LOGGER.info("call getIssueDate() method, return value " + issueDate);
        return issueDate;
    }

    public void setIssueDate(LocalDateTime issueDate) {
        LOGGER.info("call setIssueDate() method, with value " + issueDate);
        this.issueDate = issueDate;
    }

    public LocalDateTime getEndDate() {
        LOGGER.info("call getEndDate() method, return value " + endDate);
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        LOGGER.info("call setEndDate() method, with value " + endDate);
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        LOGGER.info("call toString method");
        return "Passport code =" + passportCode +
                ", issueDate=" + issueDate +
                ", endDate=" + endDate + ' ';
    }
}
