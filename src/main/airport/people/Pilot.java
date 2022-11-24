package main.airport.people;

import main.airport.licenses.PilotLicense;

public class Pilot extends Worker {
    private PilotLicense pilotLicense;

    public Pilot(String fullName, String department, PilotLicense pilotLicense) {
        super(fullName, department);
        this.pilotLicense = pilotLicense;
    }

}
