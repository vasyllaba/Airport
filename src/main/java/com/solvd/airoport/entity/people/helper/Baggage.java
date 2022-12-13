package com.solvd.airoport.entity.people.helper;

public class Baggage {
    private Double weight;
    private Double width;
    private Double length;
    private Double height;

    public Baggage() {
    }

    public Baggage(Double weight, Double width, Double length, Double height) {
        this.weight = weight;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getVolume() {
        return width * length * height;
    }

    @Override
    public boolean equals(Object o) {
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
        int result = weight != null ? weight.hashCode() : 0;
        result = 31 * result + (width != null ? width.hashCode() : 0);
        result = 31 * result + (length != null ? length.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Baggage{" +
                "weight=" + weight +
                ", width=" + width +
                ", length=" + length +
                ", height=" + height +
                '}';
    }
}
