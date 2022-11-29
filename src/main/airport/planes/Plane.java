package main.airport.planes;

import java.util.Objects;

public abstract class Plane {
    private Integer weight;
    private Integer width;
    private Integer length;
    private Integer speed;
    private String fuelType;

    public Plane() {
    }

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
        return "weight=" + weight +
                ", width=" + width +
                ", length=" + length +
                ", speed=" + speed +
                ", fuelType=" + fuelType +
                ' ';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;

        Plane plane = (Plane) o;

        if (!Objects.equals(weight, plane.weight)) return false;
        if (!Objects.equals(width, plane.width)) return false;
        if (!Objects.equals(length, plane.length)) return false;
        if (!Objects.equals(speed, plane.speed)) return false;
        return Objects.equals(fuelType, plane.fuelType);
    }

    @Override
    public int hashCode() {
        int result = weight != null ? weight.hashCode() : 0;
        result = 31 * result + (width != null ? width.hashCode() : 0);
        result = 31 * result + (length != null ? length.hashCode() : 0);
        result = 31 * result + (speed != null ? speed.hashCode() : 0);
        result = 31 * result + (fuelType != null ? fuelType.hashCode() : 0);
        return result;
    }
}
