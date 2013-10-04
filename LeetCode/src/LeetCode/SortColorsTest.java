package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class SortColorsTest {

	@Test
	public void test() {
		SortColors s = new SortColors();
		int A[] = new int[]{0,1,2,0,1,2,0,1,2};
		s.sortColors(A);
		Assert.assertEquals(0, A[0]);
		Assert.assertEquals(0, A[1]);
		Assert.assertEquals(0, A[2]);
	}

}
