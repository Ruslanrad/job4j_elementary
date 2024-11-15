package ru.job4j.condition;

public class Max {
    private int a;
    private int b;
    private int c;
    private int d;

    public int max(int a, int b) {
        this.a = a;
        this.b = b;
        return (a > b) ? a : b;
    }

    public int max(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        return max(max(a, b), c);
    }

    public int max(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        return max(max(a, b, c), d);
    }
}
