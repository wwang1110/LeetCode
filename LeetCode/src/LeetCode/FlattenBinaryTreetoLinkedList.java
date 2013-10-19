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
        // Note: The Solution object is instantiated only once and is reused by each test case.
       Stack<TreeNode> stack = new Stack<TreeNode>();
       TreeNode node = root;
       stack.push(new TreeNode(-1));
       while (stack.isEmpty() == false)
       {
	       while (node.left != null)
	       {
	    	   if (node.right != null)
	    		   stack.push(node.right);
	    	   node.right = node.left;
	    	   node.left = null;
	    	   node = node.right;
	       }
       }
    }	
}
