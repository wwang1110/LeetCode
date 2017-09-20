/* Implement strStr().
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
*/

package lc.q0028.ImplementstrStr;

public class Solution {
    public int strStr(String haystack, String needle) {
    	int idx = -1;
    	
    	int len = needle.length();
    	int i = 0;
    	
    	while (i < haystack.length() - len + 1)
    	{
    		int j = 0;
    		while (j < len)
    		{
    			if (needle.charAt(j) != haystack.charAt(i + j))
    				break;
    			j ++;
    		}
    				
    		if (j == len)
    			return i;
    		
    		i ++;
    	}
    	
    	return idx;
    }
}
