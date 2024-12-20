package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        if (input.length() == 1) {
            return input;
        }
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                result += symbol;
                if (counter > 1) {
                    result += counter;
                }
                counter = 1;
                symbol = input.charAt(i);
            }
        }

        result += symbol;
        if (counter > 1) {
            result += counter;
        }

        return result;
    }
}