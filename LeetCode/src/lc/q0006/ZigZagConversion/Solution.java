/**The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 * 
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */

package lc.q0006.ZigZagConversion;

public class Solution {
    public String convert(String s, int numRows) {
    	
    	int div = 2 * numRows - 2;
    	
    	if (div <= 0)
    		return s; 
    	
    	StringBuilder sb = new StringBuilder();
    	
    	for (int i = 0; i < numRows; i ++)
    	{
    		for (int j = 0; j < s.length(); j ++)
    		{
    			int r = j % div;
    			if (r == i || r == div - i)
    				sb.append(s.charAt(j));
    		}
    	}
    	
    	return sb.toString();
    }
}
