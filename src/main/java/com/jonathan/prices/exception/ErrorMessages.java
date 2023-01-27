package com.jonathan.prices.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorMessages {
    PRICE_NOT_FOUND(5000, "Price not found for given parameters");

    private final int errorCode;
    private final String errorMessage;
}
