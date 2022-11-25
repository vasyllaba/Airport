package main.airport.planes;

public class CargoPlane extends Plane {

    private Integer capacity;
    private Double volume;
    private Boolean isParatroopersAbility;
    private Double trunkHeight;
    private Double trunkWidth;
    private Double trunkLength;

    public CargoPlane() {
    }

    public CargoPlane(Integer weight, Integer width, Integer length, Integer speed, String fuelType, Integer capacity,
                      Double volume, Boolean isParatroopersAbility, Double trunkHeight, Double trunkWidth,
                      Double trunkLength) {
        super(weight, width, length, speed, fuelType);
        this.capacity = capacity;
        this.volume = volume;
        this.isParatroopersAbility = isParatroopersAbility;
        this.trunkHeight = trunkHeight;
        this.trunkWidth = trunkWidth;
        this.trunkLength = trunkLength;
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

    public Boolean getParatroopersAbility() {
        return isParatroopersAbility;
    }

    public void setParatroopersAbility(Boolean paratroopersAbility) {
        isParatroopersAbility = paratroopersAbility;
    }

    public Double getTrunkHeight() {
        return trunkHeight;
    }

    public void setTrunkHeight(Double trunkHeight) {
        this.trunkHeight = trunkHeight;
    }

    public Double getTrunkWidth() {
        return trunkWidth;
    }

    public void setTrunkWidth(Double trunkWidth) {
        this.trunkWidth = trunkWidth;
    }

    public Double getTrunkLength() {
        return trunkLength;
    }

    public void setTrunkLength(Double trunkLength) {
        this.trunkLength = trunkLength;
    }

    @Override
    public String toString() {
        return "CargoPlane{" +
                "capacity=" + capacity +
                ", volume=" + volume +
                ", isParatroopersAbility=" + isParatroopersAbility +
                ", trunkHeight=" + trunkHeight +
                ", trunkWidth=" + trunkWidth +
                ", trunkLength=" + trunkLength +
                ' ' + super.toString() +
                '}';
    }

}
