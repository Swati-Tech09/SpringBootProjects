package com.demo.cloudVendorService.exception;

public class CloudNotFoundException  extends RuntimeException{
    public CloudNotFoundException(String message) {
        super(message);
    }

    public CloudNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
