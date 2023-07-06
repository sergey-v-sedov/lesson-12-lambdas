package org.example;

public class PowOperation implements Operation {
    @Override
    public Double calculate(Double arg1, Double arg2) {
        return Math.pow(arg1, arg2);
    }
}
