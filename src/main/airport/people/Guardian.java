package main.airport.people;

import main.airport.licenses.GuardLicense;

public class Guardian extends Worker {
    private String unit;
    private GuardLicense license;

    public Guardian(String fullName, String department, String unit, GuardLicense license) {
        super(fullName, department);
        this.unit = unit;
        this.license = license;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public GuardLicense getLicense() {
        return license;
    }

    public void setLicense(GuardLicense license) {
        this.license = license;
    }
}
