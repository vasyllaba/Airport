package com.solvd.airoport.entity.people;

import com.solvd.airoport.entity.enums.AccessLevel;
import com.solvd.airoport.entity.enums.Gender;
import com.solvd.airoport.entity.enums.PilotRank;
import com.solvd.airoport.entity.interfaces.IEmergencyLanding;
import com.solvd.airoport.entity.licenses.PilotLicense;
import com.solvd.airoport.entity.people.helper.WorkExperience;
import com.solvd.airoport.entity.planes.Plane;
import org.apache.log4j.Logger;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SeniorPilot extends Pilot implements IEmergencyLanding {

    private static final Logger LOGGER = Logger.getLogger(SeniorPilot.class);

    public SeniorPilot() {
        LOGGER.debug("create new SeniorPilot");
    }

    public SeniorPilot(String name, String surname, Gender gender, Integer age, String department, AccessLevel accessLevel, ArrayList<WorkExperience> workExperience, BigDecimal salary, PilotLicense license, PilotRank rank, List<String> foodAllergy, Boolean isMilitaryExperience, Integer flightHours) {
        super(name, surname, gender, age, department, accessLevel, workExperience, salary, license, rank, foodAllergy, isMilitaryExperience, flightHours);
        LOGGER.debug("create new SeniorPilot with params");
    }



    @Override
    public void emergencyLanding(Plane plane) {
        LOGGER.info("call emergencyLanding method with params plane " + plane);
        plane.fuelDrop();
        removeLandingGear(plane);
        heightReset(plane);
        plane.setEngine(false);

    }

    private void removeLandingGear(Plane plane) {
        LOGGER.info("call removeLandingGear method with params plane " + plane);
        if (plane.getChassis()) plane.setChassis(false);
    }

    private void heightReset(Plane plane){
        LOGGER.info("call heightReset method with params plane " + plane);
        while (plane.getFlightHeight() > 0) {
            if (plane.getFlightHeight() < 10) {
                plane.dropHeight(1);
            } else {
                plane.dropHeight(10);
            }
        }
    }
}
