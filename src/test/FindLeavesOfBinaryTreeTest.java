package test;

import dto.TreeNode;
import main.FindLeavesOfBinaryTree;
import org.junit.Test;

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
    }

    @Test
    public void test2() {
        TreeNode test2 = new TreeNode(1);

        List<List<Integer>> result = FindLeavesOfBinaryTree.findLeaves(test2);
    }

}
