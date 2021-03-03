package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenStartZeroFinishFiveThenFifteen() {
        int rsl = Counter.sum(0, 5);
        int expected = 15;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromTwentyToSixteenThenSixtysix() {
        int rsl = Counter.sumByEven(2, 16);
        int expected = 66;
        assertThat(rsl, is(expected));
    }
}
