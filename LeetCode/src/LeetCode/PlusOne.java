package LeetCode;

import java.util.ArrayList;
import java.util.Collections;

public class PlusOne {
	//Given a number represented as an array of digits, plus one to the number.
    public int[] plusOne(int[] digits) {
    	int flow = 0;
        // Note: The Solution object is instantiated only once and is reused by each test case.
    	ArrayList<Integer> ret = new ArrayList<Integer>(); 
    	int len = digits.length;
    	int i = len - 1;
    	digits[len - 1]++;
    	
    	while (i >= 0)
    	{
    		int num = digits[i] + flow;
    		ret.add(num % 10);
    		flow = num / 10;
    		i--;
    	}
        
    	if (flow > 0)
    		ret.add(1);
    	
    	int ndigists[] = new int[ret.size()];
    	int l = ret.size();
    	for (int k = 0; k < l; k++)
    		ndigists[l - 1 - k] = ret.get(k);
    	
    	return ndigists;
    }	
}
