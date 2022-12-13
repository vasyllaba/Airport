package com.solvd.airoport.entity.licenses;

import org.apache.log4j.Logger;

import java.time.LocalDateTime;
import java.util.Objects;

public class WeaponLicense extends License {

    private String weaponName;

    private static final Logger LOGGER = Logger.getLogger(WeaponLicense.class);


    public WeaponLicense() {
        LOGGER.debug("create new WeaponLicense");
    }

    public WeaponLicense(String passportCode, LocalDateTime issueDate, LocalDateTime endDate, String weaponName) {
        super(passportCode, issueDate, endDate);
        this.weaponName = weaponName;
        LOGGER.debug("create new DriverLicense with params: weaponsName " + weaponName);
    }

    public String getWeaponName() {
        LOGGER.info("call getWeaponName() method, return value " + weaponName);
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        LOGGER.info("call setWeaponName() with value " + weaponName);
        this.weaponName = weaponName;
    }

    @Override
    public String toString() {
        LOGGER.info("call toString method");
        return "GuardLicense{" +
                 super.toString() +
                "weaponName= " + weaponName + '\n';
    }

    @Override
    public boolean equals(Object o) {
        LOGGER.info("call equals method");
        if (this == o) return true;
        if (!(o instanceof WeaponLicense)) return false;

        WeaponLicense that = (WeaponLicense) o;

        return Objects.equals(weaponName, that.weaponName);
    }

    @Override
    public int hashCode() {
        LOGGER.info("call hashCode method");
        return weaponName != null ? weaponName.hashCode() : 0;
    }
}
