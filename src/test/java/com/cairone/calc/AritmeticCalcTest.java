package com.cairone.calc;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

class AritmeticCalcTest {

    private AritmeticCalc aritmeticCalc;

    public AritmeticCalcTest() {
        this.aritmeticCalc = new AritmeticCalc();
    }

    @Test
    @DisplayName("Sum of 2 integers")
    void givenTwoPositiveNumbers_whenSum_thenResultOk() {
        int expected = 5;
        int result = aritmeticCalc.sumOf(2, 3);
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("Substraction of 2 integers with positive result")
    void givenTwoPositiveNumbers_whenSubtract_thenPositiveResultOk() {
        int expected = 2;
        int result = aritmeticCalc.subtractionOf(5, 3);
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("Substraction of 2 integers with negative result")
    void givenTwoPositiveNumbers_whenSubtract_thenNegativeResultOk() {
        int expected = -2;
        int result = aritmeticCalc.subtractionOf(3, 5);
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("Multiplication of 2 integers with expected result")
    void givenTwoPositiveNumbers_whenMultiplication_thenResultOk() {
        int expected = 6;
        int result = aritmeticCalc.multiplicationOf(3, 2);
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("Divison of 2 integers with expected result")
    void givenTwoPositiveNumbers_whenDivision_thenResultOk() {
        int expected = 3;
        int result = aritmeticCalc.divisionOf(6, 2);
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("Divison of a non-divisible integer")
    void givenTwoPositiveNumbers_whenDivisionWithNonDivisibleNumbers_thenThrowException() {
        Assertions.assertThatThrownBy(() -> {
                    int result = aritmeticCalc.divisionOf(5, 2);
                }).
                isInstanceOf(CalculationException.class)
                .hasMessage("Number A[5] is not divisible by number B[2]!");
    }

    @Test
    @DisplayName("Division of any integer by ZERO")
    void givenARandomPositiveNumber_whenDivisionByZero_thenThrowException() {
        int num = new Random().nextInt();
        Assertions.assertThatThrownBy(
                () -> aritmeticCalc.divisionOf(num, 0))
                .isInstanceOf(CalculationException.class)
                .hasMessage("Cannot divide by ZERO!");
    }
}