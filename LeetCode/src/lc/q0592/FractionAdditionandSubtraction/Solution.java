/* Given a string representing an expression of fraction addition and subtraction, you need to return the calculation result in string format. The final result should be irreducible fraction. If your final result is an integer, say 2, you need to change it to the format of fraction that has denominator 1. So in this case, 2 should be converted to 2/1.
 * 
 * Example 1:
 * Input:"-1/2+1/2"
 * Output: "0/1"
 * 
 * Example 2:
 * Input:"-1/2+1/2+1/3"
 * Output: "1/3"
 * 
 * Example 3:
 * Input:"1/3-1/2"
 * Output: "-1/6"
 * 
 * Example 4:
 * Input:"5/3+1/3"
 * Output: "2/1"
 * Note:
 * The input string only contains '0' to '9', '/', '+' and '-'. So does the output.
 * Each fraction (input and output) has format ±numerator/denominator. If the first input fraction or the output is positive, then '+' will be omitted.
 * The input only contains valid irreducible fractions, where the numerator and denominator of each fraction will always be in the range [1,10]. If the denominator is 1, it means this fraction is actually an integer in a fraction format defined above.
 * The number of given fractions will be in the range [1,10].
 * The numerator and denominator of the final result are guaranteed to be valid and in the range of 32-bit int.
 * 
 */
package lc.q0592.FractionAdditionandSubtraction;

import java.util.*;

public class Solution {
	class Fraction
	{
		public long numerator;
		public long denominator;
		public Fraction(String str)
		{
			String[] t=str.split("\\/");
			numerator=Long.parseLong(t[0]);
			denominator=Long.parseLong(t[1]);
		}
		public Fraction(long num, long deno)
		{
			numerator=num;
			denominator=deno;
		}
	}
    public String fractionAddition(String expression) {
    	if(expression.length()==0)
    		return "0/1";
        List<Fraction> facs=new ArrayList<Fraction>();
        for(int i=0,j=1;j<=expression.length();j++)
        {
        	if(j==expression.length()||expression.charAt(j)=='+'||expression.charAt(j)=='-')
        	{
        		facs.add(new Fraction(expression.substring(i, j)));
        		i=j;
        	}
        }
        Fraction ret= facs.get(0);
        for(int i=1;i<facs.size();i++)
        	ret=AddFraction(ret, facs.get(i));
        
        return Long.toString(ret.numerator)+"/"+Long.toString(ret.denominator);
    }
	private Fraction AddFraction(Fraction ret, Fraction f) {
		long deno=ret.denominator*f.denominator;
		long num=ret.numerator*f.denominator+f.numerator*ret.denominator;
        long div=deno;
		if(num!=0)
		    div=divisor(deno, Math.abs(num));
		return new Fraction(num/div,deno/div);
	}
	private long divisor(long dono, long num) {
		if(dono<num)
		{
			long t= dono;
			dono=num;
			num=t;
		}
		if(dono%num==0)
			return num;
		return divisor(num, dono%num);
	}
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.fractionAddition("-4/7-3/4+2/3");
    }
}
