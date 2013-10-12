package LeetCode;

public class UniquePathsII {
	//Follow up for "Unique Paths":

	//Now consider if some obstacles are added to the grids. How many unique paths would there be?

	//An obstacle and empty space is marked as 1 and 0 respectively in the grid.

	//For example,
	//There is one obstacle in the middle of a 3x3 grid as illustrated below.
	//[
	//  [0,0,0],
	//  [0,1,0],
	//  [0,0,0]
	//]
	//The total number of unique paths is 2.

	//Note: m and n will be at most 100.	
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    	if (obstacleGrid.length == 0 || obstacleGrid[0].length == 0)
    		return 0;
    	
    	int tbl[][] = new int[100][100];
    	int m = obstacleGrid.length;
    	int n = obstacleGrid[0].length;

    	int val = 1;
    	int k = 0;
    	while (k < n)
    	{
    		if (obstacleGrid[0][k] == 1)
    			val = 0;
    		tbl[0][k] = val;
    		k++;
    	}

    	k = 0;
    	val = 1;
    	while (k < m)
    	{
    		if (obstacleGrid[k][0] == 1)
    			val = 0;
    		tbl[k][0] = val;
    		k++;
    	}
    	
    	for (int i = 1; i < m; i++)
    		for (int j = 1; j < n; j++)
    			if (obstacleGrid[i][j] == 1)
    				tbl[i][j] = 0;
    			else
    				tbl[i][j] = tbl[i-1][j] + tbl[i][j-1];
    	
    	return tbl[m - 1][n - 1];
    }
}
