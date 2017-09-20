/* Given a string containing only digits, restore it by returning all possible valid IP address combinations.
 * 
 * For example:
 * 
 * Given "25525511135",
 * 
 * return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
 * 
 */

package lc.q0093.RestoreIPAddresses;

import java.util.*;

public class Solution {
    public List<String> restoreIpAddresses(String s) {
    	List<String> res = new ArrayList<String>();
    	if (s.length() < 4 ||s.charAt(0) == '0')
    		return res;
    	
    	generateIpAddress(0, 0, "", res, s);
    	
    	return res;
    }

	private void generateIpAddress(int i, int step, String str, List<String> res, String s) {
		if (i == s.length() && step == 4)
		{
			res.add(str.substring(0, str.length()-1));
			return;
		}

		if (i >= s.length() || step == 4)
            return;

		generateIpAddress(i+1, step+1, str+s.charAt(i)+'.', res, s);
		
		if (s.charAt(i) == '0')
			return;
		
		if (i+1 < s.length())
			generateIpAddress(i+2, step+1, str+s.charAt(i)+s.charAt(i+1) + '.', res, s);
		
		if (i+2 < s.length())
		{
			int sum = (s.charAt(i)-'0') * 100 + (s.charAt(i+1)-'0') * 10 + s.charAt(i+2)-'0';
			if (sum <=255)
				generateIpAddress(i+3, step+1, str+s.charAt(i)+s.charAt(i+1) + s.charAt(i+2) + '.', res, s);
		}
	}
}
