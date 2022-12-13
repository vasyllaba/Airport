package com.solvd.airoport.entity.licenses;

import com.solvd.airoport.entity.enums.DriverCategory;
import org.apache.log4j.Logger;

import java.time.LocalDateTime;
import java.util.List;

public class DriverLicense extends License {

    private String firstName;
    private String lastName;
    private List<DriverCategory> driverCategories;

    private static final Logger LOGGER = Logger.getLogger(DriverLicense.class);

    public DriverLicense() {
        LOGGER.debug("create new DriverLicense");
    }

    public DriverLicense(String passportCode, LocalDateTime issueDate, LocalDateTime endDate, String firstName,
                         String lastname, List<DriverCategory> driverCategories) {
        super(passportCode, issueDate, endDate);
        this.firstName = firstName;
        this.lastName = lastname;
        this.driverCategories = driverCategories;
        LOGGER.debug("create new DriverLicense with params " + toString());
    }

    public String getFirstName() {
        LOGGER.info("call getFirstName() method, return value " + firstName);
        return firstName;
    }

    public void setFirstName(String firstName) {
        LOGGER.info("call setFirstName() with value " + firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        LOGGER.info("call getLastname() method, return value " + lastName);
        return lastName;
    }

    public void setLastName(String lastName) {
        LOGGER.info("call setLastName() with value " + firstName);
        this.lastName = lastName;
    }

    public List<DriverCategory> getDriverCategories() {
        LOGGER.info("call getDriverCategories() method, return value " + driverCategories);
        return driverCategories;
    }

    public void setDriverCategories(List<DriverCategory> driverCategories) {
        LOGGER.info("call setDriverCategories() with value " + driverCategories);
        this.driverCategories = driverCategories;
    }

    @Override
    public String toString() {
        LOGGER.info("call toString method");
        return "DriverLicense{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastName + '\'' +
                ", driverCategories=" + driverCategories +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        LOGGER.info("call equals method");
        if (this == o) return true;
        if (!(o instanceof DriverLicense)) return false;

        DriverLicense that = (DriverLicense) o;

        if (getFirstName() != null ? !getFirstName().equals(that.getFirstName()) : that.getFirstName() != null)
            return false;
        if (getLastName() != null ? !getLastName().equals(that.getLastName()) : that.getLastName() != null)
            return false;
        return getDriverCategories() != null ? getDriverCategories().equals(that.getDriverCategories()) : that.getDriverCategories() == null;
    }

    @Override
    public int hashCode() {
        LOGGER.info("call hashCode method");
        int result = getFirstName() != null ? getFirstName().hashCode() : 0;
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        result = 31 * result + (getDriverCategories() != null ? getDriverCategories().hashCode() : 0);
        return result;
    }
}
