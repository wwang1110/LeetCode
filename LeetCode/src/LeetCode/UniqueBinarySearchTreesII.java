package LeetCode;

import java.util.ArrayList;

public class UniqueBinarySearchTreesII {
	//Given n, generate all structurally unique BST's (binary search trees) that store values 1...n.

	//For example,
	//Given n = 3, your program should return all 5 unique BST's shown below.

	//   1         3     3      2      1
	//    \       /     /      / \      \
	//     3     2     1      1   3      2
	//    /     /       \                 \
	//   2     1         2                 3
	//confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.

	//OJ's Binary Tree Serialization:
	//The serialization of a binary tree follows a level order traversal, where '#' signifies a path terminator where no node exists below.

	//Here's an example:
	//   1
	//  / \
	// 2   3
	//    /
	//   4
	//    \
	//     5
	//The above binary tree is serialized as "{1,2,3,#,#,4,#,#,5}".
	private void buildTree(StringBuilder sb, int start, int end)
	{
		if (start > end)
			sb.append("#");
		for (int i = start; i <= end; i++)
		{
			StringBuilder t = new StringBuilder(sb);
			t.append(i);
			buildTree(t, start, i - 1);
			buildTree(t, i + 1, end);
		}
	}
	
    public ArrayList<TreeNode> generateTrees(int n) {
    	ArrayList<TreeNode> trees = new ArrayList<TreeNode>();
    	return trees;
    }	
}
