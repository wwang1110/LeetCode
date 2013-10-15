package LeetCode;

public class MergeSortedArray {
	//Given two sorted integer arrays A and B, merge B into A as one sorted array.

	//Note:
	//You may assume that A has enough space to hold additional elements from B. The number of elements initialized in A and B are m and n respectively.
    public void merge(int A[], int m, int B[], int n) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
    	int i = m - 1;
    	int j = n - 1;
    	
    	int k = m + n - 1;
    	
    	while (j >= 0 && m >= 0)
    	{
    		if (A[i] < B[j])
    			A[k--] = B[j--];
    		else
    			A[k--] = A[i--];
    	}
    	
    	while (j >= 0)
    		A[k--] = B[j--];
    }	
}
