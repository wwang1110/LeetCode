/* Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.
 * 
 * Please note that the string does not contain any non-printable characters.
 * 
 * Example:
 * Input: "Hello, my name is John"
 * Output: 5
 * 
 */
package lc.q0434.NumberofSegmentsinString;

public class Solution {
	public int countSegments(String s) {
	    int res=0;
	    for(int i=0; i<s.length(); i++)
	        if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' '))
	            res++;        
	    return res;
	}
}
