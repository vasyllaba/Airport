package main.airport.people;

import main.airport.enums.AccessLevel;
import main.airport.enums.Gender;
import main.airport.licenses.StewardLicense;

import java.time.LocalDate;
import java.util.List;

public class Steward extends Worker {

    private StewardLicense license;
    private List<String> languages;

    public Steward() {
    }

    public Steward(String name, String surname, Gender gender, Integer age, String department, LocalDate employmentDate,
                   AccessLevel accessLevel, StewardLicense license, List<String> languages) {
        super(name, surname, gender, age, department, employmentDate, accessLevel);
        this.license = license;
        this.languages = languages;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public StewardLicense getLicense() {
        return license;
    }

    public void setLicense(StewardLicense license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "Steward{" +
                "license=" + license +
                ", languages=" + languages +
                super.toString() +
                '}';
    }

}
