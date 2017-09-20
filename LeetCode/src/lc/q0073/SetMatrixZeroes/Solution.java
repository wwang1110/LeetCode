//Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.

package lc.q0073.SetMatrixZeroes;

public class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstrow = false;
        boolean firstcol = false;
        
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0; i < m; i++)
        	if (matrix[i][0] == 0)
        	{
        		firstcol = true;
        		break;
        	}
        for(int j = 0; j < n; j++)
        	if (matrix[0][j] == 0)
        	{
        		firstrow = true;
        		break;
        	}
        
        for(int i = 0; i < m; i++)
        	for (int j = 0; j < n; j++)
        		if (matrix[i][j] == 0)
        		{
        			matrix[i][0] = 0;
        			matrix[0][j] = 0;
        		}
        
        for(int i = 1; i < m; i++)
        	for (int j = 1; j < n; j++)
        		if (matrix[i][0] == 0 ||matrix[0][j] == 0)
        			matrix[i][j] = 0;
        
        if (firstcol == true)
        	for(int i = 0; i < matrix.length; i++)
        		matrix[i][0] = 0;
        
        if (firstrow == true)
        	for (int j = 0; j < matrix[0].length; j++)
        		matrix[0][j] = 0;
    }
}
