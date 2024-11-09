package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 0; i < input.length(); i++) {
            if (input.length() == 1) {
                result += symbol;
                return result;
            } else if (input.charAt(i) == symbol && i > 0) {
                counter++;
            } else if (input.charAt(i) != symbol) {
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