package LeetCode;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class NQueensTest {

	@Test
	public void test() {
		NQueens s = new NQueens();
		ArrayList<String[]> ret = s.solveNQueens(8);
		Assert.assertEquals(92, ret.size());
	}

}
