package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class RectangleTest {

    @Test
    void whenLength5AndWidth9ThenDiagonal10Point3() {
        double length = 5;
        double width = 9;
        double expected = 10.3;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength1AndWidth4ThenDiagonal4Point12() {
        double length = 1;
        double width = 4;
        double expected = 4.12;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength8AndWidth15ThenDiagonal17() {
        double length = 8;
        double width = 15;
        double expected = 17;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
