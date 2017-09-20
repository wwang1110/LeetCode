/*
Given a non-negative integer, you could swap two digits at most once to get the maximum valued number. Return the maximum valued number you could get.

Example 1:
Input: 2736
Output: 7236
Explanation: Swap the number 2 and the number 7.
Example 2:
Input: 9973
Output: 9973
Explanation: No swap.
Note:
The given number is in the range [0, 108]
 */
package lc.q670.MaximumSwap;

public class Solution {
    public int maximumSwap(int num) {
        char[] arr=Integer.toString(num).toCharArray();
        maxSwap(0, arr);
        return Integer.parseInt(new String(arr));
    }

	private void maxSwap(int idx, char[] arr) {
		if (idx==arr.length)
			return;
		int maxidx=idx;
        for(int i=idx;i<arr.length;i++)
        	if(arr[maxidx]<=arr[i])
        		maxidx=i;
        if(arr[maxidx]!=arr[idx])
        {
        	char c= arr[idx];
        	arr[idx]=arr[maxidx];
        	arr[maxidx]=c;
        	return;
        }
        maxSwap(idx+1, arr);
    }
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.maximumSwap(98368);
    }  
}
