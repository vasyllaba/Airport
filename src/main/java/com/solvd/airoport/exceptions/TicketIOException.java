package com.solvd.airoport.exceptions;

import java.io.IOException;

public class TicketIOException extends IOException {
    public static final String MESSAGE = "Unsuccessful ticket print";

    public TicketIOException() {
    }

    public TicketIOException(String message) {
        super(message);
    }

    public TicketIOException(String message, Throwable cause) {
        super(message, cause);
    }

    public TicketIOException(Throwable cause) {
        super(cause);
    }
}
