package main;

public class WordSearch {
    /*
    Given an m x n grid of characters board and a string word, return true if word exists in the grid.
    The word can be constructed from letters of sequentially adjacent cells,
    where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
     */

    public static boolean exist(char[][] board, String word) {
        // use 2D boolean array to store if we visited each node(letter
        // create a dictionary to store the count of each letter, keep the copy
        // using for loops to iterate each letter and check if the letter exists in the dictionary
        // if it exists we decrement the count of the letter from the dictionary, if count reaches 0, remove from the dictionary
        // then mark the boolean array to mark the node is visited
        // check each adjacent node and repeat checking and marking
        // if all the adjacent characters don't exist in the dictionary, reset the dictionary
        // when we get the dictionary empty we return true
        // else return false if we reach the last letter and still cannot find the answer

//        boolean[][] lookUpVisited = new boolean[board.length][boardp0];



        return false;
    }
}
