package LeetCode;

public class MergeSortedArray {
	//Given two sorted integer arrays A and B, merge B into A as one sorted array.

	//Note:
	//You may assume that A has enough space to hold additional elements from B. The number of elements initialized in A and B are m and n respectively.
    public void merge(int A[], int m, int B[], int n) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
    	int idxA = m - 1;
    	int idxB = n - 1;
    	int idx = m + n - 1;
    	
    	while (idxA >= 0 && idxB >= 0)
    	{
    		if (A[idxA] > B[idxB])
    			A[idx--] = A[idxA--];
    		else
    			A[idx--] = B[idxB--];
    	}
    	
    	while (idxB >= 0)
			A[idx--] = B[idxB--];
    }	
}
