package LeetCode;

public class JumpGame {
	//Given an array of non-negative integers, you are initially positioned at the first index of the array.

	//Each element in the array represents your maximum jump length at that position.

	//Determine if you are able to reach the last index.

	//For example:
	//A = [2,3,1,1,4], return true.

	//A = [3,2,1,0,4], return false.
	
    public boolean canJump(int[] A) {
    	if (A.length < 2)
    		return true;
    	boolean ret = true;
    	int pos = A.length - 1;
    	for (int i = A.length - 2; i >= 0; i--)
    	{
    		if (A[i] == 0 && ret == true)
    		{
    			ret = false;
    			pos = i;
    		}
    		else if (ret == false)
    		{
    			if (i + A[i] > pos)
    				ret = true;
    		}
    	}
    	return ret;
    }	
}
