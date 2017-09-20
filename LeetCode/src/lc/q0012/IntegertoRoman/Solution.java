/** Given an integer, convert it to a roman numeral.
 * Input is guaranteed to be within the range from 1 to 3999.
 */

package lc.q0012.IntegertoRoman;

public class Solution {
    public String intToRoman(int num) {
    	
    	if (num <= 0 || num > 3999)
    		return "";
    	
    	String tb = "IVXLCDM";
    	StringBuilder sb = new StringBuilder();
    	
    	int i = 3;
    	int div = 1000;
    	
    	while (num > 0)
    	{
    		int x = num / div;
    		num = num % div;
    		
    		if (x == 9)
    		{
    			sb.append(tb.charAt(i * 2));
    			sb.append(tb.charAt(i * 2 + 2));
    			x -= 9;
    		}
    		
    		if (x >= 5)
    		{
    			sb.append(tb.charAt(i * 2 + 1));
    			x -= 5;
    		}
    		
    		if (x == 4)
    		{
    			sb.append(tb.charAt(i * 2));
    			sb.append(tb.charAt(i * 2 + 1));
    			x -= 9;
    		}
    		
    		while (x > 0)
    		{
    			sb.append(tb.charAt(i * 2));
    			x --;
    		}
    		
    		div /= 10;
    		i --;
    	}
    	
    	return sb.toString();
    }
    
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	String ret = s.intToRoman(3945);
    	System.out.println(ret);
    }    
}
