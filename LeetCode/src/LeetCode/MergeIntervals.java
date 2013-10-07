package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class IntervalComparator implements Comparator<Interval> {
	public final int compare(Interval first, Interval second)
	{
		if (first.start > second.start)
			return 1;
		if (first.start < second.start)
			return -1;
		return 0;
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
    	int merged[] = new int[len];
    	for (int i = 0; i < len; i++)
    	{
    		if (merged[i] == 0)
    		{
        		Interval interval = intervals.get(i);
        		merged[i] = 1;
        		for (int j = i + 1; j < len; j++)
        		{
        			if (merged[j] == 0 && isOverLapped(interval, intervals.get(j)))
        			{
        				//merge
        				interval.start = Math.min(interval.start, intervals.get(j).start);
        				interval.end = Math.max(interval.end, intervals.get(j).end);
        				merged[j] = 1;
        			}
        		}
    			ret.add(interval);
    		}
    	}
    	return ret;
    }	
}
