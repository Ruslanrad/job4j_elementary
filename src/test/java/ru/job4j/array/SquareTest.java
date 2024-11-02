package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class SquareTest {
    @Test
    void whenBound3Then014() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void testSquare5() {
        int bound = 5;
        int[] expected = new int[]{0, 1, 4, 9, 16};
        int[] result = Square.calculate(bound);
        assertThat(result).isEqualTo(expected);
    }
}
