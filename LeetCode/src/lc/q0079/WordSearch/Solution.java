/* Given a 2D board and a word, find if the word exists in the grid.
 * 
 * The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
 * For example,
 * Given board =
 * [
 *   ['A','B','C','E'],
 *   ['S','F','C','S'],
 *   ['A','D','E','E']
 * ]
 * word = "ABCCED", -> returns true,
 * word = "SEE", -> returns true,
 * word = "ABCB", -> returns false. 
 * 
 */

package lc.q0079.WordSearch;

public class Solution {
    public boolean exist(char[][] board, String word) {
    	
    	if (word.length() == 0)
    		return false;
    	
    	boolean[][] flagtable = new boolean[board.length][board[0].length];
    	
    	for (int i = 0; i < board.length; i++)
    		for (int j = 0; j < board[0].length; j++)
    		{
    			if (search(i, j, 0, word, flagtable, board) == true)
    				return true;
    		}
    	
    	return false;
    }

	private boolean search(int i, int j, int idx, String word, boolean[][] flagtable, char[][] board) {
		
		if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || flagtable[i][j] == true || word.charAt(idx) != board[i][j])
			return false;

		if (idx == word.length() - 1)
			return true;

		flagtable[i][j] = true;
		boolean res = search(i-1, j, idx + 1, word, flagtable, board) ||search(i+1, j, idx + 1, word, flagtable, board)
			||search(i, j-1, idx + 1, word, flagtable, board) ||search(i, j+1, idx + 1, word, flagtable, board);
		flagtable[i][j] = false;
		return res;
		
	}

}
