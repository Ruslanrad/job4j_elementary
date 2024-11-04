package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TurnTest {
    @Test
    void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = {4, 1, 6, 2, 0, 1};
        int[] result = Turn.back(input);
        int[] expected = {1, 0, 2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = {9, 1, 2, 3, 4, 5, 0};
        int[] result = Turn.back(input);
        int[] expected = {0, 5, 4, 3, 2, 1, 9};
        assertThat(result).containsExactly(expected);
    }
}
