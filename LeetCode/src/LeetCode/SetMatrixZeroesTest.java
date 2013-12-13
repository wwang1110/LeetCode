package LeetCode;

import org.junit.Test;

public class SetMatrixZeroesTest {

	@Test
	public void test() {
		SetMatrixZeroes s = new SetMatrixZeroes();
		s.setZeroes(new int[][]{{1}});
		s.setZeroes(new int[][]{{0, 1}});
	}

}
