/* Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
 * For example:
 * Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
 * return
 * [
 *    [5,4,11,2],
 *    [5,8,4,5]
 * ]
 * 
 */

package lc.q0113.PathSumII;

import lc.TreeNode;
import java.util.*;

public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	
    	if (root == null)
    		return res;
    	
    	generatePath(root, sum, new ArrayList<Integer>(), res);
    	
    	return res;
    }

	private void generatePath(TreeNode root, int sum, ArrayList<Integer> path, List<List<Integer>> res) {
		
		if (root != null && root.left == null && root.right == null && sum == root.val)
		{
			path.add(root.val);
			res.add(new ArrayList<Integer>(path));
			path.remove(path.size()-1);
			return;
		}
		
		if (root != null && root.left != null)
		{
			path.add(root.val);
			generatePath(root.left, sum-root.val, path, res);
			path.remove(path.size()-1);
		}
		if (root != null && root.right != null)
		{
			path.add(root.val);
			generatePath(root.right, sum-root.val, path, res);
			path.remove(path.size()-1);
		}
	}
}
