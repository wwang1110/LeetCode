package LeetCode;

import java.util.ArrayList;

public class ValidateBinarySearchTree {
	//Given a binary tree, determine if it is a valid binary search tree (BST).

	//Assume a BST is defined as follows:

	//The left subtree of a node contains only nodes with keys less than the node's key.
	//The right subtree of a node contains only nodes with keys greater than the node's key.
	//Both the left and right subtrees must also be binary search trees.
	//confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
	
	//OJ's Binary Tree Serialization:
	//The serialization of a binary tree follows a level order traversal, where '#' signifies a path terminator where no node exists below.

	//Here's an example:
	//   1
	//  / \
	// 2   3
	//    /
	//   4
	//    \
	//     5
	//The above binary tree is serialized as "{1,2,3,#,#,4,#,#,5}".
    public boolean isValidBST(TreeNode node) {
    	return isValid(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    private boolean isValid(TreeNode node, int minValue, int maxValue) {
    	
    	if (node == null)
    		return true;
    	
    	if (node.val <= minValue || node.val >= maxValue)
    		return false;
    	
		return isValid(node.left, minValue, node.val) && isValid(node.right, node.val, maxValue);
	}
}
