package LeetCode;

public class ConvertSortedArraytoBinarySearchTree {
	//Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
    public TreeNode sortedArrayToBST(int[] num) {
    	if (num.length == 0)
    		return null;
    	return sortedArrayToBST(num, 0, num.length - 1);
    }
    private TreeNode sortedArrayToBST(int[] num, int start, int end)
    {
    	if (start == end)
    		return new TreeNode(num[start]);
    	if (start + 1 == end)
    	{
    		TreeNode node = new TreeNode(num[end]);
    		node.left = new TreeNode(num[start]);
    		return node;
    	}
    	
    	int mid = (start + end) / 2;
    	TreeNode node = new TreeNode(num[mid]);
    	node.left = sortedArrayToBST(num, start, mid - 1);
    	node.right = sortedArrayToBST(num, mid + 1, end);
    	return node;
    }
}
