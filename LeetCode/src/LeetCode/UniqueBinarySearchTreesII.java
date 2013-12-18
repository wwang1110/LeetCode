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
    public ArrayList<TreeNode> generateTrees(int n) {
    	if (n == 0)
    	{
    		ArrayList<TreeNode> ret = new ArrayList<TreeNode>();
    		ret.add(null);
    		return ret;
    	}
    	return generateTrees(1, n);
    }
    
    private ArrayList<TreeNode> generateTrees(int begin, int end)
    {
    	ArrayList<TreeNode> r = new ArrayList<TreeNode>(); 
    	for (int i = begin; i <= end; i++)
    	{
    		ArrayList<TreeNode> first_part = generateTrees(begin, i - 1);
    		ArrayList<TreeNode> second_part = generateTrees(i + 1, end);

    		if (first_part.size() != 0 && second_part.size() != 0)
    		{
				for(TreeNode left : first_part)
					for (TreeNode right : second_part)
					{
						TreeNode n = new TreeNode(i);
						n.left = left;
						n.right = right;
						r.add(n);
					}
    		}
    		else if (first_part.size() != 0)
    		{
				for(TreeNode left : first_part)
				{
					TreeNode n = new TreeNode(i);
					n.left = left;
					r.add(n);
				}
    		}
    		else if (second_part.size() != 0)
    		{
				for (TreeNode right : second_part)
				{
					TreeNode n = new TreeNode(i);
					n.right = right;
					r.add(n);
				}
    		}
    		else
    		{
				r.add(new TreeNode(i));
    		}
    	}
    	return r;
    }

}
