/* Related to question Excel Sheet Column Title
 * 
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * 
 * For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
 * 
 */

package lc.q0171.ExcelSheetColumnNumber;

public class Solution {
    public int titleToNumber(String s) {
    	int i = 0;
    	int res = 0;
    	
    	while (i < s.length())
    	{
    		int num = s.charAt(i) -'A' + 1;
    		res = res * 26 + num;
    		i++;
    	}
    	
    	return res;
    }
}
