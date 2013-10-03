package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class SearchinRotatedSortedArrayTest {

	@Test
	public void test() {
		SearchinRotatedSortedArray s = new SearchinRotatedSortedArray();
		int A[] = new int[]{4,5,6,7,0,1,2 };
		Assert.assertEquals(-1, s.search(A, 3));
		Assert.assertEquals(0, s.search(A, 4));
		Assert.assertEquals(6, s.search(A, 2));
		Assert.assertEquals(3, s.search(A, 7));
	}

}
