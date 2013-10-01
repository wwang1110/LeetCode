package LeetCode;

public class JumpGameII {
	//Given an array of non-negative integers, you are initially positioned at the first index of the array.

	//Each element in the array represents your maximum jump length at that position.

	//Your goal is to reach the last index in the minimum number of jumps.

	//For example:
	//Given array A = [2,3,1,1,4]

	//The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, 
	//then 3 steps to the last index.)
    public int jump(int[] A) {
    	int steps[] = new int[A.length];
    	for (int i = 1; i < A.length; i++)
    	{
    		int min = Integer.MAX_VALUE;
    		for (int j = 0; j < i; j++)
    		{
    			if (A[j] + j >= i)
    				min = Math.min(steps[j] + 1, min);
    		}
    		steps[i] = min;
    	}
    	return steps[A.length - 1];
    }	
}
