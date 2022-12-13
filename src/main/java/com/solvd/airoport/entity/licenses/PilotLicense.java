package com.solvd.airoport.entity.licenses;

import org.apache.log4j.Logger;

import java.time.LocalDateTime;
import java.util.List;

public class PilotLicense extends License {

    private List<String> planeTypes;
    private Integer flightHours;
    private String countryOfIssue;

    private static final Logger LOGGER = Logger.getLogger(PilotLicense.class);


    public PilotLicense() {
        LOGGER.debug("create new PilotLicense");
    }

    public PilotLicense(String passportCode, LocalDateTime issueDate, LocalDateTime endDate, List<String> planeTypes,
                        Integer flightHours, String countryOfIssue) {
        super(passportCode, issueDate, endDate);
        LOGGER.debug("create new PilotLicense with params: passportCode " + passportCode + ", issueDate " + issueDate +
                ", endDate " + endDate + ", planeTypes " + planeTypes + ", flightHours " + flightHours +
                ", countryOfIssue " + countryOfIssue);
        this.planeTypes = planeTypes;
        this.flightHours = flightHours;
        this.countryOfIssue = countryOfIssue;
    }

    public List<String> getPlaneType() {
        LOGGER.info("call getPlaneType(), return value " + planeTypes);
        return planeTypes;
    }

    public void setPlaneType(List<String> planeTypes) {
        LOGGER.info("call setPlaneType() with value " + planeTypes);
        this.planeTypes = planeTypes;
    }

    public Integer getFlightHours() {
        LOGGER.info("call getFlightHours(), return value " + flightHours);
        return flightHours;
    }

    public void setFlightHours(Integer flightHours) {
        LOGGER.info("call setFlightHours() with value " + flightHours);
        this.flightHours = flightHours;
    }

    public String getCountryOfIssue() {
        LOGGER.info("call setFirstName(), return value " + countryOfIssue);
        return countryOfIssue;
    }

    public void setCountryOfIssue(String countryOfIssue) {
        LOGGER.info("call setCountryOfIssue() with value " + countryOfIssue);
        this.countryOfIssue = countryOfIssue;
    }

    @Override
    public String toString() {
        LOGGER.info("call toString method");
        return "PilotLicense{" +
                " countryOfIssue = " + countryOfIssue +
                ", planeTypes='" + planeTypes + '\'' +
                ", flightHours=" + flightHours +
                super.toString() +
                '\n';
    }

    @Override
    public boolean equals(Object o) {
        LOGGER.info("call equals method");
        if (this == o) return true;
        if (!(o instanceof PilotLicense)) return false;

        PilotLicense that = (PilotLicense) o;

        if (getPlaneType() != null ? !getPlaneType().equals(that.getPlaneType()) : that.getPlaneType() != null)
            return false;
        if (getFlightHours() != null ? !getFlightHours().equals(that.getFlightHours()) : that.getFlightHours() != null)
            return false;
        return getCountryOfIssue() != null ? getCountryOfIssue().equals(that.getCountryOfIssue()) : that.getCountryOfIssue() == null;
    }

    @Override
    public int hashCode() {
        LOGGER.info("call hashCode method");
        int result = getPlaneType() != null ? getPlaneType().hashCode() : 0;
        result = 31 * result + (getFlightHours() != null ? getFlightHours().hashCode() : 0);
        result = 31 * result + (getCountryOfIssue() != null ? getCountryOfIssue().hashCode() : 0);
        return result;
    }
}
