package LeetCode;

import java.util.Arrays;

public class ConstructBinaryTreefromPreorderandInorderTraversal {
	//Given preorder and inorder traversal of a tree, construct the binary tree.

	//Note:
	//You may assume that duplicates do not exist in the tree.
	
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    	return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }	
    private TreeNode buildTree(int[] preorder, int p1, int p2, int[] inorder, int i1, int i2) {
    	if (p1> p2)
    		return null;
    	int idx = 0;
    	for (int i = i1; i <= i2; i++)
    		if (preorder[p1] == inorder[i])
    			{idx = i;break;}
    	
    	int left = (idx - 1) - i1;
    	int right = i2 - (idx + 1);
    	
    	TreeNode node = new TreeNode(preorder[p1]);
    	node.left = buildTree(preorder, p1 + 1, p1 + 1 + left, inorder, i1 , i1 + left);
    	node.right = buildTree(preorder, p2 - right, p2, inorder, i2 - right , i2);
    	return node;
    }
}
