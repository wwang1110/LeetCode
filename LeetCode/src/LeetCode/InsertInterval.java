package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class InsertIntervalComparator implements Comparator<Interval>
{
	@Override
	public int compare(Interval arg0, Interval arg1) {
		return arg0.start - arg1.start;
	}
}

public class InsertInterval {
	//Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

	//You may assume that the intervals were initially sorted according to their start times.

	//Example 1:
	//Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9].

	//Example 2:
	//Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] in as [1,2],[3,10],[12,16].

	//This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
    	ArrayList<Interval> ret = new ArrayList<Interval>();
    	
    	Iterator<Interval> iter = intervals.iterator();

    	while (iter.hasNext())
    	{
    		Interval iterval = iter.next();
    		if (iterval.end < newInterval.start || iterval.start > newInterval.end)
    			ret.add(iterval);
    		else
    		{
    			newInterval.start = Math.min(newInterval.start, iterval.start);
    			newInterval.end = Math.max(newInterval.end, iterval.end);
    		}
    	}
    	
    	ret.add(newInterval);
    	
    	Collections.sort(ret, new InsertIntervalComparator());
    	return ret;
    }
}
