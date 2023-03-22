package com.xtenzq.codeforces.round859;

import com.xtenzq.codeforces.A;
import com.xtenzq.codeforces.utils.AbstractCodeforcesTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ATest extends AbstractCodeforcesTest {

    private static final String prefix = "round859/";

    @Test
    public void testSetOne() {
        provideFile(prefix + "AInput.txt");
        A.main(new String[] { });
        assertEquals(readFile(prefix + "AOutput.txt"), getOutput());
    }
}
