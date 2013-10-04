package LeetCode;

import java.util.ArrayList;

public class RemoveDuplicatesfromSortedArrayII {
	//Follow up for "Remove Duplicates":
	//What if duplicates are allowed at most twice?

	//For example,
	//Given sorted array A = [1,1,1,2,2,3],

	//Your function should return length = 5, and A is now [1,1,2,2,3].
    public int removeDuplicates(int[] A) {
    	if (A.length <= 1)
    		return A.length;
    	
    	ArrayList<Integer> NA = new ArrayList<Integer>();
    	
    	int i = 1;
    	int repeat = 1;
    	NA.add(A[0]);
    	while (i < A.length)
    	{
    		if (A[i] == A[i-1]) 
    			repeat++;
    		else 
    			repeat = 1;
    		
    		if (repeat < 3)
    			NA.add(A[i]);
    		
    		i++;
    	}
    	
    	for (i = 0; i < NA.size(); i++)
    		A[i] = NA.get(i);
    	return NA.size();
    }	
}
