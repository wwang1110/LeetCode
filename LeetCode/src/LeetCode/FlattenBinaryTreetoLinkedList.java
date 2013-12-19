package LeetCode;

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
    	
    	flatten(root.left);
    	flatten(root.right);
    	
    	TreeNode node = root.left;
    	while (node != null && node.right != null)
    		node = node.right;
    	if (node != null)
    	{
    		node.right = root.right;
    		root.right = root.left;
    		root.left = null;
    	}
    }	
    
}
