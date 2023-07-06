package org.example;

import java.util.function.ToDoubleBiFunction;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.inputArguments(4.0, 5.0);
        calculator.makeOperation((arg1, arg2) -> Math.pow(arg1, arg2));

        calculator.inputArguments(5.0, 5.0);
        calculator.makeOperation((arg1, arg2) -> arg1 + arg2);

        calculator.makeOperation((arg1, arg2) -> arg1 % arg2);

        calculator.makeOperation((arg1, arg2) -> arg1 / arg2);
    }
}