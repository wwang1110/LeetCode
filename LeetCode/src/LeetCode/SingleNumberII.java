package LeetCode;

public class SingleNumberII {
	//Given an array of integers, every element appears three times except for one. Find that single one.
	//Note:
	//Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
    public int singleNumber(int[] A) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
    	int num[] = new int[32];
    	for (int i = 0; i < A.length; i++)
    	{
    		int a = A[i];
    		int j = 0;
    		do
    		{
    			num[j++] += a & 1;
    			a =(a >>> 1);
    		}
    		while (a != 0);
    	}
    	
    	int ret = 0;
    	for (int i = 31; i >= 0; i--)
    		ret = ret * 2 + (num[i] % 3);
    	
        return ret;
    }	
}
