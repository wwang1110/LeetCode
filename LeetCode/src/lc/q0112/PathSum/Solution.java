/* Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 * 
 * For example:
 * 
 * Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 * 
 */

package lc.q0112.PathSum;

import lc.TreeNode;

public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
    	
    	if (root != null && root.left == null && root.right == null && sum == root.val)
    		return true;
    	
    	boolean res = false;
    	if (root != null && root.left != null)
    		res = res || hasPathSum(root.left, sum - root.val);
    	
    	if (root != null && root.right != null)
    		res = res || hasPathSum(root.right, sum - root.val);
    		
    	return res;
    }
}
