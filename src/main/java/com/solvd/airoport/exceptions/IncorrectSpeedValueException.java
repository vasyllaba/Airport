package com.solvd.airoport.exceptions;

public class IncorrectSpeedValueException extends IllegalArgumentException {
    public static final String MESSAGE = "speed cannot acquire a negative value";

    public IncorrectSpeedValueException() {
    }

    public IncorrectSpeedValueException(String message) {
        super(message);
    }

    public IncorrectSpeedValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectSpeedValueException(Throwable cause) {
        super(cause);
    }
}
