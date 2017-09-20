/* You are given an n x n 2D matrix representing an image.
 * Rotate the image by 90 degrees (clockwise).
 * Follow up:
 * Could you do this in-place?
 * 
 */

package lc.q0048.RotateImage;

public class Solution {
    public void rotate(int[][] matrix) {
    	int x = 0;
    	int y = matrix.length - 1;
    	int n = matrix.length - 1;
    	
    	while (x < y)
    	{
    		int j = x;
    		for (int i = x; i < y; i++)
    		{
        		int tmp = matrix[i][j];
        		matrix[i][j] = matrix[n-j][i];
        		matrix[n-j][i] = matrix[n-i][n-j];
        		matrix[n-i][n-j] = matrix[j][n-i];
        		matrix[j][n-i] = tmp;
    		}
    		x++;
    		y--;
    	}
    }	
}
