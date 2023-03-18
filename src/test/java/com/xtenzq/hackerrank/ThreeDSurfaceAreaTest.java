package com.xtenzq.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeDSurfaceAreaTest {

    @Test
    public void testCaseOne() {
        List<List<Integer>> input = Arrays.asList(Arrays.asList(1));
        int actual = ThreeDSurfaceArea.solution(input);
        assertEquals(6, actual);
    }

    @Test
    public void testCaseTwo() {
        List<List<Integer>> input = Arrays.asList(Arrays.asList(1, 3, 4),
                                                  Arrays.asList(2, 2, 3),
                                                  Arrays.asList(1, 2, 4));
        int actual = ThreeDSurfaceArea.solution(input);
        assertEquals(60, actual);
    }

}
