package com.cairone.core.calc;

public class PowerCalc {

    public Integer of(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        int i = 0;
        int result = 0;
        while (i < exp) {
            result = result + base;
            i++;
        }
        return result;
    }
}
