/* A magical string S consists of only '1' and '2' and obeys the following rules:
 * The string S is magical because concatenating the number of contiguous occurrences of characters '1' and '2' generates the string S itself.
 * The first few elements of string S is the following: S = "1221121221221121122……"
 * If we group the consecutive '1's and '2's in S, it will be:
 * 1 22 11 2 1 22 1 22 11 2 11 22 ......
 * and the occurrences of '1's or '2's in each group are:
 * 1 2	2 1 1 2 1 2 2 1 2 2 ......
 * You can see that the occurrence sequence above is the S itself.
 * Given an integer N as input, return the number of '1's in the first N number in the magical string S.
 *Note: N will not exceed 100,000.
 *
 *Example 1:
 *Input: 6
 *Output: 3
 *Explanation: The first 6 elements of magical string S is "12211" and it contains three 1's, so return 3.
 * 
 */
package lc.q0481.MagicalString;

public class Solution {
    public int magicalString(int n) {
    	if(n==0)
    		return 0;
    	if(n<3)
    		return 1;
    	int[] arr=new int[n+1];
    	arr[0]=1;
    	arr[1]=2;
    	arr[2]=2;
    	int i=2;
    	int j=3;
    	while(j<n)
    	{
    		int num=arr[j-1]==1?2:1;
    		if(arr[i]==1)
    		{
    			arr[j]=num;
    			j++;
    		}
    		else
    		{
    			arr[j]=num;
    			j++;
    			arr[j]=num;
    			j++;
    		}
			i++;
    	}
    	int count=0;
    	for(int k=0;k<n;k++)
    		if(arr[k]==1)
    			count++;
    	return count;
    }
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.magicalString(7);
    }
}
