package LeetCode;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class GrayCodeTest {

	@Test
	public void test1() {
		GrayCode s = new GrayCode();
		ArrayList<Integer> ret = s.grayCode(3);
		Assert.assertEquals(4, ret.size());
	}

	@Test
	public void test2() {
		GrayCode s = new GrayCode();
		ArrayList<Integer> ret = s.grayCode(3);
		Assert.assertEquals(4, ret.size());
	}
}
