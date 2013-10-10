package LeetCode;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class PermutationsIITest {

	@Test
	public void test() {
		PermutationsII s = new PermutationsII();
		ArrayList<ArrayList<Integer>> ret = s.permuteUnique(new int[]{1,1,2});
		Assert.assertEquals(3, ret.size());
	}

}
