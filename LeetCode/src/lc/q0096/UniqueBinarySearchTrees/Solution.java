/* Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
 * 
 * For example,
 * Given n = 3, there are a total of 5 unique BST's.

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3
 * 
 */

package lc.q0096.UniqueBinarySearchTrees;

public class Solution {
    public int numTrees(int n) {
    	if (n == 1)
    		return 1;
        int[] tb = new int[n+1];
        tb[0] = 1;
        tb[1] = 1;
        for (int i = 2; i <= n; i++)
        {
        	int sum = 0;
        	for (int k = 1; k <= i; k++)
        		sum += tb[k-1] * tb[i-k];
        	tb[i] = sum;
        }
        return tb[n];
    }
}
