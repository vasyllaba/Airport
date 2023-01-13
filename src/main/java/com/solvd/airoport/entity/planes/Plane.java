package com.solvd.airoport.entity.planes;

import com.solvd.airoport.entity.interfaces.IFuelDrop;
import org.apache.log4j.Logger;

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

    private static final Logger LOGGER = Logger.getLogger(Plane.class);

    public Plane() {
        LOGGER.debug("create new Plane");
        this.chassis = true;
        this.flightHeight = 0;
        this.engine = false;
    }

    public Plane(Integer weight, Integer width, Integer length, Integer speed, String fuelType, Double fuelAmount,
                 Double fuelTankSize, Double fuelUsagePerHour) {
        LOGGER.debug("create new Plane with params: weight " + weight +
                ", width" + width +
                ", length" + length +
                ", speed" + speed +
                ", fuelType" + fuelType +
                ", fuelAmount" + fuelAmount +
                ", fuelTankSize" + fuelTankSize +
                ", fuelUsagePerHour" + fuelUsagePerHour);
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
    public void fuelDrop() {
        LOGGER.info("drop all fuel");
        fuelAmount = 0.0;
    }

    public void fuelDrop(double dropAmount) {
        LOGGER.info("drop fuel part");
        if (dropAmount > fuelAmount){
            fuelDrop();
            return;
        }
        IFuelDrop<Double, Double, Double> function = (arg1, arg2) -> arg1 - arg2;
        fuelAmount = function.drop(fuelAmount, dropAmount);
    }

    public int dropHeight(int meters) {
        LOGGER.info("call dropHeight()");
        LOGGER.debug("drop flightHeight on " + meters + " meters");
        flightHeight -= meters;
        return flightHeight;
    }

    public Integer getWeight() {
        LOGGER.info("call getWeight()");
        return weight;
    }

    public void setWeight(Integer weight) {
        LOGGER.info("call setWeight with value " + weight);
        this.weight = weight;
    }

    public Integer getWidth() {
        LOGGER.info("call getWidth()");
        return width;
    }

    public void setWidth(Integer width) {
        LOGGER.info("call setWidth with value " + width);
        this.width = width;
    }

    public Integer getLength() {
        LOGGER.info("call getLength()");
        return length;
    }

    public void setLength(Integer length) {
        LOGGER.info("call setLength with value " + length);
        this.length = length;
    }

    public Integer getSpeed() {
        LOGGER.info("call getSpeed()");
        return speed;
    }

    public void setSpeed(Integer speed) {
        LOGGER.info("call setSpeed with value " + speed);
        this.speed = speed;
    }

    public String getFuelType() {
        LOGGER.info("call getFuelType()");
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        LOGGER.info("call setFuelType with value " + fuelType);
        this.fuelType = fuelType;
    }

    public Double getFuelAmount() {
        LOGGER.info("call getFuelAmount()");
        return fuelAmount;
    }

    public void setFuelAmount(Double fuelAmount) {
        LOGGER.info("call setFuelAmount with value " + fuelAmount);
        this.fuelAmount = fuelAmount;
    }

    public Double getFuelTankSize() {
        LOGGER.info("call getFuelTankSize()");
        return fuelTankSize;
    }

    public void setFuelTankSize(Double fuelTankSize) {
        LOGGER.info("call setFuelTankSize with value " + fuelTankSize);
        this.fuelTankSize = fuelTankSize;
    }

    public Double getFuelUsagePerHour() {
        LOGGER.info("call getFuelUsagePerHour()");
        return fuelUsagePerHour;
    }

    public void setFuelUsagePerHour(Double fuelUsagePerHour) {
        LOGGER.info("call setFuelUsagePerHour with value " + fuelUsagePerHour);
        this.fuelUsagePerHour = fuelUsagePerHour;
    }

    public Boolean getChassis() {
        LOGGER.info("call getChassis()");
        return chassis;
    }

    public void setChassis(Boolean chassis) {
        LOGGER.info("call setChassis with value " + chassis);
        this.chassis = chassis;
    }

    public Integer getFlightHeight() {
        LOGGER.info("call getFlightHeight()");
        return flightHeight;
    }

    public void setFlightHeight(Integer flightHeight) {
        LOGGER.info("call setFlightHeight with value " + flightHeight);
        this.flightHeight = flightHeight;
    }

    public Boolean getEngine() {
        LOGGER.info("call getEngine()");
        return engine;
    }

    public void setEngine(Boolean engine) {
        LOGGER.info("call setEngine with value " + engine);
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        LOGGER.info("call equals()");
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
        LOGGER.info("call hashCode()");
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
        LOGGER.info("call toString()");
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
