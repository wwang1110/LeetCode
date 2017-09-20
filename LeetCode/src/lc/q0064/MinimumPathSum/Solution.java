/* Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.
 * 
 * Note: You can only move either down or right at any point in time.
 * 
 */

package lc.q0064.MinimumPathSum;

public class Solution {
    public int minPathSum(int[][] grid) {
    	int m = grid.length;
    	int n = grid[0].length;
    	
    	if (m == 0 || n == 0)
    		return 0;
    	
    	int[][] minpaths = new int[m][n];
    	
    	minpaths[0][0] = grid[0][0];
    	
    	for (int i = 0; i < m; i ++)
    		for (int j = 0; j < n; j++)
    		{
    			if (i < 1 && j < 1)
    				minpaths[i][j] = grid[i][j];
    			else if (i < 1)
    				minpaths[i][j] = grid[i][j] + minpaths[i][j-1];
    			else if (j < 1)
    				minpaths[i][j] = grid[i][j] + minpaths[i-1][j];
    			else
    				minpaths[i][j] = grid[i][j] + Math.min(minpaths[i-1][j], minpaths[i][j-1]);
    		}
    	
    	return minpaths[m-1][n-1];
    }
}
