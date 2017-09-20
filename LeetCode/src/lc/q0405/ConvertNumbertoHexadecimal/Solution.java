/* Given an integer, write an algorithm to convert it to hexadecimal. For negative integer, two’s complement method is used.
 * 
 * Note:
 * 
 * All letters in hexadecimal (a-f) must be in lowercase.
 * The hexadecimal string must not contain extra leading 0s. If the number is zero, it is represented by a single zero character '0'; otherwise, the first character in the hexadecimal string will not be the zero character.
 * The given number is guaranteed to fit within the range of a 32-bit signed integer.
 * You must not use any method provided by the library which converts/formats the number to hex directly.
 * 
 * Example 1:
 * Input:
 * 26
 * Output:
 * "1a"
 * 
 * Example 2:
 * Input:
 * -1
 * Output:
 * "ffffffff"
 */
package lc.q0405.ConvertNumbertoHexadecimal;

public class Solution {
    public String toHex(int num) {
    	long n=num;
    	if(n==0)
    		return "0";
    	if (n<0)
    		n=0x100000000L+n;
    	StringBuilder sb = new StringBuilder();
    	while(n>0)
    	{
    		long reminder=n%16;
    		if(reminder==10)
    			sb.insert(0,'a');
    		else if (reminder==11)
    			sb.insert(0,'b');
    		else if (reminder==12)
    			sb.insert(0,'c');
    		else if (reminder==13)
    			sb.insert(0,'d');
    		else if (reminder==14)
    			sb.insert(0,'e');
    		else if (reminder==15)
    			sb.insert(0,'f');
    		else
    			sb.insert(0,Long.toString(reminder));
    		n/=16;
    	}
    	return sb.toString();
    }
}
