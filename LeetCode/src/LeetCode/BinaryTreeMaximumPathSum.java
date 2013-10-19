package LeetCode;

public class BinaryTreeMaximumPathSum {
	//Given a binary tree, find the maximum path sum.

	//The path may start and end at any node in the tree.

	//For example:
	//Given the below binary tree,

	//       1
	//      / \
	//     2   3
	//Return 6.
    public int maxPathSum(TreeNode node) {
    	if (node == null)
    		return 0;
        int sum = Math.max(maxPathSum(node.left), maxPathSum(node.right));
        return Math.max(sum, maxBranch(node.left) + maxBranch(node.right) + node.val);
    }	
    
    private int maxBranch(TreeNode node)
    {
    	if (node == null)
    		return 0;
    	int sum = node.val + Math.max(maxBranch(node.left),maxBranch(node.right));
    	return sum < 0 ? 0 : sum;
    }
}
