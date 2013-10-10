package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class ValidSudokuTest {

	@Test
	public void test() {
		ValidSudoku s = new ValidSudoku();
		String[] b = new String[]{"..5.....6","....14...",".........",".....92..","5....2...",".......3.","...54....","3.....42.","...27.6.."};
		char board[][] = new char[9][9];
		for (int i = 0; i < 9; i ++)
			board[i]= b[i].toCharArray();
		Assert.assertEquals(true, s.isValidSudoku(board));
	}

}
