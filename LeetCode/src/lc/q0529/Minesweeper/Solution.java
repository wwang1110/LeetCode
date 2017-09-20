/* 
Let's play the minesweeper game (Wikipedia, online game)!

You are given a 2D char matrix representing the game board. 'M' represents an unrevealed mine, 'E' represents an unrevealed empty square, 'B' represents a revealed blank square that has no adjacent (above, below, left, right, and all 4 diagonals) mines, digit ('1' to '8') represents how many mines are adjacent to this revealed square, and finally 'X' represents a revealed mine.

Now given the next click position (row and column indices) among all the unrevealed squares ('M' or 'E'), return the board after revealing this position according to the following rules:

If a mine ('M') is revealed, then the game is over - change it to 'X'.
If an empty square ('E') with no adjacent mines is revealed, then change it to revealed blank ('B') and all of its adjacent unrevealed squares should be revealed recursively.
If an empty square ('E') with at least one adjacent mine is revealed, then change it to a digit ('1' to '8') representing the number of adjacent mines.
Return the board when no more squares will be revealed.
Example 1:
Input: 

[['E', 'E', 'E', 'E', 'E'],
 ['E', 'E', 'M', 'E', 'E'],
 ['E', 'E', 'E', 'E', 'E'],
 ['E', 'E', 'E', 'E', 'E']]

Click : [3,0]

Output: 

[['B', '1', 'E', '1', 'B'],
 ['B', '1', 'M', '1', 'B'],
 ['B', '1', '1', '1', 'B'],
 ['B', 'B', 'B', 'B', 'B']]

Explanation:

Example 2:
Input: 

[['B', '1', 'E', '1', 'B'],
 ['B', '1', 'M', '1', 'B'],
 ['B', '1', '1', '1', 'B'],
 ['B', 'B', 'B', 'B', 'B']]

Click : [1,2]

Output: 

[['B', '1', 'E', '1', 'B'],
 ['B', '1', 'X', '1', 'B'],
 ['B', '1', '1', '1', 'B'],
 ['B', 'B', 'B', 'B', 'B']]

Explanation:

Note:
The range of the input matrix's height and width is [1,50].
The click position will only be an unrevealed square ('M' or 'E'), which also means the input board contains at least one clickable square.
The input board won't be a stage when game is over (some mines have been revealed).
For simplicity, not mentioned rules should be ignored in this problem. For example, you don't need to reveal all the unrevealed mines when the game is over, consider any cases that you will win the game or flag any squares.
 * 
 */

package lc.q0529.Minesweeper;

public class Solution {
    public char[][] updateBoard(char[][] board, int[] click) {
    	int y=click[0];
    	int x=click[1];
    	if(board[y][x]=='M')
    	{
    		board[y][x]='X';
    		return board;
    	}
    	fillboard(board, y, x);
    	return board;
    }
    private void fillboard(char[][] board, int y, int x) {
    	if(y<0||y>=board.length||x<0||x>=board[0].length||board[y][x]!='E')
    		return;
    	int count=countMines(y, x, board);
    	if(count==0)
    	{
    		board[y][x]='B';
    		fillboard(board,y-1,x-1);
    		fillboard(board,y-1,x);
    		fillboard(board,y-1,x+1);
    		fillboard(board,y,x-1);
    		fillboard(board,y,x+1);
    		fillboard(board,y+1,x-1);
    		fillboard(board,y+1,x);
    		fillboard(board,y+1,x+1);
    	}
    	else
    	{
    		board[y][x]=(char)('0'+count);
    	}
	}
	private int getMine(int i, int j, char[][] board)
    {
    	if(i<0||i>=board.length||j<0||j>=board[0].length)
    		return 0;
    	if(board[i][j]=='M')
    		return 1;
    	return 0;
    }
    private int countMines(int i, int j, char[][] board)
    {
    	return getMine(i-1,j-1,board)+getMine(i-1,j,board)+getMine(i-1,j+1,board)+getMine(i,j-1,board)
    		+getMine(i,j+1,board)+getMine(i+1,j-1,board)+getMine(i+1,j,board)+getMine(i+1,j+1,board);
    }
}
