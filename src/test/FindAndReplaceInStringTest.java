package test;

import main.FindAndReplaceInString;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindAndReplaceInStringTest {
    @Test
    public void test1() {
        String result = FindAndReplaceInString.findReplaceString("abcd", new int[]{0,2}, new String[]{"a", "cd"}, new String[]{"eee", "ffff"});
        assertEquals("eeebffff", result);
    }

    @Test
    public void test2() {
        String result = FindAndReplaceInString.findReplaceString("abcd", new int[]{0,2}, new String[]{"ab", "ec"}, new String[]{"eee", "ffff"});
        assertEquals("eeecd", result);
    }
}
