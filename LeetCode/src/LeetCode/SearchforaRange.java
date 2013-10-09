package LeetCode;

public class SearchforaRange {
	//Given a sorted array of integers, find the starting and ending position of a given target value.

	//Your algorithm's runtime complexity must be in the order of O(log n).

	//If the target is not found in the array, return [-1, -1].

	//For example,
	//Given [5, 7, 7, 8, 8, 10] and target value 8,
	//return [3, 4].
    public int[] searchRange(int[] A, int target) {
    	if(A.length == 0 || A[0] > target || A[A.length - 1] < target)
    		return new int[]{-1, -1};

    	int pos[] = new int[2];
    	
    	//look for left
    	int start = 0; 
    	int end = A.length - 1;
    	if (A[0] == target)
    		pos[0] = 0;
    	else
    	{
	    	while (start < end)
	    	{
	    		int mid = (start + end) / 2;
	    		if (A[mid] >= target)
	    			end = mid;
	    		else
	    			start = mid + 1;
	    	}
	    	if (A[end] != target && end < A.length - 1)
	    		end++;
	    	if (A[end] != target)
	    		return new int[]{-1, -1};
	    	pos[0] = end;
    	}
    	
    	//look for right
    	start = 0; 
    	end = A.length - 1;
    	if (A[A.length - 1] == target)
    		pos[1] = A.length - 1;
    	else
    	{
	    	while (start < end)
	    	{
	    		int mid = (start + end) / 2;
	    		if (A[mid] <= target)
	    			start = mid + 1;
	    		else
	    			end = mid;
	    	}
	    	if (A[start] != target && start > 0)
	    		start--;
	    	if (A[start] != target)
	    		return new int[]{-1, -1};
	    	pos[1] = start;
    	}
    	
    	return pos;
    }
}
