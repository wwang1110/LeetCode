/* According to the Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."
 * 
 * Given a board with m by n cells, each cell has an initial state live (1) or dead (0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):
 * 
 * Any live cell with fewer than two live neighbors dies, as if caused by under-population.
 * Any live cell with two or three live neighbors lives on to the next generation.
 * Any live cell with more than three live neighbors dies, as if by over-population..
 * Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 * Write a function to compute the next state (after one update) of the board given its current state.
 * 
 * Follow up:
 * Could you solve it in-place? Remember that the board needs to be updated at the same time: You cannot update some cells first and then use their updated values to update other cells.
 * In this question, we represent the board using a 2D array. In principle, the board is infinite, which would cause problems when the active area encroaches the border of the array. How would you address these problems?
 * 
 */

package lc.q0289.GameofLife;

public class Solution {
    public void gameOfLife(int[][] board) {
    	
    	if (board.length == 0 || board[0].length == 0)
    		return;
    	int m = board.length;
    	int n = board[0].length;
    	for (int i = 0;i < m; i++)
    		for (int j = 0; j < n; j++)
    		{
    			int cnt = 0;
    			for (int y = Math.max(0, i-1); y <= Math.min(m-1, i+1); y++)
    				for (int x = Math.max(0, j-1); x <= Math.min(n-1, j+1); x++)
    					if (y!=i||x!=j)
    						cnt += board[y][x]&1;
    			if (cnt == 3||cnt ==2 && board[i][j] == 1) 
    				board[i][j] |= 2;
    		}
    	
    	for (int i = 0;i < m; i++)
    		for (int j = 0; j < n; j++)
    			if ((board[i][j]&2)>0)
    				board[i][j]=1;
    			else
    				board[i][j]=0;
    }
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	int[][] tb = new int[][] {{1,1},{1,0}};
    	//int[][] tb = new int[][] {{1}};
    	s.gameOfLife(tb);
    }    
}
