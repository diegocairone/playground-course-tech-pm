package com.cairone.calc;

public class AritmeticCalc {

    public Integer sumOf(int a, int b) {
        return a + b;
    }

    public Integer doubleOf(int a) {
        return a + a;
    }

    public Integer subtractionOf(int a, int b) {
        return a - b;
    }

    public Integer multiplicationOf(int a, int b) {
        return a * b;
    }

    public Integer divisionOf(int a, int b) {
        if (b == 0) {
            throw new CalculationException("Cannot divide by ZERO!");
        } else if (a % b != 0) {
            throw new CalculationException("Number A[%s] is not divisible by number B[%s]!", a, b);
        }
        return a / b;
    }
}
