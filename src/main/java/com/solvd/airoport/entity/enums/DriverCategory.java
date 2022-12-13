package com.solvd.airoport.entity.enums;

public enum DriverCategory {
    A("A"),
    B("B"),
    C("C"),
    D("D"),
    BE("BE"),
    CE("CE"),
    DE("DE"),
    L("L"),
    T("T");

    private final String category;

    DriverCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
