package main;

/*
Given the root of a binary tree, collect a tree's nodes as if you were doing this:

Collect all the leaf nodes.
Remove all the leaf nodes.
Repeat until the tree is empty.

Example 1:
Input: root = [1,2,3,4,5]
Output: [[4,5,3],[2],[1]]
Explanation:
[[3,5,4],[2],[1]] and [[3,4,5],[2],[1]] are also considered correct answers since per each level it does not matter the order on which elements are returned.
 */

import dto.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class FindLeavesOfBinaryTree {
    public static List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        populateResult(root, result);
        return result;
    }

    public static int populateResult(TreeNode node, List<List<Integer>> result) {
        if (node == null) {
            return -1;
        }
        int currentHeight = Math.max(populateResult(node.left, result), populateResult(node.right, result)) + 1;
        if (result.size() < currentHeight + 1) {
            result.add(new ArrayList<>());
        }
        result.get(currentHeight).add(node.val);
        return currentHeight;
    }
}
