/* Given an integer, return its base 7 string representation.
 * 
 * Example 1:
 * Input: 100
 * Output: "202"
 * 
 * Example 2:
 * Input: -7
 * Output: "-10"
 * Note: The input will be in range of [-1e7, 1e7].
 * 
 */

package lc.q0504.Base7;

public class Solution {
    public String convertToBase7(int num) {
    	if(num==0)
    		return "0";
    	else if(num<0)
    		return "-"+convertToBase7(-num);
    	
    	StringBuilder sb=new StringBuilder();
    	while(num>0)
    	{
    		sb.insert(0, num%7);
    		num /= 7;
    	}
    	return sb.toString();
    }
}
