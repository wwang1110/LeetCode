/* Given an m x n matrix of non-negative integers representing the height of each unit cell in a continent, the "Pacific ocean" touches the left and top edges of the matrix and the "Atlantic ocean" touches the right and bottom edges.
 * 
 * Water can only flow in four directions (up, down, left, or right) from a cell to another one with height equal or lower.
 * 
 * Find the list of grid coordinates where water can flow to both the Pacific and Atlantic ocean.
 * 
 * Note:
 * The order of returned grid coordinates does not matter.
 * Both m and n are less than 150.
 * Example:
 * 
 * Given the following 5x5 matrix:

  Pacific ~   ~   ~   ~   ~ 
       ~  1   2   2   3  (5) *
       ~  3   2   3  (4) (4) *
       ~  2   4  (5)  3   1  *
       ~ (6) (7)  1   4   5  *
       ~ (5)  1   1   2   4  *
          *   *   *   *   * Atlantic

 * Return:
 * [[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]] (positions with parentheses in above matrix).
 * 
 */
package lc.q0417.PacificAtlanticWaterFlow;

import java.util.*;

public class Solution {
    public List<int[]> pacificAtlantic(int[][] matrix) {
    	List<int[]> res = new ArrayList<int[]>();
    	if (matrix.length==0||matrix[0].length==0)
    		return res;
    	int m=matrix.length;
    	int n=matrix[0].length;
    	boolean[][] Pacific = new boolean[m][n];
    	boolean[][] Atlantic = new boolean[m][n];
    	
    	for(int i=0;i<m;i++)
    	{
    		flow(i,0,Pacific,matrix);
    		flow(i,n-1,Atlantic,matrix);
    	}
    	
    	for(int j=0;j<n;j++)
    	{
    		flow(0,j,Pacific,matrix);
    		flow(m-1,j,Atlantic,matrix);
    	}
    	
    	for(int i=0;i<m;i++)
    		for(int j=0;j<n;j++)
    			if(Pacific[i][j]&&Atlantic[i][j])
    				res.add(new int[] {i,j});
    	return res;
    }

	private void flow(int i, int j, boolean[][] mtb, int[][] matrix) {
		int m=mtb.length;
		int n=mtb[0].length;
		if(i<0||j<0||i>=m||j>=n||mtb[i][j]==true)
			return;
		mtb[i][j]=true;
		if(i>=1&&matrix[i][j]<=matrix[i-1][j])
			flow(i-1,j,mtb,matrix);
		if(i+1<m&&matrix[i][j]<=matrix[i+1][j])
			flow(i+1,j,mtb,matrix);
		if(j>=1&&matrix[i][j]<=matrix[i][j-1])
			flow(i,j-1,mtb,matrix);
		if(j+1<n&&matrix[i][j]<=matrix[i][j+1])
			flow(i,j+1,mtb,matrix);
	}
}
