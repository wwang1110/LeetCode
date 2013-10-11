package LeetCode;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class SpiralMatrixTest {

	@Test
	public void test() {
		SpiralMatrix s = new SpiralMatrix();
		ArrayList<Integer> ret = s.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
		Assert.assertEquals(9, ret.size());
	}

}
