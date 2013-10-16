package LeetCode;

public class SumRoottoLeafNumbers {
	//Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

	//An example is the root-to-leaf path 1->2->3 which represents the number 123.

	//Find the total sum of all root-to-leaf numbers.

	//For example,

	//    1
	//   / \
	//  2   3
	//The root-to-leaf path 1->2 represents the number 12.
	//The root-to-leaf path 1->3 represents the number 13.

	//Return the sum = 12 + 13 = 25.
	private int sum = 0;
    public int sumNumbers(TreeNode root) {
    	if(root == null)
    		return 0;
    	
    	sum = 0;
    	sumNumbers(root, 0);
    	return sum;
    }	
    
    private void sumNumbers(TreeNode node, int num) {
    	if (node == null)
    		return;
    	
    	num = num * 10 + node.val;
    	if (node.left == null && node.right == null)
    		sum += num;
    	if (node.left != null)
    		sumNumbers(node.left, num);
    	if (node.right != null)
    		sumNumbers(node.right, num);
    }	
}
