package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static ru.job4j.array.SelectionSort.sort;

public class SelectionSortTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void sort2() {
        assertThat(sort(new int[]{2, 0}), is(new int[]{0, 2}));
    }

    @Test
    public void sort3() {
        assertThat(sort(new int[]{4, 0, -1}), is(new int[]{-1, 0, 4}));
    }
}