package main;

/*
You are given a 0-indexed string s that you must perform k replacement operations on. The replacement operations are given as three 0-indexed parallel arrays, indices, sources, and targets, all of length k.

To complete the ith replacement operation:

Check if the substring sources[i] occurs at index indices[i] in the original string s.
If it does not occur, do nothing.
Otherwise if it does occur, replace that substring with targets[i].
For example, if s = "abcd", indices[i] = 0, sources[i] = "ab", and targets[i] = "eee", then the result of this replacement will be "eeecd".


All replacement operations must occur simultaneously, meaning the replacement operations should not affect the indexing of each other. The testcases will be generated such that the replacements will not overlap.

s = "abcd", indices[i] = 0, sources[i] = "ab", and targets[i] = "eee",
            indices[i] = 2, sources[i] = "cd", and targets[i] = "fff",
eeefff

originalStringMap
{
    0: "ab"
    2: "cb"
}

//For example, a testcase with s = "abc", indices = [0, 1], and sources = ["ab","bc"] will not be generated because the "ab" and "bc" replacements overlap.
//Return the resulting string after performing all replacement operations on s.
//
//A substring is a contiguous sequence of characters in a string.
//
// s = "abc", indices = [0, 1], and sources = ["ab","bc"], targets ["aaa", "bbb"]
//
// return "abc"
// return "aaabbb"
//
// whenever there's a conflict or overlap, throw exception
*/
public class FindAndReplaceInString {
//    if s = "abcd", indices[i] = 0, sources[i] = "ab", and targets[i] = "eee", then the result of this replacement will be "eeecd".

//    if s = "abcdef", indices = [0, 4], sources = ["ab", "ee"], targets = ["eee", "fff"];
//
//    indices[i] = 0, sources[i] = "ab", and targets[i] = "eee", then the result of this replacement will be "eeecd".

    public static String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        // 1. string result created
        // 2. loop through the indices, for each index, get the substring value from sources, compare that with substring of s,

        // 4. if it does match, append target substring to the result
        String result = ""; // eee
        int currentOriginalIndex = 0;
        int currentIndex = 0;

        while (currentOriginalIndex < s.length()) {
            if (currentIndex < indices.length) {
                int currentIndexFromIndices = indices[currentIndex]; // 0
                String sourceSubstring = sources[currentIndex]; // ab
                String targetSubstring = targets[currentIndex]; // eee
                String originalSubstring = s.substring(currentIndex, currentIndexFromIndices + sourceSubstring.length()); // ab

                if (currentOriginalIndex < currentIndexFromIndices) {
                    result = result + s.substring(currentOriginalIndex, currentIndexFromIndices);
                    currentOriginalIndex = currentIndexFromIndices;
                } else {
                    if (!sourceSubstring.equals(originalSubstring)) {
                        result = result + originalSubstring;
                    } else {

                        result = result + targetSubstring; // eee
                    }
                    currentOriginalIndex += originalSubstring.length(); // 2
                    currentIndex++;
                }
            } else {
                result += s.substring(currentOriginalIndex);
                break;
            }
        }

        return result; // eee

        // 1. string result created
        // 2. loop through the indices, for each index, get the substring value from sources, compare that with substring of s,

        // 4. if it does match, append target substring to the result


    }
}

// option 1: replace from original string and keep track of index with difference when the length is different between source and target
// option 2: