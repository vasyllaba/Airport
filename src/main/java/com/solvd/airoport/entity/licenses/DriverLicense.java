package com.solvd.airoport.entity.licenses;

import com.solvd.airoport.entity.enums.DriverCategory;

import java.time.LocalDateTime;
import java.util.List;

public class DriverLicense extends License {

    private String firstName;
    private String lastname;
    private List<DriverCategory> driverCategories;

    public DriverLicense() {
    }

    public DriverLicense(String passportCode, LocalDateTime issueDate, LocalDateTime endDate, String firstName,
                         String lastname, List<DriverCategory> driverCategories) {
        super(passportCode, issueDate, endDate);
        this.firstName = firstName;
        this.lastname = lastname;
        this.driverCategories = driverCategories;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<DriverCategory> getDriverCategories() {
        return driverCategories;
    }

    public void setDriverCategories(List<DriverCategory> driverCategories) {
        this.driverCategories = driverCategories;
    }

    @Override
    public String toString() {
        return "DriverLicense{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", driverCategories=" + driverCategories +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DriverLicense)) return false;

        DriverLicense that = (DriverLicense) o;

        if (getFirstName() != null ? !getFirstName().equals(that.getFirstName()) : that.getFirstName() != null)
            return false;
        if (getLastname() != null ? !getLastname().equals(that.getLastname()) : that.getLastname() != null)
            return false;
        return getDriverCategories() != null ? getDriverCategories().equals(that.getDriverCategories()) : that.getDriverCategories() == null;
    }

    @Override
    public int hashCode() {
        int result = getFirstName() != null ? getFirstName().hashCode() : 0;
        result = 31 * result + (getLastname() != null ? getLastname().hashCode() : 0);
        result = 31 * result + (getDriverCategories() != null ? getDriverCategories().hashCode() : 0);
        return result;
    }
}
