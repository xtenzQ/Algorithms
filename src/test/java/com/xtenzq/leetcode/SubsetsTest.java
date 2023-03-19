package com.xtenzq.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubsetsTest {

    @Test
    void testSetOne() {
        int[] input = new int[] { 1, 2, 3 };
        List<List<Integer>> actual = Subsets.solution(input);
        List<List<Integer>> expected = Arrays.asList(new ArrayList<>(), Arrays.asList(3), Arrays.asList(2), Arrays.asList(2, 3),
                Arrays.asList(1), Arrays.asList(1, 3), Arrays.asList(1, 2), Arrays.asList(1, 2, 3));
        assertEquals(expected, actual);
    }

    @Test
    void testSetTwo() {
        int[] input = new int[] { 0 };
        List<List<Integer>> actual = Subsets.solution(input);
        List<List<Integer>> expected = Arrays.asList(new ArrayList<>(), Arrays.asList(0));
        assertEquals(expected, actual);
    }
}
