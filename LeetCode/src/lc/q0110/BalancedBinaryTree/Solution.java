/* Given a binary tree, determine if it is height-balanced.
 * 
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 * 
 */

package lc.q0110.BalancedBinaryTree;

import lc.TreeNode;

public class Solution {
    public boolean isBalanced(TreeNode root) {
    	if (root == null)
    		return true;
    	
    	if (Math.abs(treeHeight(root.left)-treeHeight(root.right)) > 1)
    		return false;
    	
    	return isBalanced(root.left) && isBalanced (root.right);
    }

	private int treeHeight(TreeNode root) {
		if (root == null)
			return 0;
		
		return 1 + Math.max(treeHeight(root.left), treeHeight(root.right));
	}
}
