package com.solvd.airoport.entity.licenses;

import java.time.LocalDateTime;
import java.util.List;

public class PilotLicense extends License {

    private List<String> planeTypes;
    private Integer flightHours;
    private String countryOfIssue;

    public PilotLicense() {
    }

    public PilotLicense(String passportCode, LocalDateTime issueDate, LocalDateTime endDate, List<String> planeTypes,
                        Integer flightHours, String countryOfIssue) {
        super(passportCode, issueDate, endDate);
        this.planeTypes = planeTypes;
        this.flightHours = flightHours;
        this.countryOfIssue = countryOfIssue;
    }

    public List<String> getPlaneType() {
        return planeTypes;
    }

    public void setPlaneType(List<String> planeTypes) {
        this.planeTypes = planeTypes;
    }

    public Integer getFlightHours() {
        return flightHours;
    }

    public void setFlightHours(Integer flightHours) {
        this.flightHours = flightHours;
    }

    public String getCountryOfIssue() {
        return countryOfIssue;
    }

    public void setCountryOfIssue(String countryOfIssue) {
        this.countryOfIssue = countryOfIssue;
    }

    @Override
    public String toString() {
        return "PilotLicense{" +
                " countryOfIssue = " + countryOfIssue +
                ", planeTypes='" + planeTypes + '\'' +
                ", flightHours=" + flightHours +
                super.toString() +
                '\n';
    }

    @Override
    public boolean equals(Object o) {
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
        int result = getPlaneType() != null ? getPlaneType().hashCode() : 0;
        result = 31 * result + (getFlightHours() != null ? getFlightHours().hashCode() : 0);
        result = 31 * result + (getCountryOfIssue() != null ? getCountryOfIssue().hashCode() : 0);
        return result;
    }
}
