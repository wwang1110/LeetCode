/* Given two arrays, write a function to compute their intersection.
 * 
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 * 
 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 * 
 */

package lc.q0349.IntersectionofTwoArrays;

import java.util.*;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        
        for (int num: nums1)
        	set.add(num);
        
        Set<Integer> res = new HashSet<Integer>();
        for(int num: nums2)
        	if(set.contains(num))
        		res.add(num);

        int[] r = new int[res.size()];
        int i = 0;
        for (int n: res)
        	r[i++] = n;
        return r;
    }
}
