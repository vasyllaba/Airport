package com.solvd.airoport.entity.enums;

public enum Languages {
    ENGLISH(1.1),
    FRENCH(1.1),
    POLISH(1.2),
    UKRAINIAN(1.4),
    ROMANIAN(1.4),
    ITALIAN(1.2),
    CHINESE(1.3),
    JAPAN(1.2),
    TURKEY(1.4),
    SPAIN(1.2);

    private final double salaryModifier;

    Languages(double salaryModifier) {
        this.salaryModifier = salaryModifier;
    }

    public double getSalaryModifier() {
        return salaryModifier;
    }
}
