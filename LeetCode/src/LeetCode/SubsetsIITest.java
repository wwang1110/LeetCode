package LeetCode;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class SubsetsIITest {

	@Test
	public void test() {
		SubsetsII s = new SubsetsII();
		//If S = [1,2,2], a solution is:
		//[
		//  [2],
		//  [1],
		//  [1,2,2],
		//  [2,2],
		//  [1,2],
		//  []
		//]	
		ArrayList<ArrayList<Integer>> ret = s.subsetsWithDup(new int[]{1,2,2});
		Assert.assertEquals(6, ret.size());
	}

}
