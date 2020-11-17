package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.SwitchArray;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static ru.job4j.array.SwitchArray.swap;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void test() {
        int[] initial = {0, 8, 3, 5};
        assertThat(new int[]{5, 8, 3, 0}, is(swap(initial, 0, 3)));
        assertThat(new int[]{8, 5, 3, 0}, is(swap(initial, 0, 1)));
    }
}