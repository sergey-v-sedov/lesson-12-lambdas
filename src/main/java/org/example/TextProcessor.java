package org.example;

import java.util.function.Function;

public class TextProcessor {
    /*
        *** Задание ***
        Напишите метод который принимает в качестве первого аргемента строку текста, а в качестве второго аргумента (типа функциональный интерфейс) - лямбда-функцию, выполнящую какую-либо операцию над строкой.
        Метод разбивает строку на слова по символу "пробел", применяет к каждому слову переданную в качестве аргумента лямбда-функцию и выводит на экран возвращенный лямбда-функцией результат.
        Реализовать следующие лямбда-функции:
        - приведение к верхнему регистру: "Apple" -> "APPLE"
        - сокращение длины строки до трех символов: "Apple" -> "App"
        - возврат длины строки вместо её содержимого: "Apple" -> "5"
     */

        public static void processString(String text, Function<String, String> lambdaFunction) {
            String[] words = text.split(" ");
            for (String word : words) {
                String result = lambdaFunction.apply(word);
                System.out.println(result);
            }
        }

        public static void testTextProcessor() {
            String text = "Равным образом рамки и место обучения кадров создаёт предпосылки качественно новых шагов для соответствующих условий активизации";
            System.out.println("Исходный текст:");
            System.out.println(text);

            // Лямбда-функция: приведение к верхнему регистру
            System.out.println("Приведение к верхнему регистру:");
            processString(text, String::toUpperCase);
            System.out.println();

            // Лямбда-функция: сокращение длины строки до трех символов
            Function<String, String> truncate = str -> str.substring(0, Math.min(str.length(), 3));
            System.out.println("Сокращение длины строки до трех символов:");
            processString(text, truncate);
            System.out.println();

            // Лямбда-функция: возврат длины строки вместо содержимого
            System.out.println("Возврат длины строки вместо содержимого:");
            processString(text, str -> String.valueOf(str.length()));
        }
}