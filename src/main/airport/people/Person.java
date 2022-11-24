package main.airport.people;

import main.airport.enums.Gender;

public abstract class Person {
    private String fullName;
    private Gender gender;
    private Integer age;

    public Person(String fullName) {
        this.fullName = fullName;
    }
}
