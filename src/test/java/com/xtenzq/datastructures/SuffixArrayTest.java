package com.xtenzq.datastructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuffixArrayTest {

    @Test
    public void checkSuffixArrayCreation() {
        SuffixArray actual = new SuffixArray("ABABBAB");
        String[] expected = new String[] {"AB", "ABABBAB", "ABBAB", "B", "BAB", "BABBAB", "BBAB"};
        assertArrayEquals(expected, actual.toStringArray());
    }

}
