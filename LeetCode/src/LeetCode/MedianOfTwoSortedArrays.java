package LeetCode;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int A[], int B[]) {
    	if (A.length == 0 && B.length == 0)
    		return 0;
    	else if (A.length != 0 && B.length == 0)
    		return findMedian(A);
    	else if (A.length == 0 && B.length != 0)
    		return findMedian(B);

    	return 0;
    }

	private double findMedian(int[] a) {
		if (a.length == 0)
			return 0;
		else if (a.length % 2 == 1)
			return a[a.length / 2];
		
		return (a[a.length / 2] + a[a.length / 2 + 1]) / 2.0;
	}
}
