package com.jonathan.prices.exception;

public class ResourceNotFoundException extends RuntimeException {

    private final ErrorMessages error;

    public ResourceNotFoundException(ErrorMessages error) {
        super(error.getErrorMessage());
        this.error = error;
    }

    public ErrorMessages getError() {
        return error;
    }
}
