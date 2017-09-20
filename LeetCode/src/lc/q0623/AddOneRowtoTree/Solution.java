/* 
Given the root of a binary tree, then value v and depth d, you need to add a row of nodes with value v at the given depth d. The root node is at depth 1.

The adding rule is: given a positive integer depth d, for each NOT null tree nodes N in depth d-1, create two tree nodes with value v as N's left subtree root and right subtree root. And N's original left subtree should be the left subtree of the new left subtree root, its original right subtree should be the right subtree of the new right subtree root. If depth d is 1 that means there is no depth d-1 at all, then create a tree node with value v as the new root of the whole original tree, and the original tree is the new root's left subtree.

Example 1:
Input: 
A binary tree as following:
       4
     /   \
    2     6
   / \   / 
  3   1 5   

v = 1

d = 2

Output: 
       4
      / \
     1   1
    /     \
   2       6
  / \     / 
 3   1   5   

Example 2:
Input: 
A binary tree as following:
      4
     /   
    2    
   / \   
  3   1    

v = 1

d = 3

Output: 
      4
     /   
    2
   / \    
  1   1
 /     \  
3       1
Note:
The given d is in range [1, maximum depth of the given tree + 1].
The given binary tree has at least one tree node.
 */
package lc.q0623.AddOneRowtoTree;

import lc.TreeNode;

public class Solution {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(d==1)
        {
        	TreeNode newroot=new TreeNode(v);
        	newroot.left=root;
        	return newroot;
        }
        addRow(root, 2, v, d);
        return root;
    }

	private void addRow(TreeNode node, int l, int v, int d) {
		if(node==null)
			return;
		if(l==d)
		{
			TreeNode left=node.left;
			TreeNode right=node.right;
			node.left=new TreeNode(v);
			node.left.left=left;
			node.right=new TreeNode(v);
			node.right.right=right;
			return;
		}
		addRow(node.left, l+1, v, d);
		addRow(node.right, l+1, v, d);
	}
}
