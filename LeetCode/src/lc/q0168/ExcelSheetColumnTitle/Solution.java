/* Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 * 
 * For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
 * 
 */

package lc.q0168.ExcelSheetColumnTitle;

public class Solution {
    public String convertToTitle(int n) {
    	if (n <= 0)
    		return "";
    	
    	StringBuilder sb = new StringBuilder();
    	do {
        	n--;
    		sb.insert(0, Character.toChars('A' + n % 26));
    		n /= 26;
    	}while (n > 0);
    	
    	return sb.toString();
    }
}
