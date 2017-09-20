/* Given two strings representing two complex numbers.
 * 
 * You need to return a string representing their multiplication. Note i2 = -1 according to the definition.
 * Example 1:
 * Input: "1+1i", "1+1i"
 * Output: "0+2i"
 * Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.
 * 
 * Example 2:
 * Input: "1+-1i", "1+-1i"
 * Output: "0+-2i"
 * Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
 * Note:
 * The input strings will not have extra blank.
 * The input strings will be given in the form of a+bi, where the integer a and b will both belong to the range of [-100, 100]. And the output should be also in this form.
 * 
 */

package lc.q0537.ComplexNumberMultiplication;

public class Solution {
	class ComplexNumber{
		public int a;
		public int b;
		public ComplexNumber(String str)
		{
			String[] nums=str.substring(0, str.length()-1).split("\\+");
			a=Integer.parseInt(nums[0]);
			b=Integer.parseInt(nums[1]);
		}
	}
    public String complexNumberMultiply(String a, String b) {
    	ComplexNumber numA=new ComplexNumber(a);
    	ComplexNumber numB=new ComplexNumber(b);
    	int na=numA.a*numB.a-numA.b*numB.b;
    	int nb=numA.a*numB.b+numA.b*numB.a;
    	return Integer.toString(na)+"+"+Integer.toString(nb)+"i";
    }
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.complexNumberMultiply("1+1i","1+1i");
    }
}
