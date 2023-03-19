package com.xtenzq.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    public void testSetOne() {
        int[] actual = new int[] { 5, 2, 9, 7, 1, 4};
        int[] expected = new int[] { 1, 2, 4, 5, 7, 9 };
        SelectionSort.sort(actual);
        assertArrayEquals(expected, actual);
    }

}
