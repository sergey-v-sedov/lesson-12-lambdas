package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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



        List<String> list = new ArrayList<>(Arrays.asList("Красный--------", "Желтый----------------", "Зеленый"));
        System.out.println(list);

        list.sort((e1, e2) -> e1.compareTo(e2));
        System.out.println(list);

        list.sort((e1, e2) -> e1.length() - e2.length());
        System.out.println(list);




    }
}