package com.xtenzq.codeforces.round859;

import com.xtenzq.codeforces.utils.AbstractCodeforcesTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CTest extends AbstractCodeforcesTest {

    private static final String prefix = "round859/";

    @Test
    public void testSetOne() {
        provideFile(prefix + "CInput.txt");
        C.main(new String[]{});
        assertEquals(readFile(prefix + "COutput.txt"), getOutput());
    }
}
