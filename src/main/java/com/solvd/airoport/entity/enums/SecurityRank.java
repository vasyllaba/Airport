package com.solvd.airoport.entity.enums;

public enum SecurityRank {
    OFFICER(1.1),
    SERGEANT(1.2),
    INSPECTOR(1.4),
    CHIEF(1.8);

    private final double salaryModifier;

    SecurityRank(double salaryModifier) {
        this.salaryModifier = salaryModifier;
    }

    public double getSalaryModifier() {
        return salaryModifier;
    }

}
