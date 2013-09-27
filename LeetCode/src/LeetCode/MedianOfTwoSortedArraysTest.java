package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class MedianOfTwoSortedArraysTest {

	@Test
	public void findMedianSortedArrays_GivenTwoEmptyArrays() {
		int A[] = new int[0];
		int B[] = new int[0];
		Assert.assertEquals("0.0", findMedianSortedArrays(A, B));
	}
	
	@Test
	public void findMedianSortedArrays_GivenOneEmptyArrays() {
		int A[] = new int[0];
		int B[] = new int[]{1};
		Assert.assertEquals("1.0", findMedianSortedArrays(A, B));
	}

	@Test
	public void findMedianSortedArrays_GivenLenghOneArrays() {
		int A[] = new int[]{1};
		int B[] = new int[]{2};
		Assert.assertEquals("1.5", findMedianSortedArrays(A, B));
	}

	@Test
	public void findMedianSortedArrays_GivenLenghTwoAndOneArrays() {
		int A[] = new int[]{1, 3};
		int B[] = new int[]{2};
		Assert.assertEquals("2.0", findMedianSortedArrays(A, B));
	}

	@Test
	public void findMedianSortedArrays_GivenLenghOneAndTwoArrays() {
		int A[] = new int[]{1};
		int B[] = new int[]{2, 3};
		Assert.assertEquals("2.0", findMedianSortedArrays(A, B));
	}
	
	@Test
	public void findMedianSortedArrays_GivenLenghTwoArrays() {
		int A[] = new int[]{1, 4};
		int B[] = new int[]{2, 3};
		Assert.assertEquals("2.5", findMedianSortedArrays(A, B));
	}
	/*
	@Test
	public void findMedianSortedArrays_GivenOneOddArrayOneEvenArray() {
		int A[] = new int[]{1, 3, 5, 7};
		int B[] = new int[]{2, 4, 6, 8, 10};
		Assert.assertEquals("5.0", findMedianSortedArrays(A, B));
	}
	*/
	
	/*
	@Test
	public void findMedianSortedArrays_GivenTwoOddArrays() {
		int A[] = new int[]{1, 3, 5};
		int B[] = new int[]{2, 4, 6, 8, 10};
		Assert.assertEquals("1.0", findMedianSortedArrays(A, B));
	}

	@Test
	public void findMedianSortedArrays_GivenTwoEvenArrays() {
		int A[] = new int[]{1, 3, 5, 7};
		int B[] = new int[]{0, 2, 4, 6, 8, 10};
		Assert.assertEquals("1.0", findMedianSortedArrays(A, B));
	}
	*/
	
	private String findMedianSortedArrays(int[] A, int[] B) {
		MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();
		return ((Double)solution.findMedianSortedArrays(A, B)).toString();
	}

}
