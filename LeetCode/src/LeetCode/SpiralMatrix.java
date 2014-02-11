package LeetCode;

import java.util.ArrayList;

public class SpiralMatrix {
	//Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

	//For example,
	//Given the following matrix:

	//[
	//[ 1, 2, 3 ],
	//[ 4, 5, 6 ],
	//[ 7, 8, 9 ]
	//]
	//You should return [1,2,3,6,9,8,7,4,5].

	private ArrayList<Integer> ret = null;
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
    	ret = new ArrayList<Integer>();
    	if (matrix.length == 0 || matrix[0].length == 0)
    		return ret;

    	int n = matrix.length;
    	int m = matrix[0].length;
    	spiralWalk(matrix, 0, 0, m, n);
    	return ret;
        
    }
    
    private void spiralWalk(int[][] matrix, int row, int col, int m, int n)
    {
    	if (m <= 0 || n <= 0)
    		return;
    	
    	if (m == 1 && n == 1)
    		ret.add(matrix[row][col]);
    	else if (n == 1)
    		for (int i = 1;i <= m;i++)
    			ret.add(matrix[row][col++]);
    	else if (m == 1)
    		for (int i = 1;i <= n;i++)
    			ret.add(matrix[row++][col]);
    	else
    	{
    		for (int i = 1;i < m;i++)
    			ret.add(matrix[row][col++]);
    		for (int i = 1;i < n;i++)
    			ret.add(matrix[row++][col]);
    		for (int i = 1;i < m;i++)
    			ret.add(matrix[row][col--]);
    		for (int i = 1;i < n;i++)
    			ret.add(matrix[row--][col]);
    		spiralWalk(matrix, row + 1, col + 1, m - 2, n - 2);
    	}
    }
}
