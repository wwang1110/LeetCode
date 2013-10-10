package LeetCode;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class CombinationSumIITest {

	@Test
	public void test() {
		CombinationSumII s = new CombinationSumII();
		ArrayList<ArrayList<Integer>> ret = s.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);
		Assert.assertEquals(4, ret.size());
	}

}
