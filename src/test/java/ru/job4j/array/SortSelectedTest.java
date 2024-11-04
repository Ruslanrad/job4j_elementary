package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[]{101, 5, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{5, 8, 101};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[]{-5, 23, 11, 101, -20};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{-20, -5, 11, 23, 101};
        assertThat(result).containsExactly(expected);
    }
}