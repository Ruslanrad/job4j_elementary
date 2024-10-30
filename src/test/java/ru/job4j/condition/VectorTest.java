package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class VectorTest {

    @Test
    void whenVectors104AndMinus52Then45() {
        int x1 = 10, y1 = 4, x2 = -5, y2 = 2;
        String excepted = "(5,6)";
        String result = Vector.addVectors(x1, y1, x2, y2);
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void whenVectors1Minus8And52Then6Minus6() {
        int x1 = 1, y1 = -8, x2 = 5, y2 = 2;
        String excepted = "(6,-6)";
        String result = Vector.addVectors(x1, y1, x2, y2);
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void whenVectors17And9Minus3Then104() {
        int x1 = 1, y1 = 7, x2 = 9, y2 = -3;
        String excepted = "(10,4)";
        String result = Vector.addVectors(x1, y1, x2, y2);
        assertThat(result).isEqualTo(excepted);
    }
}
