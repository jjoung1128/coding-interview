package test;

import main.LongestStringChain;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestStringChainTest {
    @Test
    public void test1() {
        String[] test = {"a","b","ba","bca","bda","bdca"};
        int result = LongestStringChain.longestStrChain(test);
        assertEquals(4, result);
    }

    @Test
    public void test2() {
        String[] test = {"xbc","pcxbcf","xb","cxbc","pcxbc"};
        int result = LongestStringChain.longestStrChain(test);
        assertEquals(5, result);
    }

    @Test
    public void test3() {
        String[] test = {"abcd","dbqca"};
        int result = LongestStringChain.longestStrChain(test);
        assertEquals(1, result);
    }
}
