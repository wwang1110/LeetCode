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
    public boolean isValidBST(TreeNode root) {
    	ArrayList<Integer> A = new ArrayList<Integer>();
    	serialize(root, A);
    	for (int i = 0; i < A.size() - 1; i++)
    		if (A.get(i) > A.get(i+1)) return false;
    	return true;
    }	
    private void serialize(TreeNode node, ArrayList<Integer> A)
    {
    	if (node != null)
    	{
    		serialize(node.left, A);
    		A.add(node.val);
    		serialize(node.right, A);
    	}
    }
}
