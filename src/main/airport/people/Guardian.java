package main.airport.people;

import main.airport.enums.AccessLevel;
import main.airport.enums.Gender;
import main.airport.licenses.GuardLicense;

import java.time.LocalDate;

public class Guardian extends Worker {
    private Integer id;
    private String unit;
    private GuardLicense license;
    private String armament;

    public Guardian() {
    }

    public Guardian(String name, String surname, Gender gender, Integer age, String department,
                    LocalDate employmentDate, AccessLevel accessLevel, Integer id, String unit, GuardLicense license, String armament) {
        super(name, surname, gender, age, department, employmentDate, accessLevel);
        this.id = id;
        this.unit = unit;
        this.license = license;
        this.armament = armament;
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



    public String getArmament() {
        return armament;
    }

    public void setArmament(String armament) {
        this.armament = armament;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Guardian{" +
                "id=" + id +
                ", unit='" + unit + '\'' +
                ", license=" + license +
                ", armament='" + armament + '\'' +
                super.toString() + ' ' +
                '}';
    }
}
