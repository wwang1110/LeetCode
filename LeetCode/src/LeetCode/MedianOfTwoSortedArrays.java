package LeetCode;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int A[], int B[]) {
    	if (A.length == 0 && B.length == 0)
    		return 0;
    	else if (A.length != 0 && B.length == 0)
    		return findMedian(A);
    	else if (A.length == 0 && B.length != 0)
    		return findMedian(B);
    	else if (A.length == 1 && B.length == 1)
    		return (A[0] + B[0]) / 2.0;
    	
    	if (A.length == 1 && B.length > 1)
    		return findMedianWithALengthOne(A, B);
    	if (B.length == 1 && A.length > 1)
    		return findMedianWithALengthOne(B, A);
    	if (A.length == 2 && B.length > 1)
     		return findMedianWithALengthTwo(A, B);
    	if (B.length == 2 && A.length > 1)
    		return findMedianWithALengthTwo(B, A);
    	
    	if (A.length % 2 == 1 && B.length % 2 == 1)
    	{
    		
    	}
    	return 0;
    }

	private double findMedianWithALengthTwo(int[] A, int[] B) {
		if (B.length % 2 == 1)
		{
			int p = B.length / 2;
			if (A[0] < B[p] && B[p] < A[1])return B[p];
			if (A[1] < B[p-1])return B[p-1];
			if (B[p+1] < A[0])return B[p+1];
			if (B[p-1] < A[1] && A[1] < B[p])return A[1];
			if (B[p] < A[0] && A[0] < B[p+1])return A[0];
		}
		else
		{
			int p1 = B.length / 2;
			int p0 = p1 - 1;
			if (A[0] < B[p0] && A[1] < B[p1])return (A[1] + B[p0]) / 2.0;
			if (A[0] < B[p0] && B[p1] < A[1])return (B[p0] + B[p1]) / 2.0;
			if (B[p0] < A[0] && A[1] < B[p1])return (A[0] + A[1]) / 2.0;
			if (B[p0] < A[0] && B[p1] < A[1])return (B[p1] + A[1]) / 2.0;
		}
		return 0;
	}

	private double findMedianWithALengthOne(int[] A, int[] B) {
		if (B.length % 2 == 1)
		{
			int p = B.length / 2;
			if (A[0] < B[p-1])return (B[p-1] + B[p]) / 2.0;
			if (B[p-1] < A[0] && A[0] < B[p+1]) return (A[0] + B[p]) / 2.0;
			if (B[p+1] < A[0])return (B[p] + B[p+1]) / 2.0;
		}
		else
		{
			int p1 = B.length / 2;
			int p0 = p1 - 1;
			if (A[0] < B[p0])return B[p0];
			if (B[p0] < A[0] && A[0] < B[p1])return A[0];
			if (B[p1] < A[0])return B[p1];
		}
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
