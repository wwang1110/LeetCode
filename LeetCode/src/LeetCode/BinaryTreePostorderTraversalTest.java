package LeetCode;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreePostorderTraversalTest {

	@Test
	public void test() {
		BinaryTreePostorderTraversal s = new BinaryTreePostorderTraversal();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		
		root.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		ArrayList<Integer> ret = s.postorderTraversal(root);
		Assert.assertEquals(7, ret.size());
	}

}
