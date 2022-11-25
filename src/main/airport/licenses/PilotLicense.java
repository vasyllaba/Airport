package main.airport.licenses;

import java.time.LocalDateTime;
import java.util.List;

public class PilotLicense extends License {

    private List<String> planeType;
    private Integer flightHours;
    private String countryOfIssue;

    public PilotLicense() {
    }

    public PilotLicense(String passportCode, LocalDateTime issueDate, LocalDateTime endDate, List<String> planeType,
                        Integer flightHours, String countryOfIssue) {
        super(passportCode, issueDate, endDate);
        this.planeType = planeType;
        this.flightHours = flightHours;
        this.countryOfIssue = countryOfIssue;
    }

    public List<String> getPlaneType() {
        return planeType;
    }

    public void setPlaneType(List<String> planeType) {
        this.planeType = planeType;
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
                ", planeType='" + planeType + '\'' +
                ", flightHours=" + flightHours +
                super.toString() +
                '\n';
    }
}
