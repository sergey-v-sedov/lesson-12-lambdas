package org.example;

import java.util.function.ToDoubleBiFunction;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.inputArguments(4.0, 5.0);
        ToDoubleBiFunction<Double, Double> pow = new PowOperation();
        calculator.makeOperation(pow);

        calculator.inputArguments(4.0, 5.0);
        ToDoubleBiFunction<Double, Double> sum = new SumOperation();
        calculator.makeOperation(sum);
    }
}