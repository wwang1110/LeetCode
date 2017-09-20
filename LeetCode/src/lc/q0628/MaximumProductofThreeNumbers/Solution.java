/* Given an integer array, find three numbers whose product is maximum and output the maximum product.
 * Example 1:
 * Input: [1,2,3]
 * Output: 6
 * Example 2:
 * Input: [1,2,3,4]
 * Output: 24
 * Note:
 * The length of the given array will be in range [3,104] and all elements are in the range [-1000, 1000].
 * Multiplication of any three numbers in the input won't exceed the range of 32-bit signed integer.
 * 
 */
package lc.q0628.MaximumProductofThreeNumbers;

import java.util.*;

public class Solution {
    public int maximumProduct(int[] nums) {
        PriorityQueue<Integer> minheap=new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxheap=new PriorityQueue<Integer>((a,b)->b-a);
        for(int i=0;i<nums.length;i++)
        {
        	if(minheap.size()<3)
        		minheap.add(nums[i]);
        	else if(nums[i]>minheap.peek())
        	{
        		minheap.poll();
        		minheap.add(nums[i]);
        	}
        	if(maxheap.size()<2)
        		maxheap.add(nums[i]);
        	else if(nums[i]<maxheap.peek())
        	{
        		maxheap.poll();
        		maxheap.add(nums[i]);
        	}
        }
        int n3=minheap.poll();
        int n2=minheap.poll();
        int n1=minheap.poll();
        return Math.max(n1*maxheap.poll()*maxheap.poll(), n1*n2*n3);
    }
}
