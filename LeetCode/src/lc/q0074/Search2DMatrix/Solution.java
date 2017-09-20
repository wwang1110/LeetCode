/* Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 * For example,
 * Consider the following matrix:
 * [
 *   [1,   3,  5,  7],
 *   [10, 11, 16, 20],
 *   [23, 30, 34, 50]
 * ]
 * Given target = 3, return true.
 * 
 */

package lc.q0074.Search2DMatrix;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    	
    	if (matrix.length == 0 || matrix[0].length == 0)
    		return false;
    	
    	int t = 0;
    	int b = matrix.length-1;
    	
    	int l = 0;
    	int r = matrix[0].length-1;
    	
    	while (t < b)
    	{
    		int m = (t + b) / 2;
    		if (matrix[t][0] <= target && target <= matrix[m][r])
    			b = m;
    		else if (matrix[m+1][0] <= target && target <= matrix[b][r])
    			t = m + 1;
    		else
    			return false;
    	}
    	
    	while (l < r)
    	{
    		int m = (l + r) / 2;
    		if (matrix[t][l] <= target && target <= matrix[t][m])
    			r = m;
    		else if (matrix[t][m+1] <= target && target <= matrix[t][r])
    			l = m + 1;
    		else
    			return false;
    	}
    	
    	return matrix[t][l] == target;
    }
}
