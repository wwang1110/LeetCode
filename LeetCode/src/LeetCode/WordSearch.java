package LeetCode;

public class WordSearch {
	//Given a 2D board and a word, find if the word exists in the grid.

	//The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

	//For example,
	//Given board =

	//[
	//  ["ABCE"],
	//  ["SFCS"],
	//  ["ADEE"]
	//]
	//word = "ABCCED", -> returns true,
	//word = "SEE", -> returns true,
	//word = "ABCB", -> returns false.
    
	int marks[][] = null;
	public boolean exist(char[][] board, String word) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
		if (word.length() == 0)
			return false;
		
		int m = board.length;
		int n = board[0].length;
		marks = new int[m][n];
		
        for (int i = 0; i < m; i ++)
        	for (int j = 0; j < n; j++)
        		if(word.charAt(0) == board[i][j] && searchWord(board, i, j, word, 0) == true)
        				return true;
        return false;
    }
	
	private boolean searchWord(char[][] board, int i, int j, String word, int k) {
		if (k == word.length())
			return true;
		
		if (i >= 0 && i <  board.length && j >= 0 && j < board[0].length 
				&& marks[i][j] == 0 && board[i][j] == word.charAt(k))
		{
			marks[i][j] = 1;
			boolean ret = searchWord(board, i-1, j, word, k+1)||searchWord(board, i+1, j, word, k+1)
					||searchWord(board, i, j-1, word, k+1)||searchWord(board, i, j+1, word, k+1);
			marks[i][j] = 0;
			return ret;
		}
		return false;
	}
}
