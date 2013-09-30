package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class NextPermutationTest {

	@Test
	public void test1() {
		NextPermutation s = new NextPermutation();
		int num[] = new int[]{0, 1,2,5,3,3,0};
		s.nextPermutation(num);
		Assert.assertEquals(3, num[2]);
	}

	@Test
	public void test2() {
		NextPermutation s = new NextPermutation();
		int num[] = new int[]{5,4,3,2,1,0};
		s.nextPermutation(num);
		Assert.assertEquals(0, num[0]);
	}
}
