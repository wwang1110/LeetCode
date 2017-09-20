/*
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth term of the count-and-say sequence.
 *
 * Note: Each term of the sequence of integers will be represented as a string.
 * 
 * Example 1:
 * Input: 1
 * Output: "1"
 * 
 * Example 2:
 * Input: 4
 * Output: "1211"

 */

package lc.q0037.CountAndSay;

public class Solution {
	
	public String countAndSay(int n, String str)
	{
		if (n == 1)
			return str;
		
		int i = 0;
		String newstr = "";
		while (i < str.length())
		{
			int j = i;
			while (j < str.length() && str.charAt(j) == str.charAt(i))
				j ++;
			newstr += (j - i);
			newstr += str.charAt(i);
			
			i = j;
		}
		
		return countAndSay(n - 1, newstr);
	}
	
    public String countAndSay(int n) {
    	
        return countAndSay(n, "1");
    }
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.countAndSay(4);
    }      
}
