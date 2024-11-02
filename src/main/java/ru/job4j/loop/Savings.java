package ru.job4j.loop;

public class Savings {
    public static int years(double goal, double annualDeposit, double percent) {
        int years = 0;
        double total = 0;
        do {
            total = total * (1 + percent / 100) + annualDeposit;
            years++;
        } while (total < goal);
        return years;
    }

    public static void main(String[] args) {
        System.out.println(years(10, 100, 10));
    }
}
