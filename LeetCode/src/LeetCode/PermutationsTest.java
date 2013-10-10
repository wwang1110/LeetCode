package LeetCode;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class PermutationsTest {

	@Test
	public void test() {
		Permutations s = new Permutations();
		int num[] = new int[]{1, 2, 3};
		ArrayList<ArrayList<Integer>> ret = s.permute(num);
		Assert.assertEquals(6, ret.size());
	}

}
