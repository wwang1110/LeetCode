package LeetCode;

import java.util.ArrayList;

public class NQueens {
	//The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens 
	//attack each other.

	//Given an integer n, return all distinct solutions to the n-queens puzzle.

	//Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' 
	//both indicate a queen and an empty space respectively.
	private ArrayList<String[]> ret = null;
	private int[][] tbl = null;
	private char board[][] = null;
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
    public ArrayList<String[]> solveNQueens(int n) {
    	ret = new ArrayList<String[]>();
    	tbl = new int[n][n];
    	board = new char[n][n];
    	for (int i = 0; i < n; i++)
    		for (int j = 0; j < n; j++)
    			board[i][j] = '.';
    	solveNQueens(n, 0);
    	return ret;
    }

    private void solveNQueens(int n, int ln)
    {
    	if (ln == n) 
    	{
    		String[] s = new String[n];
    		for (int i = 0; i < n; i++)
    			s[i] = new String(board[i]);
    		ret.add(s);
    		return;
    	}
    	for (int i = 0; i < n; i++)
    	{
    		if (tbl[i][ln] == 0) 
    		{
    			markQueue(i, ln, n, 1);
    			board[i][ln] = 'Q';
        		solveNQueens(n, ln + 1);
    			board[i][ln] = '.';
    			markQueue(i, ln, n, -1);
    		}
    	}
    }
}
