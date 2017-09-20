/* Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 * 
 */
package lc.q0036.ValidSudoku;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
    	int[][] col = new int[9][9];
    	int[][] row = new int[9][9];
    	int[][] blk = new int[9][9];
    	for (int i = 0; i < 9; i ++)
    	{
        	for(int j = 0; j < 9; j ++)
        	{
        		if (board[i][j] != '.')
        		{
            		//row
        			int c1 = board[i][j] - '1';
        			if (row[i][c1] > 0 )
        				return false;
        			row[i][c1] ++;
        			
        			//blk
        			int bn = (i / 3) * 3 + j / 3;
        			if (blk[bn][c1] > 0)
        				return false;
        			blk[bn][c1] ++;
        		}
        		
        		if (board[j][i] != '.')
        		{
            		//col
            		int c2 = board[j][i] - '1';
            		if (col[i][c2] > 0)
            			return false;
            		col[i][c2] ++;
        		}
        	}
    	}
        return true;
    }
}
