package main.airport.licenses;

import java.time.LocalDateTime;

public class GuardLicense extends License {

    private String rank;

    public GuardLicense() {
    }

    public GuardLicense(String passportCode, LocalDateTime issueDate, LocalDateTime endDate, String rank) {
        super(passportCode, issueDate, endDate);
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "GuardLicense{" +
                 super.toString() +
                "rank= " + rank + '\n';
    }
}
