package LeetCode;

public class SpiralMatrixII {
	//Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
	//For example,
	//Given n = 3,

	//You should return the following matrix:
	//[
	// [ 1, 2, 3 ],
	// [ 8, 9, 4 ],
	// [ 7, 6, 5 ]
	//]
	
    public int[][] generateMatrix(int n) {
    	int num[][] = new int[n][n];
    	generate(num, 0, 0, 1, n);
    	return num;
    }

	private void generate(int[][] num, int row, int col, int value, int len) {
		if (len <= 0) 
			return;
		if (len == 1)
			num[row][col] = value;
		else
		{
			for(int i = 1; i < len; i++)
				num[row][col++] = value++;
			for(int i = 1; i < len; i++)
				num[row++][col] = value++;
			for(int i = 1; i < len; i++)
				num[row][col--] = value++;
			for(int i = 1; i < len; i++)
				num[row--][col] = value++;
			
			generate(num, row+1, col+1, value, len-2);
		}
    }
}
