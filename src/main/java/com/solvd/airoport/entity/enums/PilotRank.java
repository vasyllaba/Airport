package com.solvd.airoport.entity.enums;

public enum PilotRank {
    CAPITAN("Capitan"),
    FIRST_OFFICER("First officer"),
    SECOND_OFFICER("Second officer");

    private final String rank;

    PilotRank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}
