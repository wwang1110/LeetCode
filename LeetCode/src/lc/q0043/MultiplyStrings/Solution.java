/* Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2.
 * Note:
 * The length of both num1 and num2 is < 110.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */


package lc.q0043.MultiplyStrings;

public class Solution {
	
	private String multiply(String num1, Character num2)
	{
		String res = "";
		int i = 0;
		int of = 0;
		while(i < num1.length() || of != 0)
		{
			int x = of;
			if (i < num1.length())
			{
				x += (num1.charAt(i) -'0') * (num2 - '0');
				i++;
			}
			of = x / 10;
			res += x % 10;
		}
		return res;
	}
	
	private String add(String num1, String num2)
	{
		String res = "";
		int i = 0;
		int j = 0;
		int of = 0;
		
		while(i < num1.length() || j < num2.length() || of != 0)
		{
			int x = of;
			if (i < num1.length())
			{
				x += num1.charAt(i) - '0';
				i++;
			}
			if (j < num2.length())
			{
				x += num2.charAt(j) - '0';
				j++;
			}
			of = x / 10;
			res += x % 10;
		}
		return res;
	}
	
    public String multiply(String num1, String num2) {
    	
    	if (num1.equals("0") || num2.equals("0"))
    		return "0";
    	
    	String n1 = new StringBuilder(num1).reverse().toString();
    	String n2 = new StringBuilder(num2).reverse().toString();
    	
    	String res = "0";
    	String leadingZero = "";
    	for (int i = 0; i < n2.length(); i ++)
    	{
    		res = add (res, leadingZero + multiply(n1, n2.charAt(i)));
    		leadingZero += "0";
    	}
    	
    	return new StringBuilder(res).reverse().toString();
    }
}
