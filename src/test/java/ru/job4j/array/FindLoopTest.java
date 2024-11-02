package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {
    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int element = 5;
        int result = FindLoop.indexOf(data, element);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[]{1, -5, 30, 7, 100500};
        int element = 10;
        int result = FindLoop.indexOf(data, element);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNotMinus7ThenMinus3() {
        int[] data = new int[]{1, 0, 130, -7, 1005};
        int element = -7;
        int result = FindLoop.indexOf(data, element);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }
}