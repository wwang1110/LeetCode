package LeetCode;

import org.junit.Test;

public class RecoverBinarySearchTreeTest {

	@Test
	public void test() {
		RecoverBinarySearchTree s = new RecoverBinarySearchTree();
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(5);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right = new TreeNode(6);
		root.right.left = new TreeNode(2);
		root.right.right = new TreeNode(7);
		s.recoverTree(root);
		
		root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		s.recoverTree(root);

		root = new TreeNode(0);
		root.left = new TreeNode(1);
		s.recoverTree(root);
	}

}
