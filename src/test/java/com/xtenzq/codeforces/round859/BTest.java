package com.xtenzq.codeforces.round859;

import com.xtenzq.codeforces.utils.AbstractCodeforcesTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BTest extends AbstractCodeforcesTest {

    private static final String prefix = "round859/";

    @Test
    public void testSetOne() {
        provideFile(prefix + "BInput.txt");
        B.main(new String[]{});
        assertEquals(readFile(prefix + "BOutput.txt"), getOutput());
    }
}
