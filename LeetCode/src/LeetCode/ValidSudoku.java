package LeetCode;

import java.util.Arrays;

public class ValidSudoku {
	//Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

	//The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
	
    public boolean isValidSudoku(char[][] board) {
    	int marks[] = new int[10]; 
    	
    	//verify lines
    	for (int i = 0; i < 9; i++)
    	{
    		Arrays.fill(marks, 0);
    		for (int j = 0; j < 9; j++)
    		{
    			if (board[i][j] != '.')
    			{
	    			if (marks[board[i][j]-'0'] == 1)
	    				return false;
	    			else 
	    				marks[board[i][j]-'0'] = 1;
    			}
    		}
    	}
    	
    	//verify columns
    	for (int i = 0; i < 9; i++)
    	{
    		Arrays.fill(marks, 0);
    		for (int j = 0; j < 9; j++)
    		{
    			if (board[j][i] != '.')
    			{
	    			if (marks[board[j][i] - '0'] == 1)
	    				return false;
	    			else 
	    				marks[board[j][i] - '0'] = 1;
    			}
    		}
    	}
    	
    	//verify box
    	for (int i = 0; i < 9; i++)
    	{
    		Arrays.fill(marks, 0);
    		for (int j = 0; j < 9; j++)
    		{
    			int x = (i / 3) * 3 + j / 3;
    			int y = (i % 3) * 3 + j % 3;
    			if (board[x][y] != '.')
    			{
	    			if (marks[board[x][y]-'0'] == 1)
	    				return false;
	    			else 
	    				marks[board[x][y]-'0'] = 1;
    			}
    		}
    	}
    	
    	return true;
    }	
}
