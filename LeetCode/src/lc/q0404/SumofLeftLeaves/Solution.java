/* Find the sum of all left leaves in a given binary tree.
 * 
 * Example:

    3
   / \
  9  20
    /  \
   15   7

 * There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 * 
 */

package lc.q0404.SumofLeftLeaves;

import lc.TreeNode;

public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
    	if (root==null)
    		return 0;
        return sumOfLeftLeaves(root.left, true) + sumOfLeftLeaves(root.right, false);
    }

	private int sumOfLeftLeaves(TreeNode node, boolean isLeft) {
		if(node==null)
			return 0;
		if (node.left==null&&node.right==null&&isLeft==true)
			return node.val;
		int sum = 0;
		if(node.left != null)
			sum+= sumOfLeftLeaves(node.left, true);
		if(node.right != null)
			sum+= sumOfLeftLeaves(node.right, false);
		return sum;
	}
}
