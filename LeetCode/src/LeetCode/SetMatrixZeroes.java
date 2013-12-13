package LeetCode;

public class SetMatrixZeroes {
	//Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.

	//click to show follow up.

	//Follow up:
	//Did you use extra space?
	//A straight forward solution using O(mn) space is probably a bad idea.
	//A simple improvement uses O(m + n) space, but still not the best solution.
	//Could you devise a constant space solution?
    public void setZeroes(int[][] matrix) {
    	boolean rows[] = new boolean[matrix.length];
    	for (int i = 0; i < rows.length; i++)
    		rows[i] = true;
    	
    	boolean cols[] = new boolean[matrix[0].length];
    	for (int i = 0; i < cols.length; i++)
    		cols[i] = true;
    	
    	for (int i = 0; i < rows.length; i++)
    		for (int j = 0; j < cols.length; j++)
    		{
    			boolean val = matrix[i][j] == 0 ? false: true;
    			rows[i] = rows[i] & val;
    			cols[j] = cols[j] & val;
    		}
    	
    	for (int i = 0; i < rows.length; i++)
    		for (int j = 0; j < cols.length; j++)
    			if (!(rows[i] && cols[j])) 
    				matrix[i][j] = 0;
    }	
}
