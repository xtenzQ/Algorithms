package com.xtenzq.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SansaAndXorTest {

    @Test
    public void testCaseOne() {
        List<Integer> input = Arrays.asList(1, 2, 3);
        int actual = SansaAndXor.solution(input);
        assertEquals(2, actual);
    }

    @Test
    public void testCaseTwo() {
        List<Integer> input = Arrays.asList(4, 5, 7, 5);
        int actual = SansaAndXor.solution(input);
        assertEquals(0, actual);
    }

    @Test
    public void testCaseThree() {
        List<Integer> input = Arrays.asList(98, 74, 12);
        int actual = SansaAndXor.solution(input);
        assertEquals(110, actual);
    }

    @Test
    public void testCaseFour() {
        List<Integer> input = Arrays.asList(50, 13, 2);
        int actual = SansaAndXor.solution(input);
        assertEquals(48, actual);
    }
}
