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
	private int ret;
    public int maxPathSum(TreeNode root) {
    	ret = Integer.MIN_VALUE;
    	getMaxPath(root);
    	return ret;
    }
    
    private int getMaxPath(TreeNode node)
    {
    	if (node == null)
    		return 0;
    	
        int left = getMaxPath(node.left);
        int right = getMaxPath(node.right);
        int sum = Math.max(node.val, Math.max(left, right) + node.val);
        ret = Math.max(ret, sum);
        ret = Math.max(ret, left + right + node.val);
    	return sum > 0 ? sum : 0;
    }
}
