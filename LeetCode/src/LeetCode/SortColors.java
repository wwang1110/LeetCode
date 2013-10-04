package LeetCode;

public class SortColors {
	//Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

	//Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

	//Note:
	//You are not suppose to use the library's sort function for this problem.

	//click to show follow up.

	//Follow up:
	//A rather straight forward solution is a two-pass algorithm using counting sort.
	//First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.

	//Could you come up with an one-pass algorithm using only constant space?
    public void sortColors(int[] A) {
    	int i = 0;
    	int j = A.length - 1;
    	while (i < j)
    	{
    		while (A[j] == 2 && i < j)
    			j--;
    		while (A[i] != 2 && i < j)
    			i++;
    		
    		if (A[i] == 2 && A[j] != 2)
    		{
	    		int tmp = A[i];
	    		A[i] = A[j];
	    		A[j] = tmp;
    		}
    	}
    	
    	i = 0;
    	while (i < j)
    	{
    		while (A[i] == 0 && i < j)
    			i++;
    		while (A[j] == 1 && i < j)
    			j--;
    		
    		if (A[i] == 1 && A[j] == 0)
    		{
	    		int tmp = A[i];
	    		A[i] = A[j];
	    		A[j] = tmp;
    		}
    	}
    }	
}
