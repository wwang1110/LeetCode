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
    	if (n == 0)
    		return ret;
    	
    	int num[] = new int[n];
    	
    	int x = 0;
    	do
    	{
    		ret.add(x);
    		x = nextNum(num);
    	}
    	while (x != 0);
    	
    	return ret;
    }
    
	private int nextNum(int num[])
	{
		if (num[0] == 0)
		{
			int i = num.length - 1;
			while (num[i] == 1)
				i--;
			num[i] = 1;
		}
		else
		{
			int i = num.length - 1;
			while (num[i] == 0)
				i--;
			num[i] = 0;
		}
		return toInt(num);
	}
	
	private int toInt(int num[])
	{
		int number = 0;
		for (int i = 0; i < num.length; i++)
			number = number * 2 + num[i];
		return number;
	}
}
