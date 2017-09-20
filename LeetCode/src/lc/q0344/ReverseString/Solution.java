/* Write a function that takes a string as input and returns the string reversed.
 * 
 * Example:
 * 
 * Given s = "hello", return "olleh".
 * 
 */
package lc.q0344.ReverseString;

public class Solution {
    public String reverseString(String s) {
    	char[] a = s.toCharArray();
    	int i = 0;
    	int j = a.length-1;
    	while(i < j)
    	{
    		char tmp = a[i];
    		a[i] = a[j];
    		a[j] = tmp;
    		i++;
    		j--;
    	}
    	return new String(a);
    }
}
