package com.solvd.airoport.entity.planes;

import com.solvd.airoport.entity.interfaces.IVerticalLaunching;

import java.util.Objects;

public class CargoPlane extends Plane implements IVerticalLaunching {

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
                      Double trunkLength, Double fuelAmount, Double fuelTankSize, Double fuelUsagePerHour) {
        super(weight, width, length, speed, fuelType, fuelAmount, fuelTankSize, fuelUsagePerHour);
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

    @Override
    public boolean equals(Object o) {
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
        setFlightHeight(40);
        setSpeed(120);
    }
}
