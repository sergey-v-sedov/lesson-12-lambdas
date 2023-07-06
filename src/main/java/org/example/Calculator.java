package org.example;

public class Calculator {
    Double arg1;
    Double arg2;
    Double result;

    public void inputArguments(Double arg1, Double arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    public void validateArguments() {
        if(arg1 == null || arg2 == null) {
            System.out.println("Значение аргументов не валидно");
        }
    }

    public void makeOperation(Operation operation) {
        result = operation.calculate(arg1, arg2);
    }

    public void printResult() {
        System.out.println("Результат операции: " + result);
    }
}