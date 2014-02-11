package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class IntervalComparator implements Comparator<Interval> {
	public final int compare(Interval first, Interval second)
	{
		return first.start - second.start;
	}

}
public class MergeIntervals {
	//Given a collection of intervals, merge all overlapping intervals.

	//For example,
	//Given [1,3],[2,6],[8,10],[15,18],
	//return [1,6],[8,10],[15,18].
	private boolean isOverLapped(Interval i1, Interval i2)
	{
		if (i1.start <= i2.end && i1.end >= i2.start)
			return true;
		return false;
	}
	
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
    	Collections.sort(intervals, new IntervalComparator());
    	ArrayList<Interval> ret = new ArrayList<Interval>();
    	int len = intervals.size();
    	for (int i = 0; i < len; i++)
    	{
    		Interval interval = intervals.get(i);
    		while (i + 1 < len && isOverLapped(interval, intervals.get(i + 1)))
    		{
				//merge
				interval.start = Math.min(interval.start, intervals.get(i + 1).start);
				interval.end = Math.max(interval.end, intervals.get(i + 1).end);
				i++;
    		}
			ret.add(interval);
    	}
    	return ret;
    }	
}
