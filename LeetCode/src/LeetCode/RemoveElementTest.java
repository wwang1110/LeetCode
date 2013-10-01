package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class RemoveElementTest {

	@Test
	public void test() {
		RemoveElement s = new RemoveElement();
		int A[] = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1};
		int len = s.removeElement(A, 2);
		Assert.assertEquals(7, len);
	}

}
