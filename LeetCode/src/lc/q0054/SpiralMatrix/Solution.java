/* Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 * For example,
 * Given the following matrix:
 * [
 *  [ 1, 2, 3 ],
 *  [ 4, 5, 6 ],
 *  [ 7, 8, 9 ]
 * ]
 * You should return [1,2,3,6,9,8,7,4,5].
 * 
 */

package lc.q0054.SpiralMatrix;

import java.util.*;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    	
    	List<Integer> res = new ArrayList<Integer>();
        if (matrix.length == 0)
            return res;
        
    	int l = 0;
    	int r = matrix[0].length - 1;
    	int t = 0;
    	int b = matrix.length - 1;
    	
    	while(l < r && t < b) 
    	{
	    	for (int i = l; i < r; i ++)
	    		res.add(matrix[t][i]);
	    	
	    	for (int j = t; j < b; j ++)
	    		res.add(matrix[j][r]);
	
	    	for (int i = r; i > l; i--)
	    		res.add(matrix[b][i]);
	    
	    	for (int j = b; j > t; j --)
	    		res.add(matrix[j][l]);
	    	
	    	l ++;
	    	r --;
	    	t ++;
	    	b --;
    	}
    	
    	if (t == b)
    		for (int i = l; i <= r; i++)
    			res.add(matrix[t][i]);
    	else if (l == r)
    		for (int j = t ; j <= b; j++)
    			res.add(matrix[j][l]);
    	
    	return res;
    }
}
