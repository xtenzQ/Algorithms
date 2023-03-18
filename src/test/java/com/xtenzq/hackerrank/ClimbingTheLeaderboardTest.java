package com.xtenzq.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingTheLeaderboardTest {

    @Test
    public void testCaseOne() {
        List<Integer> ranked = Arrays.asList(100, 100, 50, 40, 40, 20, 10);
        List<Integer> player = Arrays.asList(5, 25, 50, 120);
        List<Integer> actual = ClimbingTheLeaderboard.solution(ranked, player);
        List<Integer> expected = Arrays.asList(6, 4, 2, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void testCaseTwo() {
        List<Integer> ranked = Arrays.asList(100, 90, 90, 80, 75, 60);
        List<Integer> player = Arrays.asList(50, 65, 77, 90, 102);
        List<Integer> actual = ClimbingTheLeaderboard.solution(ranked, player);
        List<Integer> expected = Arrays.asList(6, 5, 4, 2, 1);
        assertEquals(expected, actual);
    }

}
