/* You are given a binary tree in which each node contains an integer value.
 * 
 * Find the number of paths that sum to a given value.
 * The path does not need to start or end at the root or a leaf, but it must go downwards (traveling only from parent nodes to child nodes).
 * The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.
 * 
 * Example:
 * 
 * root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8

      10
     /  \
    5   -3
   / \    \
  3   2   11
 / \   \
3  -2   1

 * Return 3. The paths that sum to 8 are:
 * 1.  5 -> 3
 * 2.  5 -> 2 -> 1
 * 3. -3 -> 11
 * 
 */
package lc.q0437.PathSumIII;

import lc.TreeNode;

public class Solution {
	private int totals=0;
    public int pathSum(TreeNode root, int sum) {
        searchPath(root, false, 0, sum);
        return totals;
    }
	private void searchPath(TreeNode node, boolean b, int pathSum, int sum) {
		if(node==null)
			return;

		pathSum+=node.val;
		if(pathSum==sum)
			totals++;
		
		searchPath(node.left, true, pathSum, sum);
		searchPath(node.right, true, pathSum, sum);
		if(b==false)
		{
			searchPath(node.left, false, 0, sum);
			searchPath(node.right, false, 0, sum);
		}
	}
}
