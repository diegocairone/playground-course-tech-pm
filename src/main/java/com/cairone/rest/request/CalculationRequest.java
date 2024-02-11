package com.cairone.rest.request;

import lombok.Data;

@Data
public class CalculationRequest {

    private Integer numA;
    private Integer numB;
    private Operation op;

    public enum Operation {
        SUM,
        SUBTRACT,
        MULTIPLY,
        DIVIDE;
    }
}
