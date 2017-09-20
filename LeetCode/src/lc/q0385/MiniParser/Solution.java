/* Given a nested list of integers represented as a string, implement a parser to deserialize it.
 * 
 * Each element is either an integer, or a list -- whose elements may also be integers or other lists.
 * 
 * Note: You may assume that the string is well-formed:
 * 
 * String is non-empty.
 * String does not contain white spaces.
 * String contains only digits 0-9, [, - ,, ].
 * Example 1:
 * 
 * Given s = "324",
 * You should return a NestedInteger object which contains a single integer 324.
 * 
 * Example 2:
 * Given s = "[123,[456,[789]]]",
 * 
 * Return a NestedInteger object containing a nested list with 2 elements:
 * 1. An integer containing value 123.
 * 2. A nested list containing two elements:
 *     i.  An integer containing value 456.
 *     ii. A nested list with one element:
 *        a. An integer containing value 789.
 * 
 */

package lc.q0385.MiniParser;

import lc.NestedInteger;

public class Solution {
    public NestedInteger deserialize(String s) {
        NestedInteger res = new NestedInteger();
        if (s == null || s.length() == 0) return res;
        if (s.charAt(0) != '[') {
            res.setInteger(Integer.parseInt(s));
            return res;
        }
        int i=1;
        int j=1;
        while(s.length()>2&&j<s.length())
        {
        	if (j==s.length()-1||s.charAt(j)==',')
        	{
        		NestedInteger item = deserialize(s.substring(i, j));
        		res.add(item);
        		j++;
        		i=j;
        	}
        	else if(s.charAt(j)=='[')
        	{
        		int l=0;
        		do
        		{
        			if (s.charAt(j)=='[')l++;
        			else if(s.charAt(j)==']')l--;
        			j++;
        		}
        		while(l>0);
        	}
        	else
        		j++;
        }
        return res;
    }
    
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.deserialize("[123,456,[788,799,833],[[]],10,[]]");
    }    
}
