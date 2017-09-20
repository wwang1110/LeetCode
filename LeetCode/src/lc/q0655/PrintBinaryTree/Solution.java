/*
Print a binary tree in an m*n 2D string array following these rules:

The row number m should be equal to the height of the given binary tree.
The column number n should always be an odd number.
The root node's value (in string format) should be put in the exactly middle of the first row it can be put. The column and the row where the root node belongs will separate the rest space into two parts (left-bottom part and right-bottom part). You should print the left subtree in the left-bottom part and print the right subtree in the right-bottom part. The left-bottom part and the right-bottom part should have the same size. Even if one subtree is none while the other is not, you don't need to print anything for the none subtree but still need to leave the space as large as that for the other subtree. However, if two subtrees are none, then you don't need to leave space for both of them.
Each unused space should contain an empty string "".
Print the subtrees following the same rules.
Example 1:
Input:
     1
    /
   2
Output:
[["", "1", ""],
 ["2", "", ""]]
Example 2:
Input:
     1
    / \
   2   3
    \
     4
Output:
[["", "", "", "1", "", "", ""],
 ["", "2", "", "", "", "3", ""],
 ["", "", "4", "", "", "", ""]]
Example 3:
Input:
      1
     / \
    2   5
   / 
  3 
 / 
4 
Output:

[["",  "",  "", "",  "", "", "", "1", "",  "",  "",  "",  "", "", ""]
 ["",  "",  "", "2", "", "", "", "",  "",  "",  "",  "5", "", "", ""]
 ["",  "3", "", "",  "", "", "", "",  "",  "",  "",  "",  "", "", ""]
 ["4", "",  "", "",  "", "", "", "",  "",  "",  "",  "",  "", "", ""]]
Note: The height of binary tree is in the range of [1, 10].
 */

package lc.q0655.PrintBinaryTree;

import java.util.*;

import lc.TreeNode;

public class Solution {
    public List<List<String>> printTree(TreeNode root) {
        int M=treeHeight(root);
        int N=(int)Math.pow(2, M)-1;
        String[][] tm=new String[M][N];
        for(int i=0;i<M;i++)
            for(int j=0;j<N;j++)
                tm[i][j]="";
        fillTree(root, 0, 0, N-1, tm);
        List<List<String>> ret=new ArrayList<List<String>>();
        for(int i=0;i<M;i++)
        	ret.add(Arrays.asList(tm[i]));
        return ret;
    }

	private void fillTree(TreeNode root, int row, int l, int r, String[][] tm) {
		if(root==null)
			return;
		int mid=(r+l)/2;
		tm[row][mid]=Integer.toString(root.val);
		fillTree(root.left, row+1, l, mid-1,tm);
		fillTree(root.right, row+1, mid+1, r,tm);
	}

	private int treeHeight(TreeNode root) {
		if(root==null)
			return 0;
		return 1+Math.max(treeHeight(root.left), treeHeight(root.right));
	}
}
