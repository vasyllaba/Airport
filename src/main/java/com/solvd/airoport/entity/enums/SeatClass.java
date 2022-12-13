package com.solvd.airoport.entity.enums;

public enum SeatClass {
    First(1),
    Second(2);

    SeatClass(Integer seatClass) {
        this.seatClass = seatClass;
    }

    public final Integer seatClass;

    public Integer getSeatClass() {
        return seatClass;
    }
}
