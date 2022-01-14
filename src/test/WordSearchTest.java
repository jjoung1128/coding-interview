package test;

import main.WordSearch;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WordSearchTest {
    @Test
    public void test1() {
        char[][] board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
        boolean result = WordSearch.exist(board, word);
        assertTrue(result);
    }

    @Test
    public void test2() {
        char[][] board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "SEE";
        boolean result = WordSearch.exist(board, word);
        assertTrue(result);
    }

    @Test
    public void test3() {
        char[][] board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        char[][] board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'B', 'C', 'B'}
        };


        String word = "ABCB";
        boolean result = WordSearch.exist(board, word);
        assertFalse(result);
    }
}
