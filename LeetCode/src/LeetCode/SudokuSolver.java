package LeetCode;

public class SudokuSolver {
	//Write a program to solve a Sudoku puzzle by filling the empty cells.

	//Empty cells are indicated by the character '.'.

	//You may assume that there will be only one unique solution.
	
	private boolean rows[][] = new boolean[9][9]; 
	private boolean cols[][] = new boolean[9][9]; 
	private boolean recs[][] = new boolean[9][9];
    public void solveSudoku(char[][] board) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
    	for (int i = 0; i < 9; i ++)
    		for (int j = 0; j < 9; j++)
    			if (board[i][j] != '.')
    			{
    				rows[i][board[i][j] - '1'] = true;
    				cols[j][board[i][j] - '1'] = true;
    				recs[(i / 3) * 3 + j / 3][board[i][j] - '1'] = true;
    			}
    	calc(board);
    }	
    
    private boolean calc(char[][] board)
    {
    	int i = 0;
    	int j = 0;
    	boolean find = false;
        for (i = 0; i < 9; i++)
        {
        	for (j = 0; j < 9; j++)
        		if (board[i][j] == '.')
        		{
        			find = true;
        			break;
        		}
        	if (find == true)
        		break;
        }

        if (find == false)
        	return true;
        
        for (int k = 0;k < 9; k++)
        	if (rows[i][k] == false && cols[j][k] == false && recs[(i / 3) * 3 + j / 3][k] == false)
        	{
        		board[i][j] = (char)((int)'1' + k);
        		rows[i][k] = true;
        		rows[j][k] = true;
        		recs[(i / 3) * 3 + j / 3][k] = true;
        		boolean ret = calc(board);
        		if (ret == true)
        			return true;
        		board[i][j] = '.';
        		rows[i][k] = false;
        		rows[j][k] = false;
        		recs[(i / 3) * 3 + j / 3][k] = false;
        	}
        return false;
    }
}
