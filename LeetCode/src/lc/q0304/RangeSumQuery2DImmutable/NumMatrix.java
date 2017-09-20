/* Given a 2D matrix matrix, find the sum of the elements inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).
 * 
 * Range Sum Query 2D
 * The above rectangle (with the red border) is defined by (row1, col1) = (2, 1) and (row2, col2) = (4, 3), which contains sum = 8.
 * 
 * Example:
 * Given matrix = 
 * [
 *   [3, 0, 1, 4, 2],
 *   [5, 6, 3, 2, 1],
 *   [1, 2, 0, 1, 5],
 *   [4, 1, 0, 1, 7],
 *   [1, 0, 3, 0, 5]
 * ]
 * 
 * sumRegion(2, 1, 4, 3) -> 8
 * sumRegion(1, 1, 2, 2) -> 11
 * sumRegion(1, 2, 2, 4) -> 12
 * 
 * Note:
 * You may assume that the matrix does not change.
 * There are many calls to sumRegion function.
 * You may assume that row1 <= row2 and col1 <= col2.
 * 
 */

package lc.q0304.RangeSumQuery2DImmutable;

public class NumMatrix {
	int[][] sum; 
	
    public NumMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length==0)
            return;
        sum = new int[matrix.length][matrix[0].length];
        
        for (int i = 0; i < matrix.length;i++)
        {
        	int s = 0;
        	for (int j = 0; j < matrix[0].length; j++)
        	{
        		s += matrix[i][j];
        		if (i == 0)
        			sum[i][j] = s;
        		else
        			sum[i][j] = s + sum[i-1][j];
        	}
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (sum == null)
            return 0;
    	int a1=0, a2=0, a3=0;
    	if (row1 != 0)
    		a1 = sum[row1-1][col2];
    	if (col1 != 0)
    		a2 = sum[row2][col1-1];
    	if (row1 != 0 && col1 != 0)
    		a3 = sum[row1-1][col1-1];
    	return sum[row2][col2] - a1 - a2 + a3;
    }
    public static void main(String[] args)
    {
    	NumMatrix s = new NumMatrix(new int[][] {{3,0,1,4,2},{5,6,3,2,1},{1,2,0,1,5},{4,1,0,1,7},{1,0,3,0,5}});
    	s.sumRegion(2,1,4,3);
    }    
}
