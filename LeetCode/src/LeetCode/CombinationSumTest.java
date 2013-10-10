package LeetCode;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class CombinationSumTest {

	@Test
	public void test() {
		CombinationSum s = new CombinationSum();
		ArrayList<ArrayList<Integer>> ret = s.combinationSum(new int[]{2,3,6,7}, 7);
		Assert.assertEquals(2, ret.size());
	}

}
