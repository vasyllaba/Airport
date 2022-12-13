package com.solvd.airoport.entity.licenses;

import java.time.LocalDateTime;
import java.util.Objects;

public class WeaponLicense extends License {

    private String weaponName;

    public WeaponLicense() {
    }

    public WeaponLicense(String passportCode, LocalDateTime issueDate, LocalDateTime endDate, String weaponName) {
        super(passportCode, issueDate, endDate);
        this.weaponName = weaponName;
    }

    public String getRank() {
        return weaponName;
    }

    public void setRank(String weaponName) {
        this.weaponName = weaponName;
    }

    @Override
    public String toString() {
        return "GuardLicense{" +
                 super.toString() +
                "weaponName= " + weaponName + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WeaponLicense)) return false;

        WeaponLicense that = (WeaponLicense) o;

        return Objects.equals(weaponName, that.weaponName);
    }

    @Override
    public int hashCode() {
        return weaponName != null ? weaponName.hashCode() : 0;
    }
}
