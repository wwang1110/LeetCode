/* Given inorder and postorder traversal of a tree, construct the binary tree.
 * 
 * Note:
 * 
 * You may assume that duplicates do not exist in the tree.
 * 
 */
package lc.q0106.ConstructBinaryTreefromInorderandPostorderTraversal;

import lc.TreeNode;

public class Solution {
	
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(0, inorder.length-1, 0, postorder.length-1, inorder, postorder);
    }

	private TreeNode buildTree(int x1, int x2, int y1, int y2, int[] inorder, int[] postorder) {
		
		if (x1 > x2 || y1 > y2)
			return null;
		
		if (x1 == x2 && y1 == y2)
			return new TreeNode(inorder[x1]);
		
		int r = x1;
		
		while (r <= x2 && inorder[r] != postorder[y2]) r++;
		
		TreeNode node = new TreeNode(postorder[y2]);
		
		int leftlen = r - x1;
		int rightlen = x2 - r;
		node.left = buildTree(x1, x1+leftlen-1, y1, y1+leftlen-1, inorder, postorder);
		node.right = buildTree(x2-rightlen+1, x2, y2-rightlen, y2-1, inorder, postorder);
		return node;
	}
}
