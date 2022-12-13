package com.solvd.airoport.entity.people;

import com.solvd.airoport.entity.enums.Gender;
import org.apache.log4j.Logger;

public abstract class Person {

    private String name;
    private String surname;
    private Gender gender;
    private Integer age;

    private static final Logger LOGGER = Logger.getLogger(Person.class);

    public Person() {
        LOGGER.debug("create new Person");
    }

    public Person(String name, String surname, Gender gender, Integer age) {
        LOGGER.debug("create new Person with params: name " + name + ", surname" +
                surname + ", gender" + gender + ", age" + age);
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        LOGGER.info("call getName()");
        return name;
    }

    public void setName(String name) {
        LOGGER.info("call setName() with value " + name);
        this.name = name;
    }

    public String getSurname() {
        LOGGER.info("call getSurname()");
        return surname;
    }

    public void setSurname(String surname) {
        LOGGER.info("call setSurname() with value " + surname);
        this.surname = surname;
    }

    public String getGender() {
        LOGGER.info("call getGender()");
        return gender.getValue();
    }

    public void setGender(Gender gender) {
        LOGGER.info("call setGender() with value " + gender);
        this.gender = gender;
    }

    public Integer getAge() {
        LOGGER.info("call getAge()");
        return age;
    }

    public void setAge(Integer age) {
        LOGGER.info("call setAge() with value " + age);
        this.age = age;
    }

    @Override
    public String toString() {
        LOGGER.info("call toString()");
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
