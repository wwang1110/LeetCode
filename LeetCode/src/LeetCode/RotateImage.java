package LeetCode;

public class RotateImage {
	//You are given an n x n 2D matrix representing an image.

	//Rotate the image by 90 degrees (clockwise).

	//Follow up:
	//Could you do this in-place?
    public void rotate(int[][] matrix) {
    	int len = matrix.length;
    	for (int i = 0; i < len; i++)
    		for (int j = i + 1; j < len; j++)
    		{
    			int t = matrix[i][j];
    			matrix[i][j] = matrix[j][i];
    			matrix[j][i] = t;
    		}
    	
    	for (int i = 0; i < len; i++)
    		for (int j = 0; j < len / 2; j ++)
    		{
    			int t = matrix[i][j];
    			matrix[i][j] = matrix[i][len-1-j];
    			matrix[i][len-1-j] = t;
    		}
    }	
}
