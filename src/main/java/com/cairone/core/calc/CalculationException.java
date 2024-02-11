package com.cairone.core.calc;

public class CalculationException extends RuntimeException {

    public CalculationException(String message, Object... args) {
        super(String.format(message, args));
    }
}
