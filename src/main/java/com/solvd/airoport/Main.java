package com.solvd.airoport;

import com.solvd.airoport.entity.enums.SeatClass;
import com.solvd.airoport.entity.people.Passenger;
import com.solvd.airoport.entity.people.Pilot;
import com.solvd.airoport.entity.people.Steward;
import com.solvd.airoport.entity.people.helper.SearchBar;
import com.solvd.airoport.entity.planes.Trip;
import com.solvd.airoport.entity.planes.PassengerPlane;
import com.solvd.airoport.entity.planes.Seat;
import com.solvd.airoport.entity.planes.Ticket;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PassengerPlane plane = new PassengerPlane();
        plane.createSeats(2, SeatClass.First);
        plane.createSeats(6, SeatClass.Second);

        Pilot pilot1 = new Pilot();
        pilot1.setName("John");
        pilot1.setAge(18);
        pilot1.setFlightHours(10);
        pilot1.setFoodAllergy(List.of("Apples"));

        Pilot pilot2 = new Pilot();
        pilot2.setName("Kent");
        pilot2.setAge(22);
        pilot2.setFlightHours(100);
//        pilot2.setFoodAllergy(List.of("Potato"));

        Pilot pilot3 = new Pilot();
        pilot3.setName("Barby");
        pilot3.setAge(41);
        pilot3.setFlightHours(15);
        pilot3.setFoodAllergy(List.of("Chocolate"));

        Steward steward = new Steward();

        Trip par_kyi = new Trip();
        par_kyi.setPlane(plane);
        par_kyi.addPilot(pilot1);
        par_kyi.addPilot(pilot2);
        par_kyi.addPilot(pilot3);
        par_kyi.addSteward(steward);
        par_kyi.setFrom("Rome");
        par_kyi.setTo("Kyiv");
        par_kyi.setDepartureTime(LocalDateTime.now());


        Passenger passenger1 = new Passenger();
        passenger1.setName("Ivan");
        passenger1.setSurname("Tochinskyi");
        passenger1.setAge(18);

        Passenger passenger2 = new Passenger();
        passenger2.setName("Mykola");
        passenger2.setSurname("Tochinskyi");
        passenger2.setAge(10);

        Passenger passenger3 = new Passenger();
        passenger3.setName("Andrew");
        passenger3.setSurname("Nazarenko");
        passenger3.setAge(33);

        Seat seat = plane.getSeats().get(2);
        seat.setAvailable(false);

        Ticket ticket1 = new Ticket(par_kyi, passenger1, seat);
        Ticket ticket2 = new Ticket(par_kyi, passenger2, plane.getSeats().get(3));
        Ticket ticket3 = new Ticket(par_kyi, passenger3, plane.getSeats().get(4));
        ticket1.print();

        int experience = par_kyi.getPilots().stream()
                .filter(c -> c.getAge() > 18)
                .reduce(0, (integer, pilot) -> integer + pilot.getFlightHours(), Integer::sum);

        System.out.println(experience);

        //////////////////////////////

        System.out.println(par_kyi.getPilots());
        SearchBar sb = new SearchBar();
        System.out.println(sb.search((List) par_kyi.getPilots(), (p) -> {
            return p.getAge() >= 30;
        }));
        //////////////////////////////


    }
}
