package LeetCode;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeLevelOrderTraversalTest {

	@Test
	public void test() {
		BinaryTreeLevelOrderTraversal s = new BinaryTreeLevelOrderTraversal();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		ArrayList<ArrayList<Integer>> ret = s.levelOrder(root);
		Assert.assertEquals(3, ret.size());
	}

}
