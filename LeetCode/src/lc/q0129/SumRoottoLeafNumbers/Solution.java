/* Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
 * 
 * An example is the root-to-leaf path 1->2->3 which represents the number 123.
 * 
 * Find the total sum of all root-to-leaf numbers.
 * 
 * For example,

    1
   / \
  2   3
 * The root-to-leaf path 1->2 represents the number 12.
 * The root-to-leaf path 1->3 represents the number 13.
 * 
 * Return the sum = 12 + 13 = 25.
 * 
 */

package lc.q0129.SumRoottoLeafNumbers;

import java.util.*;

import lc.TreeNode;

public class Solution {
    public int sumNumbers(TreeNode root) {
        List<Integer> nums = new ArrayList<Integer>();
        
        generateNumbers(root, 0, nums);
        
        int sum = 0;
        for (int num : nums)
        	sum += num;
        
        return sum;
    }

	private void generateNumbers(TreeNode root, int val, List<Integer> nums) {
		if (root == null)
			return;
		int num = val * 10 + root.val;
		if (root.left == null && root.right == null)
		{
			nums.add(num);
			return;
		}
		
		if (root.left != null)
			generateNumbers(root.left, num, nums);
		
		if (root.right != null)
			generateNumbers(root.right, num, nums);
			
	}
}
