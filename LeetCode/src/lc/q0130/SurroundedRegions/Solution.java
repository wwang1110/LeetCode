/* Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.
 * 
 * A region is captured by flipping all 'O's into 'X's in that surrounded region.
 * 
 * For example,
 * X X X X
 * X O O X
 * X X O X
 * X O X X
 * 
 * After running your function, the board should be:
 * X X X X
 * X X X X
 * X X X X
 * X O X X
 * 
 */

package lc.q0130.SurroundedRegions;

public class Solution {
    public void solve(char[][] board) {
    	if (board.length == 0 || board[0].length == 0)
    		return;
    	int m = board.length;
    	int n = board[0].length;
        boolean[][] masks = new boolean[m][n];
        
        for (int j = 0; j < n; j ++)
        {
        	if (board[0][j] == 'O')
        		fill(0,j,board,masks);
        	if (board[m-1][j] == 'O')
        		fill(m-1,j,board,masks);
        }
        
        for (int i = 0; i < m; i++)
        {
        	if (board[i][0] == 'O')
        		fill(i,0,board,masks);
        	if (board[i][n-1] == 'O')
        		fill(i,n-1,board,masks);
        }
        
        for (int i = 0; i < m; i++)
        	for (int j = 0; j < n; j++)
        		if (masks[i][j] == false&&board[i][j] == 'O')
        			board[i][j] = 'X';
    }

	private void fill(int i, int j, char[][] board, boolean[][] masks) {
		if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || masks[i][j] == true || board[i][j] == 'X')
			return;
		masks[i][j] = true;
		if(i > 1)
			fill(i-1,j,board,masks);
		if (i < board.length - 2)
			fill(i+1,j,board,masks);
		if (j > 1)
			fill(i,j-1,board,masks);
		if (j < board[0].length)
			fill(i,j+1,board,masks);
	}
}
