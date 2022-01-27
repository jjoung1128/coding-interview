package test;

import main.KthFactorOfN;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KthFactorOfNTest {
    @Test
    public void test1() {
        int result = KthFactorOfN.kthFactor(12, 3);
        assertEquals(3, result);
    }

    @Test
    public void test2() {
        int result = KthFactorOfN.kthFactor(7,2);
        assertEquals(7, result);
    }

    @Test
    public void test3() {
        int result = KthFactorOfN.kthFactor(4, 4);
        assertEquals(-1, result);
    }
}
