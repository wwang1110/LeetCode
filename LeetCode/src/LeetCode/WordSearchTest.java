package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class WordSearchTest {

	@Test
	public void test() {
		WordSearch s = new WordSearch();
		//[
		//  ["ABCE"],
		//  ["SFCS"],
		//  ["ADEE"]
		//]
		//word = "ABCCED", -> returns true,
		//word = "SEE", -> returns true,
		//word = "ABCB", -> returns false.
		
		char board[][] = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}; 
		Assert.assertEquals(true, s.exist(board, "ABCCED"));
		Assert.assertEquals(true, s.exist(board, "SEE"));
		Assert.assertEquals(false, s.exist(board, "ABCB"));
	}

}
