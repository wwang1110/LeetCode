package LeetCode;

import org.junit.Test;

public class FlattenBinaryTreetoLinkedListTest {

	@Test
	public void test() {
		FlattenBinaryTreetoLinkedList s = new FlattenBinaryTreetoLinkedList();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		s.flatten(root);
	}

}
