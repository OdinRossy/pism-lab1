package com.odinrossy.pismlab1.services;

public class NumbersService {
    public  String generateMessage(double[] arr) {
        StringBuilder message = new StringBuilder();
        String countOfNumbers = "Количество введеных чисел: " + (arr.length) + "<br>";
        String firstAndLastNumbers = "Первое число: " + arr[0] + "; последнее: " + arr[arr.length - 1] + ";<br>";

        message.append(countOfNumbers);
        message.append(firstAndLastNumbers);

        StringBuilder doubleNumbers = new StringBuilder();
        doubleNumbers.append("Дробные числа: ");

        StringBuilder integerNumbers = new StringBuilder();
        integerNumbers.append("Целые числа: ");

        for (double d: arr) {
            if (isDouble(d)) {
                doubleNumbers.append(d).append("; ");
            } else {
                integerNumbers.append(d).append("; ");
            }
        }

        message.append(doubleNumbers).append("<br>");
        message.append(integerNumbers).append("<br>");

        return String.valueOf(message);
    }

    private static boolean isDouble(double b) {
        return b != (int) b;
    }
}
