/* Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.
 * 
 * For example, given the following matrix:
 * 1 0 1 0 0
 * 1 0 1 1 1
 * 1 1 1 1 1
 * 1 0 0 1 0
 * Return 4.
 * 
 */

package lc.q0221.MaximalSquare;

public class Solution {
    public int maximalSquare(char[][] matrix) {
    	if (matrix.length == 0 ||matrix[0].length == 0)
    		return 0;
    	
        int[][] msq = new int[matrix.length][matrix[0].length];
        
        int maxsql = 0;
        for (int i = 0; i < matrix.length; i++)
        	for (int j = 0; j < matrix[0].length; j++)
        	{
        		if (i == 0 || j == 0)
                {
        			msq[i][j] = matrix[i][j]-'0';
        			maxsql = Math.max(maxsql, msq[i][j]);
                }
        		else if (matrix[i][j] == '0')
        			msq[i][j] = 0;
        		else
        		{
        			int len = msq[i-1][j-1];
        			int lenx = 0;
        			for(int k = j; k >= 0; k--)
        			{
        				if (matrix[i][k] == '0')
        					break;
        				lenx ++;
        			}
        			int leny = 0;
        			for(int k = i; k >= 0; k--)
        			{
        				if (matrix[k][j] == '0')
        					break;
        				leny ++;
        			}
        			msq[i][j] = Math.min(len + 1, Math.min(lenx, leny));
        			maxsql = Math.max(maxsql, msq[i][j]);
        		}
        	}
        return maxsql * maxsql;
    }
}
