package LeetCode;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class ThreeSumTest {

	@Test
	public void test() {
		ThreeSum s = new ThreeSum();
		ArrayList<ArrayList<Integer>> ret = s.threeSum(new int[]{-1,0,1,2,-1,-4});
		Assert.assertEquals(2, ret.size());
	}

}
