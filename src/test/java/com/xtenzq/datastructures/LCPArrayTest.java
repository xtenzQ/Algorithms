package com.xtenzq.datastructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LCPArrayTest {

    @Test
    public void testLCPArray() {
        LCPArray lcpArray = new LCPArray("ABABBAB");
        lcpArray.build();
        int[] actual = lcpArray.valueList();
        int[] expected = new int[] {0, 2, 2, 0, 1, 3, 1};
        assertArrayEquals(expected, actual);
    }

}
