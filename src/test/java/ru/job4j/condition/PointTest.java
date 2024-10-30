package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PointTest {
    @Test
    public void point73andMinus31Then10Ponit2() {
        int x1 = 7, y1 = 3, x2 = -3, y2 = 1;
        double expected = 10.2;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void point10and13Minus10Then15Point62() {
        int x1 = 1, y1 = 0, x2 = 13, y2 = -10;
        double expected = 15.62;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus1Minus1And1And1Then2Dot83Point83() {
        int x1 = -1, y1 = -1, x2 = 1, y2 = 1;
        double expected = 2.83;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
