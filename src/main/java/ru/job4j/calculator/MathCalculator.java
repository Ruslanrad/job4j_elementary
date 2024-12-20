package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double differenceAndDivide(double first, double second) {
        return difference(first, second)
                + divide(first, second);
    }

    public static double sumAndMultiplyAndDifferenceAndDivide(double first, double second) {
        return difference(first, second)
                + divide(first, second)
                + multiply(first, second)
                + sum(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Сумма и умножение: " + sumAndMultiply(10, 20));
        System.out.println("Разность и деление: " + differenceAndDivide(10, 20));
        System.out.println("Сумма всех 4 выражений: " + sumAndMultiplyAndDifferenceAndDivide(10, 20));

    }

}