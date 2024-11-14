package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class MaxTest {
    @Test
    public void max5and3Then3() {
        Max max2Number = new Max();
        int a = 5;
        int b = 3;
        int expected = 5;
        int output = max2Number.max(a, b);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    public void max5and7and3Then7() {
        Max max2Number = new Max();
        int a = 5;
        int b = 3;
        int c = 7;
        int expected = 7;
        int output = max2Number.max(a, b, c);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    public void max5and3and11and1Then11() {
        Max max2Number = new Max();
        int a = 5;
        int b = 3;
        int c = 11;
        int d = 1;
        int expected = 11;
        int output = max2Number.max(a, b, c, d);
        assertThat(output).isEqualTo(expected);
    }
}
