package LeetCode;

public class ConvertSortedListtoBinarySearchTree {
	//Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.
    public TreeNode sortedListToBST(ListNode head) {
    	if (head == null)
    		return null;

    	int len = 0;
    	ListNode node = head;
    	while (node != null)
    	{
    		node = node.next;
    		len++;
    	}
    	int nums[] = new int[len];
    	
    	node = head;
    	int i = 0;
    	while (node != null)
    	{
    		nums[i] = node.val;
    		node = node.next;
    		i++;
    	}
    	
    	return arrayToBST(nums, 0, nums.length - 1);
    }	
    
    private TreeNode arrayToBST(int[] nums, int i, int j)
    {
    	if (i > j)
    		return null;
    	
    	int mid = (i + j) / 2;
    	TreeNode node = new TreeNode(nums[mid]);
    	node.left = arrayToBST(nums, i, mid - 1);
    	node.right = arrayToBST(nums, mid + 1, j);
    	
    	return node;
    }
}
