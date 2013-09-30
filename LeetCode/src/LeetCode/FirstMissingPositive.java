package LeetCode;

public class FirstMissingPositive {
	//Given an unsorted integer array, find the first missing positive integer.

	//For example,
	//Given [1,2,0] return 3,
	//and [3,4,-1,1] return 2.

	//Your algorithm should run in O(n) time and uses constant space.
    public int firstMissingPositive(int[] A) {
    	int marked[] = new int[A.length + 1];
    	
    	for (int i = 0; i < A.length; i++)
    		if (A[i] > 0 && A[i] <= A.length)
    			marked[A[i]]++;
    	
    	for (int i = 1; i <= A.length; i++)
    		if (marked[i] == 0) return i;
    	
    	return A.length + 1;
    }	
}
