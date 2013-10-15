package LeetCode;

public class SymmetricTree {
	//Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

	//For example, this binary tree is symmetric:

	//    1
	//   / \
	//  2   2
	// / \ / \
	//3  4 4  3
	//But the following is not:
	//    1
	//   / \
	//  2   2
	//   \   \
	//   3    3
	//Note:
	//Bonus points if you could solve it both recursively and iteratively.

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
    public boolean isSymmetric(TreeNode root) {
    	return isSymmetric(root, root);
    }	
    private boolean isSymmetric(TreeNode node1, TreeNode node2) {
    	if (node1 == null && node2 == null)
    		return true;
    	else if(node1 != null && node2 != null && node1.val == node2.val)
    		return isSymmetric(node1.left, node2.right) && isSymmetric(node1.right, node2.left);
    	return false;
    }
}
