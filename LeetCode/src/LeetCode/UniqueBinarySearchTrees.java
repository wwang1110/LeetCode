package LeetCode;

public class UniqueBinarySearchTrees {
	//Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

	//For example,
	//Given n = 3, there are a total of 5 unique BST's.

	//   1         3     3      2      1
	//    \       /     /      / \      \
	//     3     2     1      1   3      2
	//    /     /       \                 \
	//   2     1         2                 3
	
    public int numTrees(int n) {
    	int cnt[] = new int[n + 1];
    	cnt[1] = 1;
    	for (int i = 2; i <= n; i++)
    	{
    		for (int j = 1; j <= i; j++)
    			if (j == 1 || j == i)
    				cnt[i] += cnt[i-1];
    			else
    				cnt[i] += cnt[j - 1] * cnt[i - j]; 
    	}
    	return cnt[n];
    }
}
