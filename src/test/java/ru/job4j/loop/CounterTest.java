package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CounterTest {
    @Test
    void start1AndFinish2Then3() {
        int start = 1;
        int finish = 2;
        int expected = 3;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void startMinus5AndFinish3ThenMinus9() {
        int start = -5;
        int finish = 3;
        int expected = -9;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void start10AndFinish4Then0() {
        int start = 10;
        int finish = 4;
        int expected = 0;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumByEvenStart0AndFinish10Then30() {
        int start = 0;
        int finish = 10;
        int expected = 30;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumByEvenStartMinus2AndFinish10Then28() {
        int start = -2;
        int finish = 10;
        int expected = 28;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumByEvenStart20AndFinish5Then0() {
        int start = 20;
        int finish = 5;
        int expected = 0;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }
}
