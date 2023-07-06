package org.example;

public class SumOperation implements Operation {
    @Override
    public Double calculate(Double arg1, Double arg2) {
        return arg1 + arg2;
    }
}
