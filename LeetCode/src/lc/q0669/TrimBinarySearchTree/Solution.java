/*
Given a binary search tree and the lowest and highest boundaries as L and R, trim the tree so that all its elements lies in [L, R] (R >= L). You might need to change the root of the tree, so the result should return the new root of the trimmed binary search tree.

Example 1:
Input: 
    1
   / \
  0   2

  L = 1
  R = 2

Output: 
    1
      \
       2
Example 2:
Input: 
    3
   / \
  0   4
   \
    2
   /
  1

  L = 1
  R = 3

Output: 
      3
     / 
   2   
  /
 1
 */
package lc.q0669.TrimBinarySearchTree;

import lc.TreeNode;

public class Solution {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        TreeNode node=trimLeft(root,L);
        return trimRight(node, R);
    }

	private TreeNode trimRight(TreeNode root, int r) {
		if(root==null)
			return null;
		if(root.val>r)
			return trimRight(root.left, r);
		else if(root.val<r)
		{
			root.right=trimRight(root.right, r);
			return root;
		}
		else
		{
			root.right=null;
			return root;
		}
	}

	private TreeNode trimLeft(TreeNode root, int l) {
		if(root==null)
			return null;
		if(root.val<l)
			return trimLeft(root.right, l);
		else if(root.val>l)
		{
			root.left=trimLeft(root.left, l);
			return root;
		}
		else
		{
			root.left=null;
			return root;
		}
	}

}
