package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class ConstructBinaryTreefromPreorderandInorderTraversalTest {

	@Test
	public void test() {
		ConstructBinaryTreefromPreorderandInorderTraversal s = new ConstructBinaryTreefromPreorderandInorderTraversal();
		TreeNode root = s.buildTree(new int[]{2, 1, 3}, new int[]{1, 2, 3});
		Assert.assertEquals(2, root.val);
		Assert.assertEquals(1, root.left.val);
		Assert.assertEquals(3, root.right.val);
	}

}
