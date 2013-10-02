package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class NQueensIITest {

	@Test
	public void test() {
		NQueensII s = new NQueensII();
		int len = s.totalNQueens(8);
		Assert.assertEquals(92, len);
	}

}
