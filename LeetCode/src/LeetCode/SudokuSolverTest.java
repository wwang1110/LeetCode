package LeetCode;

import org.junit.Test;

public class SudokuSolverTest {

	@Test
	public void test() {
		SudokuSolver s = new SudokuSolver();
		String[] b = new String[]{"..5.....6","....14...",".........",".....92..","5....2...",".......3.","...54....","3.....42.","...27.6.."};
		char board[][] = new char[9][9];
		for (int i = 0; i < 9; i ++)
			board[i]= b[i].toCharArray();
		s.solveSudoku(board);
	}

}
