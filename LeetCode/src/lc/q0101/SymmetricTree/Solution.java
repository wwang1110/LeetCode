/* Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * 
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
 * But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3
 * Note:
 * Bonus points if you could solve it both recursively and iteratively.
 * 
 */

package lc.q0101.SymmetricTree;

import lc.TreeNode;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
    	if (root == null)
    		return true;
    	
    	return symmetricTree(root.left, root.right);
    }

	private boolean symmetricTree(TreeNode left, TreeNode right) {
		if (left == null && right == null)
			return true;
		
		if (left != null && right != null && left.val == right.val)
			return symmetricTree(left.left, right.right) && symmetricTree(left.right, right.left);
		
		return false;
	}
}
