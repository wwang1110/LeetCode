/* Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
 * 
 * Note:
 * The length of both num1 and num2 is < 5100.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.
 * 
 */

package lc.q0415.AddStrings;

public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int extra = 0;
        int i=num1.length()-1;
        int j=num2.length()-1;
        while(i>=0||j>=0||extra!=0)
        {
        	int sum=extra;
        	if(i>=0)
        	{
        		sum+=num1.charAt(i)-'0';
        		i--;
        	}
        	if(j>=0)
        	{
        		sum+=num2.charAt(j)-'0';
        		j--;
        	}
        	sb.insert(0, Integer.toString(sum%10));
        	extra=sum/10;
        }
        return sb.toString();
    }
}
