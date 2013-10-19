package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class SurroundedRegions {
	//Given a 2D board containing 'X' and 'O', capture all regions surrounded by 'X'.

	//A region is captured by flipping all 'O's into 'X's in that surrounded region .

	//For example,
	//X X X X
	//X O O X
	//X X O X
	//X O X X
	//After running your function, the board should be:

	//X X X X
	//X X X X
	//X X X X
	//X O X X
	private int marks[][] = null;
    public void solve(char[][] board) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
    	if (board.length == 0 || board[0].length == 0)
    		return;
    	
    	int m = board.length;
    	int n = board[0].length;
    	marks = new int[m][n];

    	Queue<Point> que = new LinkedList<Point>(); 
    	
    	for (int i = 0; i < n; i++)
    	{
    		if (board[0][i] == 'O')
    			que.offer(new Point(0,i));
    		if (board[m-1][i] == 'O')
    			que.offer(new Point(m-1,i));
    	}

    	for (int i = 0; i < m; i++)
    	{
    		if (board[i][0] == 'O')
    			que.offer(new Point(i, 0));
    		if (board[i][n-1] == 'O')
    			que.offer(new Point(i, n-1));
    	}
    	
    	while (que.isEmpty() == false)
    	{
    		Point p = que.poll();
    		marks[p.x][p.y] = 1;
    		if (isValid(board, p.x - 1, p.y))
    			que.offer(new Point(p.x - 1, p.y));
    		if (isValid(board, p.x + 1, p.y))
    			que.offer(new Point(p.x + 1, p.y));
    		if (isValid(board, p.x, p.y - 1))
    			que.offer(new Point(p.x, p.y - 1));
    		if (isValid(board, p.x, p.y + 1))
    			que.offer(new Point(p.x, p.y + 1));
    	}
        
    	for (int i = 0; i < m; i++)
    		for (int j = 0; j < n; j++)
    			if (marks[i][j] == 0)
    				board[i][j] = 'X';
    }
    
    private boolean isValid(char board[][], int i, int j){
		return i >= 0 && i < board.length && j >=0 && j < board[0].length 
				&& board[i][j] == 'O' && marks[i][j] == 0;
    	
    }
}
