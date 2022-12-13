package com.solvd.airoport.entity.people.helper;

import org.apache.log4j.Logger;

public class Baggage {
    private Double weight;
    private Double width;
    private Double length;
    private Double height;

    private static final Logger LOGGER = Logger.getLogger(Baggage.class);

    public Baggage() {
        LOGGER.debug("create new Baggage");
    }

    public Baggage(Double weight, Double width, Double length, Double height) {
        LOGGER.debug("create new Baggage with params: weight " + weight + ", width " + width + ", length " + length +
                ", height " + height);
        this.weight = weight;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public Double getWeight() {
        LOGGER.info("call getWeight() method, return value " + weight);
        return weight;
    }

    public void setWeight(Double weight) {
        LOGGER.info("call setWeight() method, with value " + weight);
        this.weight = weight;
    }

    public Double getWidth() {
        LOGGER.info("call getWidth() method, return value " + width);
        return width;
    }

    public void setWidth(Double width) {
        LOGGER.info("call setWidth() method, with value " + width);
        this.width = width;
    }

    public Double getLength() {
        LOGGER.info("call getLength() method, return value " + length);
        return length;
    }

    public void setLength(Double length) {
        LOGGER.info("call setLength() method, with value " + length);
        this.length = length;
    }

    public Double getHeight() {
        LOGGER.info("call getHeight() method, return value " + height);
        return height;
    }

    public void setHeight(Double height) {
        LOGGER.info("call setHeight() method, with value " + height);
        this.height = height;
    }

    public Double getVolume() {
        LOGGER.info("call getVolume() method");
        return width * length * height;
    }

    @Override
    public boolean equals(Object o) {
        LOGGER.info("call equals()");
        if (this == o) return true;
        if (!(o instanceof Baggage)) return false;

        Baggage baggage = (Baggage) o;

        if (weight != null ? !weight.equals(baggage.weight) : baggage.weight != null) return false;
        if (width != null ? !width.equals(baggage.width) : baggage.width != null) return false;
        if (length != null ? !length.equals(baggage.length) : baggage.length != null) return false;
        return height != null ? height.equals(baggage.height) : baggage.height == null;
    }

    @Override
    public int hashCode() {
        LOGGER.info("call hashCode()");
        int result = weight != null ? weight.hashCode() : 0;
        result = 31 * result + (width != null ? width.hashCode() : 0);
        result = 31 * result + (length != null ? length.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        LOGGER.info("call toString");
        return "Baggage{" +
                "weight=" + weight +
                ", width=" + width +
                ", length=" + length +
                ", height=" + height +
                '}';
    }
}
