package com.solvd.airoport.entity.planes;

import com.solvd.airoport.entity.interfaces.IVerticalLaunching;
import org.apache.log4j.Logger;

import java.util.Objects;

public class CargoPlane extends Plane implements IVerticalLaunching {

    private Integer capacity;
    private Double volume;
    private Boolean isParatroopersAbility;
    private Double trunkHeight;
    private Double trunkWidth;
    private Double trunkLength;

    private static final Logger LOGGER = Logger.getLogger(CargoPlane.class);

    public CargoPlane() {
        LOGGER.debug("create new CargoPlane");
    }

    public CargoPlane(Integer weight, Integer width, Integer length, Integer speed, String fuelType, Integer capacity,
                      Double volume, Boolean isParatroopersAbility, Double trunkHeight, Double trunkWidth,
                      Double trunkLength, Double fuelAmount, Double fuelTankSize, Double fuelUsagePerHour) {
        super(weight, width, length, speed, fuelType, fuelAmount, fuelTankSize, fuelUsagePerHour);
        LOGGER.debug("create new CargoPlane with params: capacity " + capacity + ", volume" +
                volume + ", isParatroopersAbility" + isParatroopersAbility + ", trunkHeight" +
                trunkHeight + ", trunkWidth" + trunkWidth + ", trunkLength" +
                trunkLength);
        this.capacity = capacity;
        this.volume = volume;
        this.isParatroopersAbility = isParatroopersAbility;
        this.trunkHeight = trunkHeight;
        this.trunkWidth = trunkWidth;
        this.trunkLength = trunkLength;
    }

    public Integer getCapacity() {
        LOGGER.info("call getCapacity");
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        LOGGER.info("call setCapacity with value " + capacity);
        this.capacity = capacity;
    }

    public Double getVolume() {
        LOGGER.info("call getVolume");
        return volume;
    }

    public void setVolume(Double volume) {
        LOGGER.info("call setVolume with value " + volume);
        this.volume = volume;
    }

    public Boolean getParatroopersAbility() {
        LOGGER.info("call getParatroopersAbility");
        return isParatroopersAbility;
    }

    public void setParatroopersAbility(Boolean paratroopersAbility) {
        LOGGER.info("call setParatroopersAbility with value " + paratroopersAbility);
        isParatroopersAbility = paratroopersAbility;
    }

    public Double getTrunkHeight() {
        LOGGER.info("call getTrunkHeight");
        return trunkHeight;
    }

    public void setTrunkHeight(Double trunkHeight) {
        LOGGER.info("call setTrunkHeight with value " + trunkHeight);
        this.trunkHeight = trunkHeight;
    }

    public Double getTrunkWidth() {
        LOGGER.info("call getTrunkWidth");
        return trunkWidth;
    }

    public void setTrunkWidth(Double trunkWidth) {
        LOGGER.info("call setTrunkWidth with value " + trunkWidth);
        this.trunkWidth = trunkWidth;
    }

    public Double getTrunkLength() {
        LOGGER.info("call getTrunkLength");
        return trunkLength;
    }

    public void setTrunkLength(Double trunkLength) {
        LOGGER.info("call setTrunkLength with value " + trunkLength);
        this.trunkLength = trunkLength;
    }

    @Override
    public String toString() {
        LOGGER.info("call toString()");
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

    @Override
    public boolean equals(Object o) {
        LOGGER.info("call equals()");
        if (this == o) return true;
        if (!(o instanceof CargoPlane)) return false;

        CargoPlane that = (CargoPlane) o;

        if (!Objects.equals(capacity, that.capacity)) return false;
        if (!Objects.equals(volume, that.volume)) return false;
        if (!Objects.equals(isParatroopersAbility, that.isParatroopersAbility))
            return false;
        if (!Objects.equals(trunkHeight, that.trunkHeight)) return false;
        if (!Objects.equals(trunkWidth, that.trunkWidth)) return false;
        if (this.getWeight() != null ? !this.getWeight().equals(that.getWeight()) : that.getWeight() != null) return false;
        if (this.getWidth() != null ? !this.getWidth().equals(that.getWidth()) : that.getWidth() != null) return false;
        if (this.getLength() != null ? !this.getLength().equals(that.getLength()) : that.getLength() != null) return false;
        if (this.getSpeed() != null ? !this.getSpeed().equals(that.getSpeed()) : that.getSpeed() != null) return false;
        if (this.getFuelType() != null ? !this.getFuelType().equals(that.getFuelType()) : that.getFuelType() != null) return false;
        return Objects.equals(trunkLength, that.trunkLength);
    }

    @Override
    public int hashCode() {
        LOGGER.info("call hashCode()");
        int result = capacity != null ? capacity.hashCode() : 0;
        result = 31 * result + (volume != null ? volume.hashCode() : 0);
        result = 31 * result + (isParatroopersAbility != null ? isParatroopersAbility.hashCode() : 0);
        result = 31 * result + (trunkHeight != null ? trunkHeight.hashCode() : 0);
        result = 31 * result + (trunkWidth != null ? trunkWidth.hashCode() : 0);
        result = 31 * result + (trunkLength != null ? trunkLength.hashCode() : 0);
        return result;
    }

    @Override
    public void verticalLaunch() {
        LOGGER.info("call verticalLaunch()");
        setFlightHeight(40);
        setSpeed(120);
    }
}
