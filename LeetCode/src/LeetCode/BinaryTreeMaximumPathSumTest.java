package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeMaximumPathSumTest {

	@Test
	public void test() {
		BinaryTreeMaximumPathSum s = new BinaryTreeMaximumPathSum();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		Assert.assertEquals(6, s.maxPathSum(root));
	}

}
