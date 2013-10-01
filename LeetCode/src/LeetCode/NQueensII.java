package LeetCode;

public class NQueensII {
	//Follow up for N-Queens problem.

	//Now, instead outputting board configurations, return the total number of distinct solutions.
	
	private int[][] tbl = null;
	private void markQueue(int x, int y, int n, int inc)
	{
		for (int i = 0; i < n; i++)
		{
			tbl[x][i] += inc;
			tbl[i][y] += inc;
		}	
		for (int i = -n + 1; i < n; i++)
		{
			if (x+i >= 0 && x+i < n && y+i >= 0 && y+i < n)
				tbl[x+i][y+i] += inc;
			if (x+i >= 0 && x+i < n && y-i >= 0 && y-i < n)
				tbl[x+i][y-i] += inc;
		}
	}
    public int totalNQueens(int n) {
    	tbl = new int[n][n];
    	return totalNQueens(n, 0);
    }
    
    public int totalNQueens(int n, int ln) {
    	if (ln == n) return 1;
    	int cnt = 0;
    	for (int i = 0; i < n; i++)
    	{
    		if (tbl[i][ln] == 0) 
    		{
    			markQueue(i, ln, n, 1);
        		cnt += totalNQueens(n, ln + 1);
    			markQueue(i, ln, n, -1);
    		}
    		
    	}
    	return cnt;
    }	
}
