package LeetCode;

import java.util.ArrayList;
import java.util.Stack;

public class LargestRectangleinHistogram {
	//Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, 
	//find the area of largest rectangle in the histogram.
	//For example,
	//Given height = [2,1,5,6,2,3],
	//return 10.
    public int largestRectangleArea(int[] height) {

    	int ret = 0;
    	ArrayList<Integer> arr = new ArrayList<Integer>();

    	arr.add(0);
    	for (int i = 0; i < height.length; i++)
    		arr.add(height[i]);
    	arr.add(0);
    	
    	Stack<Integer> hei = new Stack<Integer>();
    	Stack<Integer> idx = new Stack<Integer>();
    	
    	for (int i = 0; i < arr.size(); i++)
    	{
    		if (hei.isEmpty() || hei.peek() < arr.get(i))
    		{
    			hei.push(arr.get(i));
    			idx.push(i);
    		}
    		else if (hei.peek() > arr.get(i))
    		{
    			int start = -1;
    			while (hei.peek() > arr.get(i))
    			{
        			start = idx.pop();
    				ret = Math.max(ret, (i - start) * hei.pop());
    			}
    			
    			hei.push(arr.get(i));
    			idx.push(start);
    		}
    	}
        return ret;
    }	
}
