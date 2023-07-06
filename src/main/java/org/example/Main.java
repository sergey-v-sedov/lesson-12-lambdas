package org.example;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.inputArguments(4.0, 5.0);
        Operation pow = new PowOperation();
        calculator.makeOperation(pow);
        calculator.printResult();

        calculator.inputArguments(4.0, 5.0);
        Operation sum = new SumOperation();
        calculator.makeOperation(sum);
        calculator.printResult();
    }
}