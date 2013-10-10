package LeetCode;

public class SearchInsertPosition {
	//Given a sorted array and a target value, return the index if the target is found. 
	//If not, return the index where it would be if it were inserted in order.

	//You may assume no duplicates in the array.

	//Here are few examples.
	//[1,3,5,6], 5 -> 2
	//[1,3,5,6], 2 -> 1
	//[1,3,5,6], 7 -> 4
	//[1,3,5,6], 0 -> 0
    public int searchInsert(int[] A, int target) {
    	if (A.length == 0 || target < A[0])
    		return 0;
    	else if (target > A[A.length - 1])
    		return A.length;
    	
    	int start = 0;
    	int end = A.length - 1;
    	while (start < end)
    	{
    		int mid = (start + end) / 2;
    		if (A[mid] == target)
    			return mid;
    		else if (A[mid] > target)
    			end = mid;
    		else
    			start = mid + 1;
    	}
    	
   		return start; 
    }	
}
