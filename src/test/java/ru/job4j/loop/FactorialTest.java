package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class FactorialTest {
    @Test
    public void whenFactorial5Then120() {
        int x = 5;
        int expected = 120;
        int output = Factorial.factorial(x);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    public void whenFactorial0Then1() {
        int x = 0;
        int expected = 1;
        int output = Factorial.factorial(x);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    public void whenFactorial4Then24() {
        int x = 4;
        int expected = 24;
        int output = Factorial.factorial(x);
        assertThat(output).isEqualTo(expected);
    }
}
