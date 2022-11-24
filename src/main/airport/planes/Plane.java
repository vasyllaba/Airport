package main.airport.planes;

public abstract class Plane {
    private Integer weight;
    private Integer width;
    private Integer length;
    private Integer speed;
    private String fuelType;

    public Plane(Integer weight, Integer width, Integer length, Integer speed, String fuelType) {
        this.weight = weight;
        this.width = width;
        this.length = length;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Plane:" +
                "weight=" + weight +
                ", width=" + width +
                ", length=" + length +
                ", speed=" + speed +
                ", fuelType=" + fuelType +
                ' ';
    }
}
