package LeetCode;

public class SingleNumber {
	//Given an array of integers, every element appears twice except for one. Find that single one.

	//Note:
	//Your algorithm should have a linear runtime complexity. Could you implement it without using extra memor
    public int singleNumber(int[] A) {
    	int sum = 0;
    	for (int i = 0; i < A.length; i++)
    		sum = sum ^ A[i];
    	return sum;
    }	
}
