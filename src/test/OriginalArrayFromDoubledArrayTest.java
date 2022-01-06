package test;

import main.OriginalArrayFromDoubledArray;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OriginalArrayFromDoubledArrayTest {
    @Test
    public void test1() {
        boolean isDoubledArray = OriginalArrayFromDoubledArray.isDoubledArray(new int[]{2, 4, 1, 2, 3, 6});
        assertTrue(isDoubledArray);
    }

    @Test
    public void test2() {
        boolean isDoubledArray = OriginalArrayFromDoubledArray.isDoubledArray(new int[]{2, 4, 4});
        assertFalse(isDoubledArray);
    }

    @Test
    public void test3() {
        boolean isDoubledArray = OriginalArrayFromDoubledArray.isDoubledArray(new int[]{3, 1, 3, 6});
        assertFalse(isDoubledArray);
    }

    @Test
    public void test4() {
        boolean isDoubledArray = OriginalArrayFromDoubledArray.isDoubledArray(new int[]{2, 4, 4, 8});
        assertTrue(isDoubledArray);
    }
}
