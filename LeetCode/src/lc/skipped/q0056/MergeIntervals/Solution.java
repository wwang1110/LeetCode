/* Given a collection of intervals, merge all overlapping intervals.
 * For example,
 * Given [1,3],[2,6],[8,10],[15,18],
 * return [1,6],[8,10],[15,18].
 * 
 */

package lc.skipped.q0056.MergeIntervals;

import java.util.*;

import lc.Interval;

public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
    	List<Interval> res = new ArrayList<Interval>();
    	
    	intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
    	
    	return res;
    }
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	List<Interval> list = new ArrayList<Interval>();
    	list.add(new Interval(1, 3));
    	list.add(new Interval(2, 6));
    	list.add(new Interval(8, 10));
    	list.add(new Interval(15, 18));
    	s.merge(list);
    }    
}
