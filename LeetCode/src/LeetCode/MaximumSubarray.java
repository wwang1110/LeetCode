package LeetCode;

public class MaximumSubarray {
	//Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

	//For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
	//the contiguous subarray [4,-1,2,1] has the largest sum = 6.

	//click to show more practice.

	//More practice:
	//If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
    public int maxSubArray(int[] A) {
    	if (A.length == 0)
    		return 0;
    	int max = Integer.MIN_VALUE;
    	for (int i = 0; i < A.length; i ++)
    		max = Math.max(max, A[i]);
    	
    	if (max < 0)
    		return max;
    	
    	int sum = 0;
      
    	for (int i = 0; i < A.length; i++)
    	{
    		sum +=A[i];
    		if (sum > max)
    			max = sum;
    		else if (sum < 0)
    			sum = 0;
    	}

    	return max;
    }
}
