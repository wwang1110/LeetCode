package LeetCode;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class SubsetsTest {

	@Test
	public void test() {
		Subsets s = new Subsets();
		ArrayList<ArrayList<Integer>> ret = s.subsets(new int[]{1,2,3});
		Assert.assertEquals(8, ret.size());
	}

}
