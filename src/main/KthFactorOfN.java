package main;

import java.util.ArrayList;
import java.util.List;

public class KthFactorOfN {
    /*
    You are given two positive integers n and k. A factor of an integer n is defined as an integer i where n % i == 0.

Consider a list of all factors of n sorted in ascending order, return the kth factor in this list or return -1 if n has less than k factors.

    n = 6 k = 2 , k = 5
    [1,2,3,6]

    ans = 2 , and -1

    6 % 4 == 2

    O(n)
    O(n)

    1
    [1]

    2
    [1,2]

    3
    [1,3]

    4
    [1,2,4]

    5
    [1,5]
 */
    public static int kthFactor(int n, int k) {
        // create a list of factors
//        List<Integer> factorList = new ArrayList<>();
        int count = k;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count--;
                if (count == 0) {
                    return i;
                }
            }
        }

        return -1;
    }
}
