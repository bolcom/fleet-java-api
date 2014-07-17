package com.bol.cd.fleet;

public class FleetException extends RuntimeException  {
    private int status;

    public FleetException(int status, String message, Throwable cause) {
        super(message, cause);
        this.status = status;
    }

    public FleetException(int status, String message) {
        super(message);
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
