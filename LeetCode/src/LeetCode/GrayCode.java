package LeetCode;

import java.util.ArrayList;

public class GrayCode {
	//The gray code is a binary numeral system where two successive values differ in only one bit.

	//Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.

	//For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:

	//00 - 0
	//01 - 1
	//11 - 3
	//10 - 2
	//Note:
	//For a given n, a gray code sequence is not uniquely defined.

	//For example, [0,2,3,1] is also a valid gray code sequence according to the above definition.

	//For now, the judge is able to judge based on one instance of gray code sequence. Sorry about that.
    public ArrayList<Integer> grayCode(int n) {
    	ArrayList<Integer> ret = new ArrayList<Integer>();
    	ArrayList<String> arr = new ArrayList<String>();
    	arr.add("0");
    	arr.add("0");
    	arr.add("1");
    	for (int i = 2; i <= n; i++)
    	{
    		int idx_begin = (int)(Math.pow(2, i - 1) - 1);
    		int idx_end = (int)(Math.pow(2, i) - 1);
    		for (int j = idx_begin; j < idx_end; j++)
    			arr.add("0" + arr.get(j));
    		for (int j = idx_end - 1; j >= idx_begin; j--)
    			arr.add("1" + arr.get(j));
    	}
		int ibegin = (int)(Math.pow(2, n) - 1);
		int iend = (int)(Math.pow(2, n + 1) - 1);
		for (int i = ibegin; i < iend; i++)
		{
			String str = arr.get(i);
			int num = 0;
			int idx = 0;
			while (idx < str.length())
				num = num * 2 + (str.charAt(idx++) - '0');
			ret.add(num);
		}
    	return ret;
    }
}
