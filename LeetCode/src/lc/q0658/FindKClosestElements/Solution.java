/*
Given a sorted array, two integers k and x, find the k closest elements to x in the array. The result should also be sorted in ascending order. If there is a tie, the smaller elements are always preferred.

Example 1:
Input: [1,2,3,4,5], k=4, x=3
Output: [1,2,3,4]
Example 2:
Input: [1,2,3,4,5], k=4, x=-1
Output: [1,2,3,4]
Note:
The value k is positive and will always be smaller than the length of the sorted array.
Length of the given array is positive and will not exceed 104
Absolute value of elements in the array and x will not exceed 104
 */
package lc.q0658.FindKClosestElements;

import java.util.*;

public class Solution {
    public List<Integer> findClosestElements(List<Integer> arr, int k, int x) {
        int l=0;
        int r=arr.size()-1;
        while(l+k<=r)
        {
        	if(x-arr.get(l)>arr.get(r)-x)
        		l++;
        	else
        		r--;
        }
        List<Integer> ret= new ArrayList<Integer>();
        for(int i=l;i<=r;i++)
        	ret.add(arr.get(i));
        return ret;
    }
}
