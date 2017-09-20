/* Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.
 * 
 * If the fractional part is repeating, enclose the repeating part in parentheses.
 * 
 * For example,
 * 
 * Given numerator = 1, denominator = 2, return "0.5".
 * 
 * Given numerator = 2, denominator = 1, return "2".
 * 
 * Given numerator = 2, denominator = 3, return "0.(6)".
 * 
 */

package lc.q0166.FractiontoRecurringDecimal;

import java.util.*;

public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
    	if (numerator == 0)
    		return "0";
    	
    	StringBuilder res = new StringBuilder();
    	
    	if ((numerator > 0) ^ (denominator > 0) == true)
    		res.append("-");
    	long reminder = Math.abs((long)numerator);
    	long den = Math.abs((long)denominator);
    	
    	res.append(reminder/den);
    	reminder = reminder % den;
    	
    	if (reminder == 0)
    		return res.toString();
    	
    	res.append(".");
    	Map<Long, Integer> map = new HashMap<Long,Integer>();
    	map.put(reminder, res.length());
    	while (reminder > 0)
    	{
    		reminder *= 10;
    		res.append(reminder/den);
    		reminder %= den;
    		if (map.containsKey(reminder))
    		{
    			int idx = map.get(reminder);
    			res.insert(idx, "(");
    			res.append(")");
    			break;
    		}
    		
    		map.put(reminder, res.length());
    	}
    	
    	return res.toString();
    }
}
