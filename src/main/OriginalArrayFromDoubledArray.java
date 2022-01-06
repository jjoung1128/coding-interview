package main;

import java.util.Arrays;

public class OriginalArrayFromDoubledArray {
    /*
    An integer array original is transformed into a doubled array changed by appending twice the value of every element in original,
    and then randomly shuffling the resulting array.

    Given an array changed, return original if changed is a doubled array.
    If changed is not a doubled array, return an empty array. The elements in original may be returned in any order.
     */

    // original array: [1, 2, 3, 2, 4, 6], [2, 4, 1, 2, 3, 6]

    // [1, 2, 2, 3, 4, 6]

    // [5, 6, 7, 8, 9, 10, 11, 12]


    // original array: [2, 4, 4]

    // hashMap key: element value: boolean whether the pair exist or not
    // find:
    // 1. look for the number that is twice of the element and not paired yet

    // there is one input. Input might be either original array or doubled array
    // if

    // input number will be positive integers

    public static boolean isDoubledArray(int[] originalArr) {
        if (originalArr.length < 2 || originalArr.length % 2 != 0) return false;
        int left = 0;
        int right = 1;

        Arrays.sort(originalArr);

        while (left < originalArr.length && right < originalArr.length) {
            while (originalArr[left] * 2 != originalArr[right]) {
                right++;
                if (right >= originalArr.length) {
                    return false;
                }
            }
            left++;
            if (left == right) {
                left++;
                right = left + 1;
            } else {
                right++;
            }
        }

        return true;
    }
}
