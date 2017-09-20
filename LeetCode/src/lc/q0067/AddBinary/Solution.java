/* Given two binary strings, return their sum (also a binary string).
 * For example,
 * a = "11"
 * b = "1"
 * Return "100".
 */

package lc.q0067.AddBinary;

public class Solution {
    public String addBinary(String a, String b) {
    	
    	int i = a.length() - 1;
    	int j = b.length() - 1;
    	
    	int of = 0;
    	String res = "";
    	while (i >= 0 || j >= 0 || of > 0)
    	{
    		int sum = of;
    		
    		if (i >= 0)
    		{
    			sum += (a.charAt(i)-'0');
    			i--;
    		}
    		
    		if (j >= 0)
    		{
    			sum += (b.charAt(j)-'0');
    			j--;
    		}

    		res = sum % 2 + res;
    		
    		of = sum / 2;
    	}
    	
    	return res;
    }
}
