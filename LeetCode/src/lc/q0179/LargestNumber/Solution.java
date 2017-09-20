/* Given a list of non negative integers, arrange them such that they form the largest number.
 * 
 * For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.
 * 
 * Note: The result may be very large, so you need to return a string instead of an integer.
 * 
 */

package lc.q0179.LargestNumber;

public class Solution {
    public String largestNumber(int[] nums) {
    	String[] snums = new String[nums.length];
    	for(int i = 0; i<nums.length; i++)
    		snums[i] = Integer.toString(nums[i]);
    	for (int i=0; i<nums.length;i++)
    		for (int j=i;j<nums.length;j++)
    		{
    			if (compareTo(snums[i], snums[j]) < 0)
    			{
    				String tmp = snums[i];
    				snums[i] = snums[j];
    				snums[j] = tmp;
    			}
    		}
    	
    	String res = "";
    	for (int i = 0; i < snums.length; i++)
    		res += snums[i];
    	
    	int i = 0;
    	while (i < res.length() && res.charAt(i) == '0')
    		i++;
    	
    	res = res.substring(i);
    	return res.equals("")?"0":res;
    }
    int compareTo(String str1, String str2)
    {
        String s1 = str1 + str2;
		String s2 = str2 + str1;
		return s1.compareTo(s2); // reverse order here, so we can do append() later
	}
}
