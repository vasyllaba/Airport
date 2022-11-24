package main.airport;

import main.airport.planes.CargoPlane;
import main.airport.planes.Plane;

public class Main {
    public static void main(String[] args) {
        Plane cargo = new CargoPlane(100, 60, 120, 480, "Gas", 10, 10.0);
        System.out.println(cargo);
    }
}
