package com.xtenzq.leetcode.binary_search;

import org.junit.jupiter.api.Test;

import static com.xtenzq.leetcode.binary_search.BinarySearch.binarySearch;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void testOne() {
        int[] input = new int[] { -1, 0, 3, 5, 9, 12 };
        int actual = binarySearch(input, 9);
        assertEquals(4, actual);
    }

    @Test
    void testTwo() {
        int[] input = new int[] { -1, 0, 3, 5, 9, 12 };
        int actual = binarySearch(input, 2);
        assertEquals(-1, actual);
    }
}
