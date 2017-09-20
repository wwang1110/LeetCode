/* A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * 
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * 
 * How many possible unique paths are there?
 * 
 * Note: m and n will be at most 100.
 */
package lc.q0062.UniquePaths;

public class Solution {
    public int uniquePaths(int m, int n) {
    	if (m == 0 || n == 0)
    		return 0;
    	
    	int[][] ftb = new int[m][n];
    	ftb[0][0] = 1;
    	
    	for (int i = 0; i < m; i++)
    		for (int j = 0; j < n; j ++)
    		{
    			if (i - 1 >= 0)
    				ftb[i][j] += ftb[i-1][j];
    			if (j - 1 >= 0)
    				ftb[i][j] += ftb[i][j-1];
    		}
    	
    	return ftb[m-1][n-1];
    }
}
