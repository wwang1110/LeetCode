/* Given preorder and inorder traversal of a tree, construct the binary tree.
 * 
 * Note:
 * 
 * You may assume that duplicates do not exist in the tree.
 * 
 */

package lc.q0105.ConstructBinaryTreefromPreorderandInorderTraversal;

import lc.TreeNode;

public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(0, preorder.length - 1, 0, inorder.length - 1, preorder, inorder);
    }

	private TreeNode buildTree(int x1, int x2, int y1, int y2, int[] preorder, int[] inorder) {
		
		if (x1 > x2)
			return null;
		
		if (x1 == x2 && y1 == y2)
			return new TreeNode(preorder[x1]);
	
		int r = y1;
		while (r <= y2 && inorder[r] != preorder[x1]) r ++;
		
		int leftlen = r - y1;
		int rightlen = y2 - r;
		
		TreeNode n = new TreeNode(preorder[x1]);
		n.left = buildTree(x1+1, x1+leftlen, y1, y1+leftlen-1, preorder, inorder);
		n.right = buildTree(x2-rightlen+1, x2, y2-rightlen+1, y2, preorder, inorder);
		
		return n;
	}
}
