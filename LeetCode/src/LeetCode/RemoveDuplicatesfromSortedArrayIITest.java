package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesfromSortedArrayIITest {

	@Test
	public void test() {
		RemoveDuplicatesfromSortedArrayII s = new RemoveDuplicatesfromSortedArrayII();
		int A[] = new int[]{1,1,1,2,2,3};
		int ret = s.removeDuplicates(A);
		Assert.assertEquals(5, ret);
	}

}
