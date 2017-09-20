/**Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 */

package lc.q0013.RomantoInteger;
import java.util.*;

public class Solution {
    int romanToInt(String s) {
    	
    	Map<Character, Integer> map = new HashMap<Character, Integer>();
    	map.put('M', 1000);
    	map.put('D', 500);
    	map.put('C', 100);
    	map.put('L', 50);
    	map.put('X', 10);
    	map.put('V', 5);
    	map.put('I', 1);
    	
    	int num = 0;
    	int i = 0;
    	while (i < s.length())
    	{
    		if (i + 1 < s.length() && map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
    		{
    			num += map.get(s.charAt(i+1)) - map.get(s.charAt(i));
    			i ++;
    		}
    		else
    			num += map.get(s.charAt(i));
    		i ++;
    	}
    	
    	return num;
    }
}
