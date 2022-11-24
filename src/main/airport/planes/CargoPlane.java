package main.airport.planes;

public class CargoPlane extends Plane {

    private Integer capacity;
    private Double volume;

    public CargoPlane(Integer weight, Integer width, Integer length, Integer speed, String fuelType, Integer capacity
            , Double volume) {
        super(weight, width, length, speed, fuelType);
        this.capacity = capacity;
        this.volume = volume;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() +
                " capacity=" + capacity +
                ", volume=" + volume +
                '}';
    }
}
