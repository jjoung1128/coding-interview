package test;

import main.FlipStringMonotone;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlipStringMonotoneTest {
    @Test
    public void test1() {
        int result = FlipStringMonotone.minFlipsMonoIncr("00110");
        assertEquals(1, result);
    }

    @Test
    public void test2() {
        int result = FlipStringMonotone.minFlipsMonoIncr("010110");
        assertEquals(2, result);
    }

    @Test
    public void test3() {
        int result = FlipStringMonotone.minFlipsMonoIncr("00011000");
        assertEquals(2, result);
    }
}
