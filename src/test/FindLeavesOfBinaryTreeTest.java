package test;

import dto.TreeNode;
import main.FindLeavesOfBinaryTree;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FindLeavesOfBinaryTreeTest {
    @Test
    public void test1() {
        TreeNode test1 = new TreeNode(1);
        test1.right = new TreeNode(3);
        test1.left = new TreeNode(2);
        test1.left.left = new TreeNode(4);
        test1.left.right = new TreeNode(5);

        List<List<Integer>> result = FindLeavesOfBinaryTree.findLeaves(test1);

        assertEquals(result.get(0), Arrays.asList(4, 5, 3));
        assertEquals(result.get(1), List.of(2));
        assertEquals(result.get(2), List.of(1));
    }

    @Test
    public void test2() {
        TreeNode test2 = new TreeNode(1);

        List<List<Integer>> result = FindLeavesOfBinaryTree.findLeaves(test2);
        assertEquals(result.get(0), List.of(1));
    }

    @Test
    public void test3() {
        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(3);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.left.left.left = new TreeNode(6);

        List<List<Integer>> result = FindLeavesOfBinaryTree.findLeaves(node);

        assertEquals(result.get(0), Arrays.asList(6, 5, 3));
        assertEquals(result.get(1), List.of(4));
        assertEquals(result.get(2), List.of(2));
        assertEquals(result.get(3), List.of(1));
    }
}
