package com.solvd.airoport.exceptions;

public class PilotNullPointerException extends NullPointerException {
    public static final String MESSAGE = "Pilot can't be null";

    public PilotNullPointerException() {
    }

    public PilotNullPointerException(String s) {
        super(s);
    }
}
