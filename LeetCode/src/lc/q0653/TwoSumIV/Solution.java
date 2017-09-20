/*
Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their sum is equal to the given target.

Example 1:
Input: 
    5
   / \
  3   6
 / \   \
2   4   7

Target = 9

Output: True
Example 2:
Input: 
    5
   / \
  3   6
 / \   \
2   4   7

Target = 28

Output: False
 */
package lc.q0653.TwoSumIV;

import java.util.*;

import lc.TreeNode;

public class Solution {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> nums=new ArrayList<Integer>();
        travelTree(root, nums);
        for(int i=0;i<nums.size();i++)
        	if(2*nums.get(i)!=k&&findNumber(root, k-nums.get(i)))
        		return true;
        return false;
    }

	private boolean findNumber(TreeNode root, int num) {
		if(root==null)
			return false;
		if(root.val==num)
			return true;
		if(num<root.val)
			return findNumber(root.left, num);
		else
			return findNumber(root.right, num);
	}

	private void travelTree(TreeNode root, List<Integer> nums) {
		if(root==null)
			return;
		travelTree(root.left, nums);
		nums.add(root.val);
		travelTree(root.right, nums);
	}
}
