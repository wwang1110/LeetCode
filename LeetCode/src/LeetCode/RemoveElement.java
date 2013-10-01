package LeetCode;

public class RemoveElement {
	//Given an array and a value, remove all instances of that value in place and return the new length.

	//The order of elements can be changed. It doesn't matter what you leave beyond the new length.
	
    public int removeElement(int[] A, int elem) {
    	int i = 0;
    	int j = A.length - 1;
    	while (i <= j)
    	{
    		while (A[i] == elem && i <= j)
    			A[i] = A[j--];
    		i++;
    	}
    	return j + 1;
    }	
}
