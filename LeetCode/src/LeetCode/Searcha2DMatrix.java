package LeetCode;

public class Searcha2DMatrix {
	//Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

	//Integers in each row are sorted from left to right.
	//The first integer of each row is greater than the last integer of the previous row.
	//For example,

	//Consider the following matrix:

	//[
	//  [1,   3,  5,  7],
	//  [10, 11, 16, 20],
	//  [23, 30, 34, 50]
	//]
	//Given target = 3, return true.
    public boolean searchMatrix(int[][] matrix, int target) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
    	if (matrix.length == 0 || matrix[0].length == 0)
    		return false;
    	
    	int m = matrix.length;
    	int n = matrix[0].length;

    	if (matrix[0][0] > target || matrix[m-1][n-1] < target)
    		return false;
    	
    	int start = 0;
    	int end = m * n - 1;
    	
    	while (start < end)
    	{
    		int mid = (start + end) / 2;
    		int i = mid / n;
    		int j = mid % n;
    		if (matrix[i][j] == target)
    			return true;
    		if (matrix[i][j] < target)
    			start = mid + 1;
    		else if (matrix[i][j] > target)
    			end = mid;
    	}
    	
    	if (start == end && matrix[start / n][start % n] == target)
    		return true;
    	
    	return false;
    }	
}
