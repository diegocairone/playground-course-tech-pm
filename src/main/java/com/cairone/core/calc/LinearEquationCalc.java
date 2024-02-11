package com.cairone.core.calc;

import lombok.Builder;

public class LinearEquationCalc {

    private final AritmeticCalc aritmeticCalc;

    private Integer slope;
    private Integer bias;

    @Builder(setterPrefix = "with")
    public LinearEquationCalc(AritmeticCalc aritmeticCalc) {
        this.aritmeticCalc = aritmeticCalc;
    }

    public Integer calculate(Integer x) {
        Integer t1 = aritmeticCalc.multiplicationOf(slope, x);
        return t1 + bias;
    }

    public LinearEquationCalc setSlope(Integer slope) {
        this.slope = slope;
        return this;
    }

    public LinearEquationCalc setBias(Integer bias) {
        this.bias = bias;
        return this;
    }
}
