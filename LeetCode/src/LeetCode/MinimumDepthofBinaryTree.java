package LeetCode;

public class MinimumDepthofBinaryTree {
	//Given a binary tree, find its minimum depth.

	//The minimum depth is the number of nodes along the shortest path from the root node down to 
	//the nearest leaf node.
	public int minDepth(TreeNode node) {
		if (node == null) return 0;
		if (node.left == null && node.right == null)
			return 1;
		if (node.left == null)
			return 1 + minDepth(node.right);
		if (node.right == null)
			return 1 + minDepth(node.left);
		return 1 + Math.min(minDepth(node.left), minDepth(node.right));
	}
}
