package com.solvd.airoport.entity.planes;

public abstract class Plane {
    private Integer weight;
    private Integer width;
    private Integer length;
    private Integer speed;
    private String fuelType;
    private Double fuelAmount;
    private Double fuelTankSize;
    private Double fuelUsagePerHour;
    private Boolean chassis;
    private Integer flightHeight;
    private Boolean engine;

    public Plane() {
        this.chassis = true;
        this.flightHeight = 0;
        this.engine = false;
    }

    public Plane(Integer weight, Integer width, Integer length, Integer speed, String fuelType, Double fuelAmount,
                 Double fuelTankSize, Double fuelUsagePerHour) {
        this.weight = weight;
        this.width = width;
        this.length = length;
        this.speed = speed;
        this.fuelType = fuelType;
        this.fuelAmount = fuelAmount;
        this.fuelTankSize = fuelTankSize;
        this.fuelUsagePerHour = fuelUsagePerHour;
        this.chassis = true;
        this.flightHeight = 0;
        this.engine = false;
    }


    /**
     * Drop all fuel
     */
    public void fuelDrop(){
        fuelAmount = 0.0;
    }

    public int restHeight(int meters){
        return flightHeight-=meters;
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

    public Double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(Double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public Double getFuelTankSize() {
        return fuelTankSize;
    }

    public void setFuelTankSize(Double fuelTankSize) {
        this.fuelTankSize = fuelTankSize;
    }

    public Double getFuelUsagePerHour() {
        return fuelUsagePerHour;
    }

    public void setFuelUsagePerHour(Double fuelUsagePerHour) {
        this.fuelUsagePerHour = fuelUsagePerHour;
    }

    public Boolean getChassis() {
        return chassis;
    }

    public void setChassis(Boolean chassis) {
        this.chassis = chassis;
    }

    public Integer getFlightHeight() {
        return flightHeight;
    }

    public void setFlightHeight(Integer flightHeight) {
        this.flightHeight = flightHeight;
    }

    public Boolean getEngine() {
        return engine;
    }

    public void setEngine(Boolean engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;

        Plane plane = (Plane) o;

        if (getWeight() != null ? !getWeight().equals(plane.getWeight()) : plane.getWeight() != null) return false;
        if (getWidth() != null ? !getWidth().equals(plane.getWidth()) : plane.getWidth() != null) return false;
        if (getLength() != null ? !getLength().equals(plane.getLength()) : plane.getLength() != null) return false;
        if (getSpeed() != null ? !getSpeed().equals(plane.getSpeed()) : plane.getSpeed() != null) return false;
        if (getFuelType() != null ? !getFuelType().equals(plane.getFuelType()) : plane.getFuelType() != null)
            return false;
        if (getFuelAmount() != null ? !getFuelAmount().equals(plane.getFuelAmount()) : plane.getFuelAmount() != null)
            return false;
        if (getFuelTankSize() != null ? !getFuelTankSize().equals(plane.getFuelTankSize()) : plane.getFuelTankSize() != null)
            return false;
        return getFuelUsagePerHour() != null ? getFuelUsagePerHour().equals(plane.getFuelUsagePerHour()) : plane.getFuelUsagePerHour() == null;
    }

    @Override
    public int hashCode() {
        int result = getWeight() != null ? getWeight().hashCode() : 0;
        result = 31 * result + (getWidth() != null ? getWidth().hashCode() : 0);
        result = 31 * result + (getLength() != null ? getLength().hashCode() : 0);
        result = 31 * result + (getSpeed() != null ? getSpeed().hashCode() : 0);
        result = 31 * result + (getFuelType() != null ? getFuelType().hashCode() : 0);
        result = 31 * result + (getFuelAmount() != null ? getFuelAmount().hashCode() : 0);
        result = 31 * result + (getFuelTankSize() != null ? getFuelTankSize().hashCode() : 0);
        result = 31 * result + (getFuelUsagePerHour() != null ? getFuelUsagePerHour().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "weight=" + weight +
                ", width=" + width +
                ", length=" + length +
                ", speed=" + speed +
                ", fuelType='" + fuelType + '\'' +
                ", fuelAmount=" + fuelAmount +
                ", fuelTankSize=" + fuelTankSize +
                ", fuelUsagePerHour=" + fuelUsagePerHour +
                '}';
    }
}
