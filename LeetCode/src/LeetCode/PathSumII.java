package LeetCode;

import java.util.ArrayList;

public class PathSumII {
	//Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

	//For example:
	//Given the below binary tree and sum = 22,
	//              5
	//             / \
	//            4   8
	//           /   / \
	//          11  13  4
	//         /  \    / \
	//        7    2  5   1
	//return
	//[
	//   [5,4,11,2],
	//   [5,8,4,5]
	//]
	private ArrayList<ArrayList<Integer>> ret = null;
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
    	ret = new ArrayList<ArrayList<Integer>>();
    	ArrayList<Integer> path = new ArrayList<Integer>();
    	if (root != null)
    		pathSum(root, path, sum);
    	return ret;
    }
    @SuppressWarnings("unchecked")
	private void pathSum(TreeNode node, ArrayList<Integer> path, int sum)
    {
		path.add(node.val);
    	if (node.left == null && node.right == null && node.val == sum)
    		ret.add((ArrayList<Integer>)path.clone());
    	
    	if (node.left != null)
    		pathSum(node.left, path, sum - node.val);
    	
    	if (node.right != null)
    		pathSum(node.right, path, sum - node.val);
    	
    	path.remove(path.size() - 1);
    }
}
