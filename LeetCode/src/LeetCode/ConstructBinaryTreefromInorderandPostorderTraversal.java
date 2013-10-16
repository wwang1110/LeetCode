package LeetCode;

public class ConstructBinaryTreefromInorderandPostorderTraversal {
	//Given inorder and postorder traversal of a tree, construct the binary tree.

	//Note:
	//You may assume that duplicates do not exist in the tree.
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
    	if (inorder.length == 0)
    		return null;
    	return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }	
    private TreeNode buildTree(int[] inorder, int i1, int i2, int[] postorder, int j1, int j2)
    {
    	if (i1 > i2)
    		return null;
    	if (i1 == i2 && j1== j2 && inorder[i1] == postorder[i2])
    		return new TreeNode(inorder[i1]);
    	int i;
    	for (i = i1; i < i2; i++)
    		if (inorder[i] == postorder[j2])
    			break;
    	int len = i - 1 - i1;
    	TreeNode node = new TreeNode(postorder[j2]);
    	node.left = buildTree(inorder, i1, i1 + len, postorder, j1, j1 + len);
    	node.right = buildTree(inorder, i + 1, i2, postorder, j1 + len + 1, j2 - 1);
    	return node;
    }
}
