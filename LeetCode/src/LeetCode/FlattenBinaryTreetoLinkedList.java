package LeetCode;

import java.util.Stack;

public class FlattenBinaryTreetoLinkedList {
	//Given a binary tree, flatten it to a linked list in-place.

	//For example,
	//Given

	//         1
	//        / \
	//       2   5
	//      / \   \
	//     3   4   6
	//The flattened tree should look like:
	//   1
	//    \
	//     2
	//      \
	//       3
	//        \
	//         4
	//          \
	//           5
	//            \
	//             6
	//click to show hints.

	//Hints:
	//If you notice carefully in the flattened tree, each node's right child points to the next node of a pre-order traversal.
    public void flatten(TreeNode root) {
    	if (root == null)
    		return;
    	
    	flip(root);
    	
    	Stack<TreeNode> stack = new Stack<TreeNode>();
 
    	TreeNode node = root;
    	TreeNode tail = root;
    	while (node != null)
    	{
    		tail = node;
    		if (node.left != null)
    			stack.push(node.left);
   			node = node.right;
   			
   			if (node == null && stack.isEmpty() == false)
   			{
   				node = stack.pop();
   				tail.right = node;
   			}
    	}
    }	
    
    private void flip(TreeNode node)
    {
    	if (node == null)
    		return;
    	flip(node.left);
    	flip(node.right);
    	
    	TreeNode child = node.left; 
    	node.left = node.right;
    	node.right = child;
    	
    }
    
}
