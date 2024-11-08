package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        if (input.length() == 1) {
            result += symbol;
        } else {
            for (int i = 1; i < input.length(); i++) {
                if (input.charAt(i) == symbol && i == input.length() - 1) {
                    counter++;
                    result += String.valueOf(symbol) + counter;
                } else if (input.charAt(i) != symbol && i == input.length() - 1) {
                    result += symbol;
                    if (counter > 1) {
                        result += counter;
                    }
                    result += input.charAt(i);
                } else if (input.charAt(i) != symbol) {
                    result += symbol;
                    if (counter > 1) {
                        result += counter;
                    }
                    counter = 1;
                    symbol = input.charAt(i);
                } else if (input.charAt(i) == symbol) {
                    counter++;
                }
            }
        }

        return result;
    }
}