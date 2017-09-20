/* Additive number is a string whose digits can form additive sequence.
 * 
 * A valid additive sequence should contain at least three numbers. Except for the first two numbers, each subsequent number in the sequence must be the sum of the preceding two.
 * 
 * For example:
 * "112358" is an additive number because the digits can form an additive sequence: 1, 1, 2, 3, 5, 8.
 * 
 * 1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8
 * "199100199" is also an additive number, the additive sequence is: 1, 99, 100, 199.
 * 1 + 99 = 100, 99 + 100 = 199
 * Note: Numbers in the additive sequence cannot have leading zeros, so sequence 1, 2, 03 or 1, 02, 3 is invalid.
 * 
 * Given a string containing only digits '0'-'9', write a function to determine if it's an additive number.
 * 
 * Follow up:
 * How would you handle overflow for very large input integers?
 * 
 */

package lc.q0306.AdditiveNumber;

public class Solution {
    public boolean isAdditiveNumber(String num) {
    	
    	int r = (num.length() + 1) / 2;
    	for (int i = 1; i <= r&&i<=10&&i<num.length(); i++)
    		for (int j=i+1; j<=i+r&&j<=i+10&&j<num.length(); j++)
    		{
    			String num1 = num.substring(0, i);
    			String num2 = num.substring(i, j);
    			if (num1.charAt(0) == '0'&&num1.length()>1)
    				continue;
    			if (num2.charAt(0) == '0'&&num2.length()>1)
    				continue;
    			if (isAdditiveNumber(num1, num2, num.substring(j)))
    				return true;
    		}
    	return false;
    }

	private boolean isAdditiveNumber(String num1, String num2, String num) {
		if (num.length() == 0)
			return true;
		String num3 = Long.toString(Long.parseLong(num1) + Long.parseLong(num2));
		if (num.startsWith(num3))
			return isAdditiveNumber(num2, num3, num.substring(num3.length()));
		return false;
	}
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.isAdditiveNumber("1023");
    }	
}
