/* Given a binary tree, flatten it to a linked list in-place.
 * 
 * For example,
 * 
 * Given

         1
        / \
       2   5
      / \   \
     3   4   6
 * The flattened tree should look like:
   1
    \
     2
      \
       3
        \
         4
          \
           5
            \
             6
 * 
 */

package lc.q0114.FlattenBinaryTreetoLinkedList;

import lc.TreeNode;

public class Solution {
    public void flatten(TreeNode root) {
        
    	if (root == null)
    		return;
    	
    	flatTree(root);
    }

	private TreeNode flatTree(TreeNode root) {
		if (root == null)
			return null;
		TreeNode left = flatTree(root.left);
		TreeNode right = flatTree(root.right);
		
		root.left = null;
		root.right = left;
		TreeNode node = root;
		while(node.right != null)
			node = node.right;
		node.right = right;
		
		return root;
			
	}
}
