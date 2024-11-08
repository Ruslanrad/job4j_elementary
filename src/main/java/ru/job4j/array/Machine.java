package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        money = money - price;
        for (int remaince : coins) {
            while (money >= remaince) {
                money -= remaince;
                result[size] = remaince;
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }
}