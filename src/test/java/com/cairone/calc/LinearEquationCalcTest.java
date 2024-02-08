package com.cairone.calc;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class LinearEquationCalcTest {

    @Test
    void givenSlope2Bias3_whenCalcWith2_thenResultIs7() {

        AritmeticCalc aritmeticCalc = Mockito.mock(AritmeticCalc.class);

        Mockito.when(aritmeticCalc.multiplicationOf(2, 2)).thenReturn(4);

        LinearEquationCalc cal = LinearEquationCalc.builder()
                .withAritmeticCalc(aritmeticCalc)
                .build();

        Integer result = cal.setSlope(2).setBias(3).calculate(2);
        Integer expected = 7;

        Assertions.assertThat(result).isEqualTo(expected);
    }
}