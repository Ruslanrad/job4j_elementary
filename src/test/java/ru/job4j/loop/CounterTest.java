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
}
