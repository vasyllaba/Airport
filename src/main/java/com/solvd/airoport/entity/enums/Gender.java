package com.solvd.airoport.entity.enums;

public enum Gender {

    MALE("male"),
    FEMALE("female"),
    OTHER("other");

    Gender(String gender) {
        this.gender = gender;
    }

    public final String gender;

    public String getValue() {
        return gender;
    }
}
