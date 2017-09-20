/*
Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:

The root is the maximum number in the array.
The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
Construct the maximum tree by the given array and output the root node of this tree.

Example 1:
Input: [3,2,1,6,0,5]
Output: return the tree root node representing the following tree:

      6
    /   \
   3     5
    \    / 
     2  0   
       \
        1
Note:
The size of the given array will be in the range [1,1000].
 */
package lc.q0654.MaximumBinaryTree;

import lc.TreeNode;

public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(0, nums.length, nums);
    }

	private TreeNode constructMaximumBinaryTree(int l, int r, int[] nums) {
		if(l>=r)
			return null;
		int maxIdx=l;
		for(int i=l;i<r;i++)
			if(nums[i]>nums[maxIdx])
				maxIdx=i;
		TreeNode node=new TreeNode(nums[maxIdx]);
		node.left=constructMaximumBinaryTree(l, maxIdx, nums);
		node.right=constructMaximumBinaryTree(maxIdx+1, r, nums);
		return node;
	}
}
