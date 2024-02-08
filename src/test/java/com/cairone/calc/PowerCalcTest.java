package com.cairone.calc;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

class PowerCalcTest {

    private PowerCalc powerCalc;

    public PowerCalcTest() {
        this.powerCalc = new PowerCalc();
    }

    @Test
    void givenBase2Exp2_whenPower_thenResult4() {
        int expected = 4;
        int result = powerCalc.of(2, 2);
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void givenRandomBaseExp0_whenPower_thenResult1() {
        int expected = 1;
        int base = new Random().nextInt();
        int result = powerCalc.of(base, 0);
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void givenBaseZeroRandomExp_whenPower_thenResult0() {
        int expected = 0;
        int exp = new Random().nextInt();
        int result = powerCalc.of(0, exp);
        Assertions.assertThat(result).isEqualTo(expected);
    }
}