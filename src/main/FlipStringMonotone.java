package main;

public class FlipStringMonotone {
    /*
    A binary string is monotone increasing if it consists of some number of 0's (possibly none), followed by some number of 1's (also possibly none).

    You are given a binary string s. You can flip s[i] changing it from 0 to 1 or from 1 to 0.

    Return the minimum number of flips to make s monotone increasing.

    00010111
    minFlip = 1

    010110
    minFlip = 2

    00011000
    boolean isThereOne = false -> true
    int countOfOne = 2
    int countOfZeroAfterOne = 3

    minFlip = 3
    minFlip = 2

    111111
    minFlip = 0


    010110

    010110
    flip = 1

    00011000

    00011000

    */
    public static int minFlipsMonoIncr(String s) {
        boolean isThereOne = false;
        int countOfOne = 0;
        int countOfZeroAfterOne = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '1') {
                isThereOne = true;
                countOfOne++;
            } else if (isThereOne && c == '0') {
                countOfZeroAfterOne++;
            }
        }

        return Math.min(countOfOne, countOfZeroAfterOne);
    }
}
