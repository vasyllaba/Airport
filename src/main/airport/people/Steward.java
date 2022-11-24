package main.airport.people;

import main.airport.licenses.StewardLicense;

public class Steward extends Worker {
    private StewardLicense license;

    public Steward(String fullName, String department, StewardLicense license) {
        super(fullName, department);
        this.license = license;
    }

    public StewardLicense getLicense() {
        return license;
    }

    public void setLicense(StewardLicense license) {
        this.license = license;
    }
}
