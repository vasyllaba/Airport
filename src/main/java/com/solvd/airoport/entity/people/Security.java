package com.solvd.airoport.entity.people;

import com.solvd.airoport.entity.enums.AccessLevel;
import com.solvd.airoport.entity.enums.Gender;
import com.solvd.airoport.entity.enums.SecurityRank;
import com.solvd.airoport.entity.licenses.WeaponLicense;
import com.solvd.airoport.entity.people.helper.WorkExperience;
import com.solvd.airoport.entity.people.helper.FlyingHistory;
import org.apache.log4j.Logger;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Security extends Employee {
    private String unit;
    private SecurityRank rank;
    private Boolean armed;
    private WeaponLicense license;
    private String armament;

    private static final Logger LOGGER = Logger.getLogger(Pilot.class);

    public Security() {
        LOGGER.debug("create new Security");
    }

    public Security(String name, String surname, Gender gender, Integer age, String department, AccessLevel accessLevel,
                    ArrayList<WorkExperience> workExperience, BigDecimal salary, String unit, SecurityRank rank,
                    Boolean armed, WeaponLicense license, String armament) {
        super(name, surname, gender, age, department, accessLevel, workExperience, salary);
        LOGGER.debug("create new Security with params: unit " + unit + ", rank" +
                rank + ", armed" + armed + ", license" + license +
                ", armament" + armament);
        this.unit = unit;
        this.rank = rank;
        this.armed = armed;
        this.license = license;
        this.armament = armament;
    }

    /**
     * Scan if passenger's ticket is overdue
     * @param passenger
     * @return
     */
    public Boolean scanPassenger(Passenger passenger) {
        LOGGER.info("call scanPassenger");
        LOGGER.warn("getFlyingHistory from person");
        ArrayList<FlyingHistory> tickets = (ArrayList<FlyingHistory>) passenger.getFlyingHistory();
        LOGGER.debug("scan all tickets");
        for (FlyingHistory ticket: tickets) {
            if (ticket.getTicket().getTrip().getDepartureTime().isAfter(LocalDateTime.now())) {
                return true;
            }
        }
        return false;
    }

    public Boolean arrestPerson(Passenger passenger) {
        LOGGER.info("call arrestPerson");
        return passenger.takeUnderArrest();
    }

    public String getUnit() {
        LOGGER.info("call getUnit");
        return unit;
    }

    public void setUnit(String unit) {
        LOGGER.info("call setUnit with value " + unit);
        this.unit = unit;
    }

    public SecurityRank getRank() {
        LOGGER.info("call getRank");
        return rank;
    }

    public void setRank(SecurityRank rank) {
        LOGGER.info("call setRank with value " + rank);
        this.rank = rank;
    }

    public Boolean getArmed() {
        LOGGER.info("call getArmed");
        return armed;
    }

    public void setArmed(Boolean armed) {
        LOGGER.info("call setArmed with value " + armed);
        this.armed = armed;
    }

    public WeaponLicense getLicense() {
        LOGGER.info("call getLicense");
        return license;
    }

    public void setLicense(WeaponLicense license) {
        LOGGER.info("call setLicense with value " + license);
        this.license = license;
    }

    public String getArmament() {
        LOGGER.info("call getArmament");
        return armament;
    }

    public void setArmament(String armament) {
        LOGGER.info("call setArmament with value " + armament);
        this.armament = armament;
    }

    @Override
    public boolean equals(Object o) {
        LOGGER.info("call equals()");
        if (this == o) return true;
        if (!(o instanceof Security)) return false;

        Security security = (Security) o;

        if (getUnit() != null ? !getUnit().equals(security.getUnit()) : security.getUnit() != null) return false;
        if (getRank() != security.getRank()) return false;
        if (getArmed() != null ? !getArmed().equals(security.getArmed()) : security.getArmed() != null) return false;
        if (getLicense() != null ? !getLicense().equals(security.getLicense()) : security.getLicense() != null)
            return false;
        return getArmament() != null ? getArmament().equals(security.getArmament()) : security.getArmament() == null;
    }

    @Override
    public int hashCode() {
        LOGGER.info("call hashCode()");
        int result = getUnit() != null ? getUnit().hashCode() : 0;
        result = 31 * result + (getRank() != null ? getRank().hashCode() : 0);
        result = 31 * result + (getArmed() != null ? getArmed().hashCode() : 0);
        result = 31 * result + (getLicense() != null ? getLicense().hashCode() : 0);
        result = 31 * result + (getArmament() != null ? getArmament().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        LOGGER.info("call toString()");
        return "Security{" +
                "unit='" + unit + '\'' +
                ", rank=" + rank +
                ", armed=" + armed +
                ", license=" + license +
                ", armament='" + armament + '\'' +
                "} " + super.toString();
    }
}
