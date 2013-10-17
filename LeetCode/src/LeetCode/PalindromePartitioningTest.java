package LeetCode;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class PalindromePartitioningTest {

	@Test
	public void test() {
		PalindromePartitioning s = new PalindromePartitioning();
		ArrayList<ArrayList<String>> ret = s.partition("aab");
		Assert.assertEquals(2, ret.size());
	}

}
