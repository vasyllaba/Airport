package main.airport.people;

public abstract class Worker extends Person {
    private String department;

    public Worker(String fullName, String department) {
        super(fullName);
        this.department = department;
    }
}
