package main.airport.enums;

public enum AccessLevel {
    A('A'),
    B('B'),
    C('C'),
    D('D'),
    E('E');

    private final Character accessLevel;

    AccessLevel(Character accessLevel) {
        this.accessLevel = accessLevel;
    }

    public Character getAccessLevel() {
        return accessLevel;
    }
}
